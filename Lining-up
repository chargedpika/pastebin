// this doesnt line perfectly up. but just use as example
// AND ITS IN GODDAMN C++ FIX THAT 
float Kp = -0.1f;  // Proportional control constant

std::shared_ptr<NetworkTable> table = NetworkTable::GetTable("limelight");
float tx = table->GetNumber("tx");

if (joystick->GetRawButton(9))
{
        float heading_error = tx;
        steering_adjust = Kp * tx;

        left_command+=steering_adjust;
        right_command-=steering_adjust;
}

// fix to the above, adds a "minimum" error control loop using a proportional control loop
//NOTE: set Kp or min_command too high, your robot can become 
//unstable and can oscillate back and forth as it overshoots the target

float Kp = -0.1f;
float min_command = 0.05f;

std::shared_ptr<NetworkTable> table = NetworkTable::GetTable("limelight");
float tx = table->GetNumber("tx");

if (joystick->GetRawButton(9))
{
        float heading_error = -tx;
        float steering_adjust = 0.0f;
        if (tx > 1.0)
        {
                steering_adjust = Kp*heading_error - min_command;
        }
        else if (tx < 1.0)
        {
                steering_adjust = Kp*heading_error + min_command;
        }
        left_command += steering_adjust;
        right_command -= steering_adjust;
}
