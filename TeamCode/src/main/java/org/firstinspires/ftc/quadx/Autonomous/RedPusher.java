package org.firstinspires.ftc.quadx.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.quadx.Libraries.MyOpMode;

/**
 * Created by jspspike on 11/3/16.
 */


@Autonomous(name="Red Pusher", group="Red")
public class RedPusher extends MyOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        hardwareMap();
        initServos();
        initSensors();
        waitForStart();
        floorL.enableLed(true);
        floorR.enableLed(true);


        arcTurnCorr(-.2, -45);
        moveTo(.2, -4650);
        arcTurnCorr(-.2, 46);
        untilWhite(-.12);
        pressRed();
        untilWhite(-.12);
        moveTo(.2, 50);
        pressRed();
    }
}
