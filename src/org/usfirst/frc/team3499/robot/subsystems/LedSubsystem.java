
package org.usfirst.frc.team3499.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalOutput;

import org.usfirst.frc.team3499.robot.RobotMap;
import org.usfirst.frc.team3499.robot.commands.BlinkLedCommand;

/**
 *
 */
public class LedSubsystem extends Subsystem {

    DigitalOutput led = new DigitalOutput(RobotMap.ledPort);
    boolean ledState  = false;

    public void initDefaultCommand() {
        setDefaultCommand(new BlinkLedCommand());
    }

    public void set(boolean state) {
        ledState = state;
        led.set(ledState);
    }

    public void on() {
        set(true);
    }

    public void off() {
        set(false);
    }

    public void toggle() {
        set(!ledState);
    }
}

