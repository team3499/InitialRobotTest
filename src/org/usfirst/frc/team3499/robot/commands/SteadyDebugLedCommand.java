package org.usfirst.frc.team3499.robot.commands;

import org.usfirst.frc.team3499.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SteadyDebugLedCommand extends Command {

    boolean state = false;

    public SteadyDebugLedCommand(boolean state) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.debugLedSubsystem);
        this.state = state;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.debugLedSubsystem.set(state);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
