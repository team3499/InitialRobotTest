Initial Test Robot
==================

This code demonstrates basic operator control of a RoboRIO digital output.  It
shows usage of the operator interface (OI class), subsystems (LedSubsystem),
and commands (SteadyLedCommand and BlinkLedCommand).  It also shows how
subsystem default commands that run when the subsystem is not currently in use.

Setup
-----

Test LED plugged into DIO port 1.  Logitech joystick at USB port 0 on the Driver's Station.

Operation
---------

Enable teleop mode.  The default command for the LedSubsystem (BlinkLedCommand)
will initialize an execute showing the LED blinking with a period of 1 second.

Depressing the trigger will initialize and execute the SteadyLedCommand and hold the LED on while the trigger is depressed.  Depressing the '2' button on the joystick hat will hold the LED off while the '2' button is depressed.  When released, the BlinkLedCommand will initialize again and operate.
