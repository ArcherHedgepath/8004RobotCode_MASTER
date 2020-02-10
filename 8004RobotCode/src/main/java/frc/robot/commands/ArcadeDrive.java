/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class ArcadeDrive extends CommandBase {

  public ArcadeDrive() {

    addRequirements(Robot.Drivetrain);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    double moveSpeed = -Robot.robotContainer.GetDriverRawAxis(Robot.constants.DRIVER_CONTROLLER_MOVE_AXIS);
    double rotateSpeed = Robot.robotContainer.GetDriverRawAxis(Robot.constants.DRIVER_CONTROLLER_ROTATE_AXIS);

    Robot.Drivetrain.ArcadeDrive(moveSpeed, rotateSpeed);
  }

  @Override
  public void end(boolean interrupted) {

    Robot.Drivetrain.ArcadeDrive(0.0, 0.0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
