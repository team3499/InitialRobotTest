
package org.usfirst.frc.team3499.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalOutput;

import org.usfirst.frc.team3499.robot.RobotMap;

/**
 *  Subsystem for a simple debug LED plugged into a RoboRIO DIO
 */
public class DebugLedSubsystem extends Subsystem {

    DigitalOutput led = new DigitalOutput(RobotMap.debugLedPort);
    boolean ledState  = false;

    public void initDefaultCommand() {

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

