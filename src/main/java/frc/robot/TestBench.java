package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class TestBench {
    static final int NUM_NEOS = 8;
    static final int NUM_FALCONS = 4;

    // declaring the Neos
    private SparkMax[] m_neos = new SparkMax[ NUM_NEOS ];
    // private RelativeEncoder[] neoEncoders = new RelativeEncoder[ NUM_NEOS ];

    // declaring the Falcons
    private TalonFX[] m_falcons = new TalonFX[ NUM_FALCONS ];

    public TestBench(){
        for (int iN=0; iN < NUM_NEOS; iN++) {
            // CAN IDs should start at 1
            int canId = iN + 1;
            m_neos[iN] = new SparkMax(canId, MotorType.kBrushless);
            // neoEncoders[iN] = neos[iN].getEncoder();
            SmartDashboard.putNumber("NEO " + canId + " Volt", 0);
            SmartDashboard.putString("NEO " + canId + " Faults", "");
            // SmartDashboard.putNumber("NEO " + canId + " RPM", 0);
        }

        for (int iF=0; iF < NUM_FALCONS; iF++) {
            // CAN IDs should start at 1
            int canId = iF + 1;
            m_falcons[iF] = new TalonFX(canId); 
            SmartDashboard.putNumber("Falcon " + canId + " Volt", 0);
            // SmartDashboard.putNumber("Falcon " + canId + " RPM", 0);
        }
    }

    public void runTestBench(){
        for (int iN=0; iN < NUM_NEOS; iN++) {
            // CAN IDs should start at 1
            int canId = iN + 1;
            m_neos[iN].setVoltage(SmartDashboard.getNumber("NEO " + canId + " Volt", 0));
            SmartDashboard.putString("NEO " + canId + " Faults", m_neos[iN].getFaults().toString());
            // SmartDashboard.putNumber("NEO " + canId + " RPM", neoEncoders[iN].getVelocity());
        }

        for (int iF=0; iF < NUM_FALCONS; iF++) {
            // CAN IDs should start at 1
            int canId = iF + 1;
            m_falcons[iF].set(SmartDashboard.getNumber("Falcon " + canId + " Volt", 0) / 12.0);
            // SmartDashboard.putNumber("Falcon " + canId + " RPM", 0);
        }
    }
}
