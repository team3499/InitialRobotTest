package org.usfirst.frc.team3499.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;

import org.usfirst.frc.team3499.robot.RobotMap;

/**
 *  Subsystem for the IR proximity sensor
 */
public class ProximitySensorSubsystem extends Subsystem {

    DigitalInput sensor = new DigitalInput(RobotMap.proximitySensorPort);

    public void initDefaultCommand() {

    }

    /**
     *  Returns true if the sensor is detecting something
     */
    public boolean get() {
        return !sensor.get();  // low -> detect
    }
}
