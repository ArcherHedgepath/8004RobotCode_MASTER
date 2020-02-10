/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class TankDrive extends CommandBase {

  public TankDrive() {
    
    addRequirements(Robot.Drivetrain);

  }


  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    double leftMoveSpeed =  Robot.robotContainer.GetDriverRawAxis(Robot.constants.DRIVER_CONTROLLER_LMOVE_AXIS);
    double rightMoveSpeed = Robot.robotContainer.GetDriverRawAxis(Robot.constants.DRIVER_CONTROLLER_RMOVE_AXIS);

    Robot.Drivetrain.TankDrive(rightMoveSpeed, leftMoveSpeed);
  }


  @Override
  public void end(boolean interrupted) {

    Robot.Drivetrain.TankDrive(0, 0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
