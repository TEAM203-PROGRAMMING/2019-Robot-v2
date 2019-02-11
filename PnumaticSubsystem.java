/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveManuallyCommand;
import edu.wpi.first.wpilibj.Compressor;
/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class PnumaticSubsystem extends Subsystem {
    Compressor c = new Compressor(0);

    //c.setClosedLoopControl(true);
    //c.setClosedLoopControl(false);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  //to turn the compresser off or on
  public void c_on(){
      //
    c.setClosedLoopControl(true);
  }
  public void c_off(){
    c.setClosedLoopControl(false);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}