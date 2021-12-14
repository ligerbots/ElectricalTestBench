package frc.robot;


import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



public class TestBench {
    
    private CANSparkMax neo1 = new CANSparkMax(1,MotorType.kBrushless);
    private CANSparkMax neo2 = new CANSparkMax(2, MotorType.kBrushless); //declaring the neos
    private CANSparkMax neo3 = new CANSparkMax(3, MotorType.kBrushless);
    private CANSparkMax neo4 = new CANSparkMax(4, MotorType.kBrushless);
    private CANSparkMax neo5 = new CANSparkMax(5, MotorType.kBrushless);
    private CANSparkMax neo6 = new CANSparkMax(6, MotorType.kBrushless);

    double neo1Volt,neo2Volt,neo3Volt,neo4Volt,neo5Volt,neo6Volt; //Voltage of the individual neos

    public TestBench(){
        SmartDashboard.putNumber("Neo 1 Volt", 0 );
        SmartDashboard.putNumber("Neo 2 Volt", 0 );
        SmartDashboard.putNumber("Neo 3 Volt", 0 );
        SmartDashboard.putNumber("Neo 4 Volt", 0 );
        SmartDashboard.putNumber("Neo 5 Volt", 0 );
        SmartDashboard.putNumber("Neo 6 Volt", 0 );
    }

    public void runTestBench(){
        neo1.setVoltage(SmartDashboard.getNumber("Neo 1 Volt",0));
        neo2.setVoltage(SmartDashboard.getNumber("Neo 2 Volt",0));
        neo3.setVoltage(SmartDashboard.getNumber("Neo 3 Volt",0));
        neo4.setVoltage(SmartDashboard.getNumber("Neo 4 Volt",0));
        neo5.setVoltage(SmartDashboard.getNumber("Neo 5 Volt",0));
        neo6.setVoltage(SmartDashboard.getNumber("Neo 6 Volt",0));
    }

    
}
