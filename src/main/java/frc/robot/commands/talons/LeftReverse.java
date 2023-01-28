package frc.robot.commands.talons;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class LeftReverse extends CommandBase {
  public LeftReverse() {
    addRequirements(Robot.MOTOR_TESTING);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    Robot.MOTOR_TESTING.first(true); //reversed motor soldering
    Robot.MOTOR_TESTING.second(false);
  }

  @Override
  public boolean isFinished() {
    return false;
  }

  @Override
  public void end(boolean interrupted) {
    if(interrupted) {
      Robot.MOTOR_TESTING.stop();
    }
  }
}
