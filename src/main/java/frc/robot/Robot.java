package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.ScheduleCommand;
import edu.wpi.first.wpilibj.RobotBase;

public class Robot extends TimedRobot {

    private Command m_autonomousCommand;
    private TestBench testBench = new TestBench();
  
    /**
     * This function is run when the robot is first started up and should be used
     * for any initialization code.
     */
    @Override
    public void robotInit() {

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

  /**
   * This function is called once each time the robot enters Disabled mode.
   */
  @Override
  public void disabledInit() {

  }

  @Override
  public void disabledPeriodic() {

  }

  /**
   * This autonomous runs the autonomous command selected by your
   * {@link RobotContainer} class.
   */
  @Override
  public void autonomousInit() {
        SmartDashboard.putBoolean("On?", false);   
        SmartDashboard.putNumber("Neo 1", 0);
        SmartDashboard.putNumber("Neo 2", 0);
        SmartDashboard.putNumber("Neo 3", 0);
        SmartDashboard.putNumber("Neo 4", 0);
        SmartDashboard.putNumber("Neo 5", 0);
        SmartDashboard.putNumber("Neo 6", 0);  
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
      if(!CommandScheduler.getInstance().isScheduled(testBench) && SmartDashboard.getBoolean("On?", false)){        
        testBench.schedule();
        CommandScheduler.getInstance().run();  
      }
  }
}