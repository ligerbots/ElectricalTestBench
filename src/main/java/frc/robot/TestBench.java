package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class TestBench {
    // declaring the Neos
    private SparkMax neo1 = new SparkMax(1, MotorType.kBrushless);
    private SparkMax neo2 = new SparkMax(2, MotorType.kBrushless); 
    private SparkMax neo3 = new SparkMax(3, MotorType.kBrushless);
    private SparkMax neo4 = new SparkMax(4, MotorType.kBrushless);
    private SparkMax neo5 = new SparkMax(5, MotorType.kBrushless);
    private SparkMax neo6 = new SparkMax(6, MotorType.kBrushless);
    private SparkMax neo7 = new SparkMax(7, MotorType.kBrushless);
    private SparkMax neo8 = new SparkMax(8, MotorType.kBrushless);
 
    // declaring the Falcons
    private TalonFX talon1 = new TalonFX(1);
    private TalonFX talon2 = new TalonFX(2); 
    private TalonFX talon3 = new TalonFX(3);
    private TalonFX talon4 = new TalonFX(4);
    private TalonFX talon5 = new TalonFX(5);
    private TalonFX talon6 = new TalonFX(6);

    public TestBench(){
        
        SmartDashboard.putNumber("NEO 1 Volt", 0);
        SmartDashboard.putNumber("NEO 2 Volt", 0);
        SmartDashboard.putNumber("NEO 3 Volt", 0);
        SmartDashboard.putNumber("NEO 4 Volt", 0);
        SmartDashboard.putNumber("NEO 5 Volt", 0);
        SmartDashboard.putNumber("NEO 6 Volt", 0);
        SmartDashboard.putNumber("NEO 7 Volt", 0);
        SmartDashboard.putNumber("NEO 8 Volt", 0);

        SmartDashboard.putNumber("NEO 1 Faults", 0);
        SmartDashboard.putNumber("NEO 2 Faults", 0);
        SmartDashboard.putNumber("NEO 3 Faults", 0);
        SmartDashboard.putNumber("NEO 4 Faults", 0);
        SmartDashboard.putNumber("NEO 5 Faults", 0);
        SmartDashboard.putNumber("NEO 6 Faults", 0);
        SmartDashboard.putNumber("NEO 7 Faults", 0);
        SmartDashboard.putNumber("NEO 8 Faults", 0);

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
        neo7.setVoltage(SmartDashboard.getNumber("NEO 7 Volt", 0));
        neo8.setVoltage(SmartDashboard.getNumber("NEO 8 Volt", 0));

        SmartDashboard.putString("NEO 1 Faults", neo1.getFaults().toString());
        SmartDashboard.putString("NEO 2 Faults", neo2.getFaults().toString());
        SmartDashboard.putString("NEO 3 Faults", neo3.getFaults().toString());
        SmartDashboard.putString("NEO 4 Faults", neo4.getFaults().toString());
        SmartDashboard.putString("NEO 5 Faults", neo5.getFaults().toString());
        SmartDashboard.putString("NEO 6 Faults", neo6.getFaults().toString());
        SmartDashboard.putString("NEO 7 Faults", neo7.getFaults().toString());
        SmartDashboard.putString("NEO 8 Faults", neo8.getFaults().toString());

        talon1.set(SmartDashboard.getNumber("Falcon 1 Volt", 0) / 12.0);
        talon2.set(SmartDashboard.getNumber("Falcon 2 Volt", 0) / 12.0);
        talon3.set(SmartDashboard.getNumber("Falcon 3 Volt", 0) / 12.0);
        talon4.set(SmartDashboard.getNumber("Falcon 4 Volt", 0) / 12.0);
        talon5.set(SmartDashboard.getNumber("Falcon 5 Volt", 0) / 12.0);
        talon6.set(SmartDashboard.getNumber("Falcon 6 Volt", 0) / 12.0);
    }
}
