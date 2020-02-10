/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

  Joystick driverController = new Joystick(Constants.DRIVER_CONTROLLER);
  public JoystickButton leftBumber = new JoystickButton(driverController, Constants.DRIVER_CONTROLLER_LEFT_BUMBER);
  public JoystickButton rightBumber = new JoystickButton(driverController, Constants.DRIVER_CONTROLLER_RIGHT_BUMBER);
  public JoystickButton bButton = new JoystickButton(driverController, Constants.DRIVER_CONTROLLER_B_BUTTON);
  public JoystickButton yButton = new JoystickButton(driverController, Constants.DRIVER_CONTROLLER_Y_BUTTON);
  public double GetDriverRawAxis(int axis)
  {
    return driverController.getRawAxis(axis);
  }

  public boolean GetRightBumberToggle()
  {
    return rightBumber.get();
  }
  public boolean GetBButtonToggle() 
  {
    return bButton.get();
  }

  
  // The robot's subsystems and commands are defined here...



  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
  }




  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
}
