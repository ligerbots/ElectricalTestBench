package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunTestCommand extends CommandBase {
    
    TestBench testBench;

    RunTestCommand(TestBench testBench){
        this.testBench = testBench;
        System.out.println("testbench constructed");
    }

    @Override
    public void initialize() {
      System.out.println("initialized");
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      testBench.runTestBench();
      System.out.println("runTestBench");
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {

    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
}
