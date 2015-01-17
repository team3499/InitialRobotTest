
package org.usfirst.frc.team3499.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Timer;

import org.usfirst.frc.team3499.robot.Robot;

/**
 *
 */
public class BlinkLedCommand extends Command {

	Timer timer = new Timer();
	
    public BlinkLedCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.ledSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        Robot.ledSubsystem.off();
        timer.reset();
        timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (timer.get() > 0.5) {
            Robot.ledSubsystem.toggle();
    		timer.reset();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.ledSubsystem.off();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
