package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class TestBench {
    // declaring the Falcons
    private TalonFX talon1 = new TalonFX(1);
    private TalonFX talon2 = new TalonFX(2); 
    private TalonFX talon3 = new TalonFX(3);
    private TalonFX talon4 = new TalonFX(4);
    private TalonFX talon5 = new TalonFX(5);
    private TalonFX talon6 = new TalonFX(6);

    // declaring the Neos
    private CANSparkMax neo1 = new CANSparkMax(1, MotorType.kBrushless);
    private CANSparkMax neo2 = new CANSparkMax(2, MotorType.kBrushless); 
    private CANSparkMax neo3 = new CANSparkMax(3, MotorType.kBrushless);
    private CANSparkMax neo4 = new CANSparkMax(4, MotorType.kBrushless);
    private CANSparkMax neo5 = new CANSparkMax(5, MotorType.kBrushless);
    private CANSparkMax neo6 = new CANSparkMax(6, MotorType.kBrushless);

    public TestBench(){
        SmartDashboard.putNumber("NEO 1 Volt", 0);
        SmartDashboard.putNumber("NEO 2 Volt", 0);
        SmartDashboard.putNumber("NEO 3 Volt", 0);
        SmartDashboard.putNumber("NEO 4 Volt", 0);
        SmartDashboard.putNumber("NEO 5 Volt", 0);
        SmartDashboard.putNumber("NEO 6 Volt", 0);

        SmartDashboard.putNumber("Falcon 1 Volt", 0);
        SmartDashboard.putNumber("Falcon 2 Volt", 0);
        SmartDashboard.putNumber("Falcon 3 Volt", 0);
        SmartDashboard.putNumber("Falcon 4 Volt", 0);
        SmartDashboard.putNumber("Falcon 5 Volt", 0);
        SmartDashboard.putNumber("Falcon 6 Volt", 0);
    }

    public void runTestBench(){
        neo1.setVoltage(SmartDashboard.getNumber("NEO 1 Volt", 0));
        neo2.setVoltage(SmartDashboard.getNumber("NEO 2 Volt", 0));
        neo3.setVoltage(SmartDashboard.getNumber("NEO 3 Volt", 0));
        neo4.setVoltage(SmartDashboard.getNumber("NEO 4 Volt", 0));
        neo5.setVoltage(SmartDashboard.getNumber("NEO 5 Volt", 0));
        neo6.setVoltage(SmartDashboard.getNumber("NEO 6 Volt", 0));

        talon1.set(ControlMode.PercentOutput, SmartDashboard.getNumber("Falcon 1 Volt", 0) / 12.0);
        talon2.set(ControlMode.PercentOutput, SmartDashboard.getNumber("Falcon 2 Volt", 0) / 12.0);
        talon3.set(ControlMode.PercentOutput, SmartDashboard.getNumber("Falcon 3 Volt", 0) / 12.0);
        talon4.set(ControlMode.PercentOutput, SmartDashboard.getNumber("Falcon 4 Volt", 0) / 12.0);
        talon5.set(ControlMode.PercentOutput, SmartDashboard.getNumber("Falcon 5 Volt", 0) / 12.0);
        talon6.set(ControlMode.PercentOutput, SmartDashboard.getNumber("Falcon 6 Volt", 0) / 12.0);
    }
}
