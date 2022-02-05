package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunTestCommand extends CommandBase {
    
    TestBench testBench;

    RunTestCommand(TestBench testBench){
        this.testBench = testBench;
    }

    @Override
    public void initialize() {
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      testBench.runTestBench();
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {

    }
  
    //command should never end while robot is enabled
    @Override
    public boolean isFinished() {
      return false;
    }
}
