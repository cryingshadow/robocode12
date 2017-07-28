package de.metro.robocode;

import robocode.*;

public class FireStarter extends AdvancedRobot {

    /**
     * SpinBot's run method - Circle
     */
    public void run() {
        // Set colors
        setBodyColor(Color.green);
        setGunColor(Color.red);
        setRadarColor(Color.white);
        setScanColor(Color.yellow);

        // Loop forever
        while (true) {
            // Tell the game that when we take move,
            // we'll also want to turn right... a lot.
            setTurnRight(10000);
            // Limit our speed to 5
            setMaxVelocity(5);
            // Start moving (and turning)
            ahead(10000);
            // Repeat.
        }
    }

    /**
     * onScannedRobot: Fire hard!
     */
    public void onScannedRobot(ScannedRobotEvent e){
        try{
            java.lang.Thread.sleep(10);
            fire(3);
        }catch(Exception fix){
        }
    }

    /**
     * onHitRobot:  If it's our fault, we'll stop turning and moving,
     * so we need to turn again to keep spinning.
     */
    public void onHitRobot(HitRobotEvent e) {
        if (e.getBearing() > -5 && e.getBearing() < 5) {
            fire(3);
        }
        if (e.isMyFault()) {
            turnRight(10);
        }
    }
}