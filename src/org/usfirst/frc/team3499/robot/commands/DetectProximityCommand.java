package org.usfirst.frc.team3499.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3499.robot.Robot;

/**
 *  Light the debug LED if the proximity detector is tripped
 */
public class DetectProximityCommand extends Command {

    public DetectProximityCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.debugLedSubsystem);
        requires(Robot.proximitySensorSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        Robot.debugLedSubsystem.off();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.debugLedSubsystem.set(Robot.proximitySensorSubsystem.get());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.debugLedSubsystem.off();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
