/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

	public final int DRIVER_CONTROLLER_MOVE_AXIS = 1;//The Left Stick Y axis of the Driving Contoller (Arcade Drive)
	public final int DRIVER_CONTROLLER_ROTATE_AXIS = 0;//The Left Stick X axis of the Driving Controller(Arcade Drive)
	public static final int DRIVER_CONTROLLER_LEFT_BUMBER = 5;//The Right Bumber of the Driving Controller
	public static final int DRIVER_CONTROLLER_B_BUTTON = 2;//The B button of the driver controller
	public static final int DRIVER_CONTROLLER_Y_BUTTON = 4;//The Y button of the driver controller
	public static final int DRIVER_CONTROLLER_RIGHT_BUMBER = 6;//The Right Bumber of the Driving Controller


	public final int DRIVER_CONTROLLER_LMOVE_AXIS = 1;//The Left Stick Y Axis of Driving Controller (Tank Drive)
	public final int DRIVER_CONTROLLER_RMOVE_AXIS = 5;//The Right Stick Y Axis of Driving Controller (Tank Drive)


	public static final int DRIVER_CONTROLLER = 0;//The Driving Controller

	public static final int MOTOR_LEFT_1_ID = 0;//The Left Front Motor
	public static final int MOTOR_LEFT_2_ID = 1;//The Left Rear Motor
	public static final int MOTOR_RIGHT_1_ID = 2;//The Right Front Motor
	public static final int MOTOR_RIGHT_2_ID = 3;//The Right Rear Motor

	public static final int MOTOR_INTAKE_ID = 4;//The Right Intake Spinner Motor
	
	public static final int MOTOR_INTAKE_LIFTING_RIGHT_1_ID = 5;//The Right Intake Lifting Motor
	public static final int MOTOR_INTAKE_LIFTING_LEFT_2_ID = 6;//The Left Intake Lifting Motor

	public static final double MOTOR_INTAKE_SPEED = 1;//The Speed of the Intake Motors
	public static final double MOTOR_AUTO_SPEED = .6;//The Speed of both the motor groups while in Autonomous



}
