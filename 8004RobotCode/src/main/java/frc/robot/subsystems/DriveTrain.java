/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.commands.ArcadeDrive;
import frc.robot.commands.TankDrive;


public class DriveTrain extends SubsystemBase {
  
  WPI_TalonSRX motorLeft1 = null;
  WPI_TalonSRX motorLeft2 = null;
  WPI_TalonSRX motorRight1 = null;
  WPI_TalonSRX motorRight2 = null;

  DifferentialDrive differentialDrive = null;

  public DriveTrain() {
  motorLeft1 = new WPI_TalonSRX(Constants.MOTOR_LEFT_1_ID);
  motorLeft2 = new WPI_TalonSRX(Constants.MOTOR_LEFT_2_ID);
  motorRight1 = new WPI_TalonSRX(Constants.MOTOR_RIGHT_1_ID);
  motorRight2 = new WPI_TalonSRX(Constants.MOTOR_RIGHT_2_ID);

  motorLeft2.follow(motorLeft1);
  motorRight2.follow(motorRight1);
  
  motorLeft1.setNeutralMode(NeutralMode.Brake);
  motorLeft2.setNeutralMode(NeutralMode.Brake);
  motorRight1.setNeutralMode(NeutralMode.Brake);
  motorRight2.setNeutralMode(NeutralMode.Brake);

  SpeedControllerGroup rightMotors = new SpeedControllerGroup(motorRight1, motorRight2);
  SpeedControllerGroup leftMotors = new SpeedControllerGroup(motorLeft1, motorLeft2);

  differentialDrive = new DifferentialDrive(leftMotors, rightMotors);
  }

  @Override
  public void periodic() {
      this.setDefaultCommand(new ArcadeDrive());

      Robot.robotContainer.leftBumber.whenHeld(new TankDrive());
  }

  public void ArcadeDrive(double moveSpeed, double rotateSpeed)
  {
    double leftSpeed = (moveSpeed * 0.6) + (rotateSpeed * 0.3);
    double rightSpeed = (moveSpeed * 0.6) - (rotateSpeed*0.3);

    motorLeft1.set(leftSpeed);
    motorLeft2.set(leftSpeed);
    motorRight1.set(-rightSpeed);
    motorRight2.set(-rightSpeed);
  }

  public void TankDrive(double leftMoveSpeed, double rightMoveSpeed)
  {
    leftMoveSpeed *= leftMoveSpeed * leftMoveSpeed * .6 ;
    rightMoveSpeed *= rightMoveSpeed *rightMoveSpeed* .6 ;

    differentialDrive.tankDrive(leftMoveSpeed, rightMoveSpeed);
  }
 
}