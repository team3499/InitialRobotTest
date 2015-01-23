
package org.usfirst.frc.team3499.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team3499.robot.commands.BlinkLedCommand;
import org.usfirst.frc.team3499.robot.subsystems.LedSubsystem;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    public static final LedSubsystem ledSubsystem = new LedSubsystem();

    public static CANJaguar motor1;
    public static CANJaguar motor2;
    public static CANJaguar motor3;
    public static CANJaguar motor4;
    public static RobotDrive robotDrive;
    public static Joystick joystick;
    public static OI oi;

    Command autonomousCommand;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        oi = new OI();
        // instantiate the command used for the autonomous period
        // autonomousCommand = new BlinkLedCommand();
        try {
            motor1 = new CANJaguar(RobotMap.driveMotorLFCanID);   // Front Left
            motor2 = new CANJaguar(RobotMap.driveMotorLRCanID);   // Rear Left
            motor3 = new CANJaguar(RobotMap.driveMotorRFCanID);   // Front Right
            motor4 = new CANJaguar(RobotMap.driveMotorRRCanID);   // Rear Right
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        robotDrive = new RobotDrive(motor1, motor2, motor3, motor4);
        joystick = new Joystick(RobotMap.controlStickPort);
    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();

        // DANGER, Will Robinson! I *think* arcadeDrive will set the motors on each
        // side to counter counter rotate, but I'm not certain until this code is
        // tested WITHOUT a gearbox attached.
        robotDrive.arcadeDrive(joystick);
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
