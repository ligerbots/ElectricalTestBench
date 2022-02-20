package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

public class Robot extends TimedRobot {
    TestBench m_testBench;
    RunTestCommand m_runTest;

    /**
     * This function is run when the robot is first started up and should be used
     * for any initialization code.
     */
    @Override
    public void robotInit() { 
      m_testBench = new TestBench(); 
      m_runTest = new RunTestCommand(m_testBench);
      SmartDashboard.putBoolean("On?", true);
    }
  
    /**
     * This function is called every robot packet, no matter the mode. Use this for
     * items like diagnostics that you want ran during disabled, autonomous,
     * teleoperated and test.
     *
     * This runs after the mode specific periodic functions, but before LiveWindow
     * and SmartDashboard integrated updating.
     */
    @Override
    public void robotPeriodic() {
      /* Runs the Scheduler. This is responsible for polling buttons, adding newly-scheduled commands, 
      running already-scheduled commands, removing finished or interrupted commands, 
      and running subsystem periodic() methods. 
      This must be called from the
      robot's periodic block in order for anything in the Command-based framework to work.
      */ 
      CommandScheduler.getInstance().run();
      
    }

    @Override
    public void teleopInit() {
      m_runTest.schedule();
    }
  
    @Override
    public void disabledPeriodic() {
      
    }
}