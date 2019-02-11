/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ElevatorLift;
import frc.robot.commands.ElevatorLower;
import frc.robot.commands.NavXCommand;
import frc.robot.commands.NavXReset;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  public Joystick stick = new Joystick(RobotMap.joystickPort); // the number inside the parathensis is the port -DeAisha
  public Joystick stick2 = new Joystick(RobotMap.joystickPort2);



  //CONSTRUCTOR THAT RUNS THE COMMANDS BASED ON BUTTON PRESSES
  public OI() {
    JoystickButton p1bA = new JoystickButton(stick, RobotMap.p1bA);
    JoystickButton p1bB = new JoystickButton(stick, RobotMap.p1bB);
    JoystickButton p1bX = new JoystickButton(stick, RobotMap.p1bX);
    JoystickButton p1bY = new JoystickButton(stick, RobotMap.p1bY);
    JoystickButton p1bLB = new JoystickButton(stick, RobotMap.p1bLB);
    JoystickButton p1bRB = new JoystickButton(stick, RobotMap.p1bRB);
    JoystickButton p1b7 = new JoystickButton(stick, RobotMap.p1b7);
    JoystickButton p1b8 = new JoystickButton(stick, RobotMap.p1b8);
    JoystickButton p1b9 = new JoystickButton(stick, RobotMap.p1b9);
    JoystickButton p1b10 = new JoystickButton(stick, RobotMap.p1b10);
    JoystickButton p1b11 = new JoystickButton(stick, RobotMap.p1b11);
    JoystickButton p1b12 = new JoystickButton(stick, RobotMap.p1b12);
    JoystickButton p1bStart = new JoystickButton(stick, RobotMap.p1bStart);
    JoystickButton p1bLJ = new JoystickButton(stick, RobotMap.p1bLJ);
    JoystickButton p1bRJ = new JoystickButton(stick, RobotMap.p1bRJ);
    
    p1bA.whileHeld(new ElevatorLift());
    p1bB.whileHeld(new ElevatorLower());
    p1bX.whileHeld(new NavXCommand());
    p1bY.whileHeld(new NavXReset());
  }

  public Joystick getDriverJoystick() {
    return stick;
  }

  public Joystick getOperatorJoystick() {
    return stick2;
  }
}


//pibB, p1bX, p1bY, p1bLB, p1bRB, p1b7, p1b8, p1b9, p1b10, p1b11, p1b12, p1bBack, p1bStart, p1LJ, p1RJ;
//public Button button7 = new JoystickButton(stick, 9);//this is the compresser put to port 7 if your on the xbox
  // Button button = new JoystickButton(stick, buttonNumber);
  
  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());





