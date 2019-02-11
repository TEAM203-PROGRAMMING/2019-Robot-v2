/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

//subsystem is a representation in code of a major part of your robot
//example: shooter subsytem, drive subsystem, elevator subsystem, etc.
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveManuallyCommand;

/*
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.cameraserver.CameraServer;
*/

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

//creating classes for motor controllers...
// the class is public because we want to do able to use it elsewhere
//instatiate new motor controller objects
// inside the () is the robot map, already defined that in RobotMap!!!!


public WPI_TalonSRX leftOne = new WPI_TalonSRX(RobotMap.leftOne);
public WPI_TalonSRX leftTwo = new WPI_TalonSRX(RobotMap.leftTwo);
public WPI_TalonSRX rightOne = new WPI_TalonSRX(RobotMap.rightOne);
public WPI_TalonSRX rightTwo = new WPI_TalonSRX(RobotMap.rightTwo);
public WPI_TalonSRX rightThree = new WPI_TalonSRX(RobotMap.rightThree);
public WPI_TalonSRX leftThree = new WPI_TalonSRX(RobotMap.leftThree);


//SpeedControllerGroup LeftDrive = new SpeedControllerGroup (leftOne, leftTwo, leftThree);
//SpeedControllerGroup RightDrive = new SpeedControllerGroup (rightOne, rightTwo, rightThree);
SpeedControllerGroup LeftDrive = new SpeedControllerGroup (leftOne, leftTwo, leftThree);
SpeedControllerGroup RightDrive = new SpeedControllerGroup (rightOne, rightTwo, rightThree);

//IF CODE DOES NOT WORK COMMENT THIS OUT AND TRY IT, MAY HAVE BEEN WRONG CODE FOR VICTOR SPX'S!!!!!!!!!!
//SpeedControllerGroup leftMotorGroup = new SpeedControllerGroup(leftMaster, leftSlave);
//SpeedControllerGroup rightMotorGroup = new SpeedControllerGroup(rightMaster, rightSlave);

//assign motor controllers to differential drive
public DifferentialDrive drive = new DifferentialDrive(LeftDrive, RightDrive);

//create constructor function so that we can point our slaves to their masters
public DriveSubsystem() {
leftOne.setNeutralMode(NeutralMode.Brake);
leftTwo.setNeutralMode(NeutralMode.Brake);
leftThree.setNeutralMode(NeutralMode.Brake);
rightOne.setNeutralMode(NeutralMode.Brake);
rightTwo.setNeutralMode(NeutralMode.Brake);
rightThree.setNeutralMode(NeutralMode.Brake);

//drive.setExpiration(0.1);
}
/*
keep moving keep moving keep moving keep moving keep moving keep moving ke
*/
// add manual driving method (tank, arcade, etc.)
public void arcadeDrive (double move, double turn) { //void because it's not returning a value

if (Math.abs(move) < 0.10 || Math.abs(move) > RobotMap.upperMovelimit) {
  move = 0;

}
if (Math.abs(turn) < 0.10 || Math.abs(move) > RobotMap.upperTurnlimit) {
  turn = 0;

}

/* in case we wanted to add some math to the drive, it would go here.
We would then be able to call it in the DriveManuallyCommand.java file, rather than putting the math there.
Command based programming keeps the files clean and easier to read. */



//if (move > .5) {
// move = .5;
//}
// when this is called, the move variable doesn't surpass .5 (robot runs at half speed)
// used for testing purposes, not really in real robot code

drive.arcadeDrive(move,turn);


}


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
   setDefaultCommand(new DriveManuallyCommand()); //call commands from command file here! 
  }
}
