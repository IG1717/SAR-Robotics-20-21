package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "flywheel", group = "TwoWheel")
public class FlyWheel extends LinearOpMode {
    DcMotor left = null;
    DcMotor right = null;

    public void runOpMode(){
        left = hardwareMap.dcMotor.get("left_motor");
        right = hardwareMap.dcMotor.get("right_motor");
        left.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();

        while (opModeIsActive()) {
            left.setPower(-gamepad1.left_trigger);
            right.setPower(-gamepad1.right_stick_y);

        }
    }

}
