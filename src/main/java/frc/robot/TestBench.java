package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class TestBench {
    static final int NUM_NEOS = 8;
    static final int NUM_FALCONS = 4;

    // declaring the Neos
    private CANSparkMax[] neos = new CANSparkMax[ NUM_NEOS ];
    private RelativeEncoder[] neoEncoders = new RelativeEncoder[ NUM_NEOS ];

    // declaring the Falcons
    private TalonFX[] falcons = new TalonFX[ NUM_FALCONS ];

    public TestBench(){
        for (int iN=0; iN < NUM_NEOS; iN++) {
            // CAN IDs should start at 1
            int canId = iN + 1;
            neos[iN] = new CANSparkMax(canId, MotorType.kBrushless);
            neoEncoders[iN] = neos[iN].getEncoder();
            SmartDashboard.putNumber("NEO " + canId + " Volt", 0);
            SmartDashboard.putNumber("NEO " + canId + " Faults", 0);
            SmartDashboard.putNumber("NEO " + canId + " RPM", 0);
        }

        for (int iF=0; iF < NUM_FALCONS; iF++) {
            // CAN IDs should start at 1
            int canId = iF + 1;
            falcons[iF] = new TalonFX(canId); 
            SmartDashboard.putNumber("Falcon " + canId + " Volt", 0);
            // SmartDashboard.putNumber("Falcon " + canId + " RPM", 0);
        }
    }

    public void runTestBench(){
        for (int iN=0; iN < NUM_NEOS; iN++) {
            // CAN IDs should start at 1
            int canId = iN + 1;
            neos[iN].setVoltage(SmartDashboard.getNumber("NEO " + canId + " Volt", 0));
            SmartDashboard.putNumber("NEO " + canId + " Faults", neos[iN].getFaults());
            SmartDashboard.putNumber("NEO " + canId + " RPM", neoEncoders[iN].getVelocity());
        }

        for (int iF=0; iF < NUM_FALCONS; iF++) {
            // CAN IDs should start at 1
            int canId = iF + 1;
            falcons[iF].set(ControlMode.PercentOutput, SmartDashboard.getNumber("Falcon " + canId + " Volt", 0) / 12.0);
            // SmartDashboard.putNumber("Falcon " + canId + " RPM", 0);
        }
    }
}
