// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class TestBench extends CommandBase {
  /** Creates a new TestBench. */
    private CANSparkMax neo1 = new CANSparkMax(1,MotorType.kBrushless);
    private CANSparkMax neo2 = new CANSparkMax(2, MotorType.kBrushless); //declaring the neos
    private CANSparkMax neo3 = new CANSparkMax(3, MotorType.kBrushless);
    private CANSparkMax neo4 = new CANSparkMax(4, MotorType.kBrushless);
    private CANSparkMax neo5 = new CANSparkMax(5, MotorType.kBrushless);
    private CANSparkMax neo6 = new CANSparkMax(6, MotorType.kBrushless);


  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
	SmartDashboard.putNumber("Neo 1", -1);
        SmartDashboard.putNumber("Neo 2", -1);
        SmartDashboard.putNumber("Neo 3", -1);
        SmartDashboard.putNumber("Neo 4", -1);
        SmartDashboard.putNumber("Neo 5", -1);
        SmartDashboard.putNumber("Neo 6", -1);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
	  neo1.setVoltage(SmartDashboard.getNumber("Neo 1", 0));
	  neo2.setVoltage(SmartDashboard.getNumber("Neo 2", 0));
	  neo3.setVoltage(SmartDashboard.getNumber("Neo 3", 0));
	  neo4.setVoltage(SmartDashboard.getNumber("Neo 4", 0));
	  neo5.setVoltage(SmartDashboard.getNumber("Neo 5", 0));
	  neo6.setVoltage(SmartDashboard.getNumber("Neo 6", 0));

	  SmartDashboard.putNumber("Actual Voltage 1", SmartDashboard.getNumber("Neo 1", -1));
	  SmartDashboard.putNumber("Actual Voltage 2", SmartDashboard.getNumber("Neo 2", -1));
	  SmartDashboard.putNumber("Actual Voltage 3", SmartDashboard.getNumber("Neo 3", -1));
	  SmartDashboard.putNumber("Actual Voltage 4", SmartDashboard.getNumber("Neo 4", -1));
	  SmartDashboard.putNumber("Actual Voltage 5", SmartDashboard.getNumber("Neo 5", -1));
	  SmartDashboard.putNumber("Actual Voltage 6", SmartDashboard.getNumber("Neo 6", -1));
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
	neo1.setVoltage(0);
	neo2.setVoltage(0);
	neo3.setVoltage(0);
	neo4.setVoltage(0);
	neo5.setVoltage(0);
	neo6.setVoltage(0);

	SmartDashboard.putNumber("Neo 1", -1);
	SmartDashboard.putNumber("Neo 2", -1);
	SmartDashboard.putNumber("Neo 3", -1);
	SmartDashboard.putNumber("Neo 4", -1);
	SmartDashboard.putNumber("Neo 5", -1);
	SmartDashboard.putNumber("Neo 6", -1);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
	return !SmartDashboard.getBoolean("On?", false);
  }
}
