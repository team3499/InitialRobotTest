package org.usfirst.frc.team3499.robot.commands;

import org.usfirst.frc.team3499.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SteadyLedCommand extends Command {

    boolean state = false;

    public SteadyLedCommand(boolean state) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.ledSubsystem);
        this.state = state;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.ledSubsystem.set(state);
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
