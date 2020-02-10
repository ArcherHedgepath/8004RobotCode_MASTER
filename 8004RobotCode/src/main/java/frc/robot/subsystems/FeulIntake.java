/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Robot;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import frc.robot.commands.IntakeOnOff;
import frc.robot.commands.IntakeReverse;
import frc.robot.commands.LiftLowerIntake;

public class FeulIntake extends SubsystemBase {
  WPI_TalonSRX motorLeftIntakeSpinner = null;
  WPI_TalonSRX motorIntakeSpinner = null;
  WPI_TalonSRX motorLeftIntakeLifter = null;
  WPI_TalonSRX motorRightIntakeLifter = null;
  
  /**
   * Creates a new FeulIntake.
   */
  public FeulIntake() {
    
    motorIntakeSpinner = new WPI_TalonSRX(Constants.MOTOR_INTAKE_ID);
    motorLeftIntakeLifter = new WPI_TalonSRX(Constants.MOTOR_INTAKE_LIFTING_LEFT_2_ID);
    motorRightIntakeLifter = new WPI_TalonSRX(Constants.MOTOR_INTAKE_LIFTING_RIGHT_1_ID);

    
    motorIntakeSpinner.setNeutralMode(NeutralMode.Coast);
    motorLeftIntakeLifter.setNeutralMode(NeutralMode.Brake);
    motorRightIntakeLifter.setNeutralMode(NeutralMode.Brake);


  }
  public void SetIntakeSpinnerSpeed(double intakeSpeed)
  {
  motorLeftIntakeSpinner.set(intakeSpeed);
  
  }
  public void LiftIntake()
  {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
    Robot.robotContainer.bButton.toggleWhenPressed(new IntakeOnOff());
    Robot.robotContainer.yButton.toggleWhenPressed(new IntakeReverse());
  }
}
