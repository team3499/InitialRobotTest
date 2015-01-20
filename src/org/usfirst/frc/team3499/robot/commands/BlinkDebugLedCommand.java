
package org.usfirst.frc.team3499.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Timer;

import org.usfirst.frc.team3499.robot.Robot;

/**
 *  BlinkLedCommand - Blink the debug LED
 */
public class BlinkDebugLedCommand extends Command {

    Timer timer      = new Timer();
    int totalCount   = 0;
    int currentCount = 0;

    /**
     *  BlinkLedCommand - Blink the debug LED
     *
     *  @param  count Number of times to blink -- 0 for infinite.
     */
    public BlinkDebugLedCommand(int count) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.debugLedSubsystem);
        totalCount = count * 2;   // one for each on and off cycle
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        Robot.debugLedSubsystem.off();
        currentCount = 0;
        timer.reset();
        timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (timer.get() > 0.1) {
            Robot.debugLedSubsystem.toggle();
            currentCount += 1;
            timer.reset();
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return totalCount > 0 && currentCount >= totalCount;
    }

    // Called once after isFinished returns true
    protected void end() {
        // Ensure the LED is off
        Robot.debugLedSubsystem.off();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
