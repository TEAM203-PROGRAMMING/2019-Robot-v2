/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

//import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


public class ElevatorSubsystem extends Subsystem {

  WPI_VictorSPX elevatorMotorOne;
  //public WPI_VictorSPX elevatorMotorTwo;
  //public SpeedControllerGroup elevatorMotors;

  public ElevatorSubsystem() {
  elevatorMotorOne = new WPI_VictorSPX(RobotMap.elevatorMotorOne);
  //elevatorMotorTwo = new WPI_VictorSPX(RobotMap.elevatorMotorTwo);
  //elevatorMotors = new SpeedControllerGroup(elevatorMotorOne);
  }
  
  public void raiseElevator() {
    elevatorMotorOne.set(1.0);
  }

  public void lowerElevator() {
    elevatorMotorOne.set(-0.5);
  }

  public void stopElevator() {
    elevatorMotorOne.set(0);
  }

  
  @Override
  public void initDefaultCommand() {

  }
}
