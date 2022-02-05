package frc.robot;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class TestBench {
    // declaring the individual talons
    private TalonFX talon1 = new TalonFX(1);
    private TalonFX talon2 = new TalonFX(2); 
    private TalonFX talon3 = new TalonFX(3);
    private TalonFX talon4 = new TalonFX(4);
    private TalonFX talon5 = new TalonFX(5);
    private TalonFX talon6 = new TalonFX(6);

    

    public TestBench(){
        SmartDashboard.putNumber("Talon 1 Volt", 0);
        SmartDashboard.putNumber("Talon 2 Volt", 0);
        SmartDashboard.putNumber("Talon 3 Volt", 0);
        SmartDashboard.putNumber("Talon 4 Volt", 0);
        SmartDashboard.putNumber("Talon 5 Volt", 0);
        SmartDashboard.putNumber("Talon 6 Volt", 0);
    }

    public void runTestBench(){
        talon1.set(ControlMode.PercentOutput, SmartDashboard.getNumber("Talon 1 Volt", 0) / 12.0);
        talon2.set(ControlMode.PercentOutput, SmartDashboard.getNumber("Talon 2 Volt", 0) / 12.0);
        talon3.set(ControlMode.PercentOutput, SmartDashboard.getNumber("Talon 3 Volt", 0) / 12.0);
        talon4.set(ControlMode.PercentOutput, SmartDashboard.getNumber("Talon 4 Volt", 0) / 12.0);
        talon5.set(ControlMode.PercentOutput, SmartDashboard.getNumber("Talon 5 Volt", 0) / 12.0);
        talon6.set(ControlMode.PercentOutput, SmartDashboard.getNumber("Talon 6 Volt", 0) / 12.0);
    }
}
