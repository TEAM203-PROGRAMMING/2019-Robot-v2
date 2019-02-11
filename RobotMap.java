

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import com.kauailabs.navx.frc.AHRS;

/*
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  //DRIVE MOTORS --------------------------------------------------------------------------------------------------------------------
  public static int rightOne = 1;
  public static int rightTwo = 2;
  public static int rightThree = 3;
  public static int leftOne = 13;
  public static int leftTwo = 14;
  public static int leftThree= 15;

  //ELEVATOR MOTORS -----------------------------------------------------------------------------------------------------------------
  public static int elevatorMotorOne = 12;
  //public static int elevatorMotorTwo = 5;

  //JOYSTICK BUTTON LAYOUT
  public static int p1bA = 1;
  public static int  p1bB = 2;
  public static int  p1bX =3;
  public static int  p1bY= 4;
  public static int  p1bLB = 5;
  public static int  p1bRB = 6;
  public static int  p1b7 = 7;
  public static int  p1b8 = 8;
  public static int  p1b9 = 9;
  public static int  p1b10 = 10;
  public static int  p1b11 = 11;
  public static int  p1b12 = 12;
  public static int  p1bStart = 13;
  public static int  p1bLJ = 14;
  public static int  p1bRJ = 15;
  
  public static AHRS navX;

  public static final double kP = 0.03;
  public static final double kI = 0.00;
  public static final double kD = 0.00;
  public static final double kF = 0.00;

  public static double upperTurnlimit = 0.80;
  public static double upperMovelimit = 0.80;

  public static final double kToleranceDegrees = 2.0f;

  public static int joystickPort = 0;
  public static int joystickPort2 = 4;



//Drivetrain constants!
public static int wheelDiameter = 6; //call (RobotMap.wheeldiamter) whenever needed


  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public sta0-e3ghnm mm, k int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
