package frc.robot;

import edu.wpi.first.networktables.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class limelightTesting {
    NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight-toast");
NetworkTableEntry ty = table.getEntry("ty");
double targetOffsetAngle_Vertical = ty.getDouble(0.0);

// how high is your limelight off the ground?
double limelightHeightInches = 27.5;

// how many degrees back is your limelight rotated from perfectly vertical?
double limelightMountAngleDegrees = 30.0;

// distance from the center of the Limelight lens to the floor
double limelightLensHeightInches = 27.9375;

// distance from the target to the floor
double goalHeightInches = 103.0;

double angleToGoalDegrees = limelightMountAngleDegrees + targetOffsetAngle_Vertical;
double angleToGoalRadians = angleToGoalDegrees * (3.14159 / 180.0);

//calculate distance
double distanceFromLimelightToGoalInches = (goalHeightInches - limelightHeightInches)/Math.tan(angleToGoalRadians);

    public void print() {
        System.out.println(distanceFromLimelightToGoalInches);
    }
}
