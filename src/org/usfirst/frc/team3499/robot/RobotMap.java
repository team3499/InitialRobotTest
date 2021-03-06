package org.usfirst.frc.team3499.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // Joystick USB port assignments from Driver Station
    public static int controlStickPort    = 0;

    // Buttons on Logitech joysticks
    public static int stickTrigger        = 1;
    public static int stickHat2           = 2;

    // Drive motors
    public static int driveMotorLFCanID   = 2;
    public static int driveMotorLRCanID   = 3;
    public static int driveMotorRFCanID   = 4;
    public static int driveMotorRRCanID   = 5;

    // Digital IO ports
    public static int proximitySensorPort = 0;
    public static int ledPort             = 1;
}
