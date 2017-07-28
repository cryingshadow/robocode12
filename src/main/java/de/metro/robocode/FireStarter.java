package de.metro.robocode;

import robocode.*;

import java.awt.*;

public class FireStarter extends AdvancedRobot {
    boolean movingForward;

    public void run() {
        // Set colors
        setBodyColor(Color.green);
        setGunColor(Color.red);
        setRadarColor(Color.white);
        setScanColor(Color.yellow);

        while (true) {
            setTurnRight(10000);
            setMaxVelocity(5);
            ahead(10000);
        }
    }
    public void onScannedRobot(ScannedRobotEvent e){
        try{
            java.lang.Thread.sleep(5);
            fire(3);
        }catch(Exception fix){
        }
    }
    public void onHitRobot(HitRobotEvent e) {
        if (e.getBearing() > -3 && e.getBearing() < 3) {
            fire(3);
        }
        if (e.isMyFault()) {
            turnRight(10);
        }
    }

    public void onHitWall(HitWallEvent e) {
        // Bounce off!
        reverseDirection();
    }

    public void reverseDirection() {
        if (movingForward) {
            setBack(40000);
            movingForward = false;
        } else {
            setAhead(40000);
            movingForward = true;
        }
    }

}