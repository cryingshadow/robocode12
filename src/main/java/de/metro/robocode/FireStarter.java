package de.metro.robocode;

import robocode.*;

public class FireStarter extends TeamRobot
{
    static String jdField_for = "normal";
    static int jdField_new = 1;
    static int jdField_char = 1;
    static boolean jdField_if = true;
    static boolean jdField_else = false;
    static boolean jdField_byte = false;
    static boolean jdField_int = false;
    static l a;
    static f jdField_try;
    static o jdField_do;
    static o jdField_case;
    static p jdField_goto;

    public FireStarter() {}

    public void run()
    {
        if (getRoundNum() == 0)
        {
            out.println("Shadow v3 initializing.");
            initBehaviour();
            out.println("Behavior: " + for);
        }
        setAdjustRadarForRobotTurn(true);
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);
        if (try == null)
        {
            try = new f(this);
            tryjdField_for = 10;
        }
        if (a == null)
        {
            a = new l(this);
            aa = char;
        }
        a.a();
        if (case == null) {
      case = new j(this, a);
    }
        if (do == null)
        {
            do = new s(this, a);
            dojdField_if = new;
            doa = if;
        }
        do.a();
    case.a();
        if (goto == null)
        {
      goto = new m(this, a);
            gotojdField_byte = char;
            if (else)
            {
                gotob = 3.0D;
                gotoc = true;
            }
            if (byte)
            {
                gotojdField_try = 0.0D;
                gotob = 0.0D;
            }
        }
    goto.a();
        for (;;)
        {
            a.jdMethod_if();
            if (getOthers() > 1) {
        case.jdMethod_if();
            } else if (!else) {
            do.jdMethod_if();
        }
      goto.jdMethod_if();
            execute();
        }
    }

    public void initBehaviour()
    {
        try
        {
            BufferedReader localBufferedReader = new BufferedReader(new FileReader(getDataFile("Shadow.properties")));
            String str;
            while ((str = localBufferedReader.readLine()) != null)
            {
                str = str.trim();
                if (!str.substring(0, 1).equals("#"))
                {
                    if ((str.length() > 10) && (str.substring(0, 9).equalsIgnoreCase("behavior="))) {
                        for = str.substring(9).trim();
                    }
                    if ((str.length() > 11) && (str.substring(0, 10).equalsIgnoreCase("behaviour="))) {
                        for = str.substring(10).trim();
                    }
                    if ((str.length() > 12) && (str.substring(0, 11).equalsIgnoreCase("dataSaving="))) {
                        if = !str.substring(11).trim().equalsIgnoreCase("false");
                    }
                    if ((str.length() > 13) && (str.substring(0, 12).equalsIgnoreCase("movLogLevel="))) {
                        try
                        {
                            new = Integer.parseInt(str.substring(12).trim());
                        }
                        catch (NumberFormatException localNumberFormatException1) {}
                    }
                    if ((str.length() > 13) && (str.substring(0, 12).equalsIgnoreCase("gunLogLevel="))) {
                        try
                        {
              char = Integer.parseInt(str.substring(12).trim());
                        }
                        catch (NumberFormatException localNumberFormatException2) {}
                    }
                }
            }
        }
        catch (IOException localIOException) {}
        if (getOthers() == 1)
        {
      else = for.equals("reference");
      byte = for.equals("challenge");
      int = for.equals("sandboxkiller");
            if ((for.equals("reference")) || (for.equals("challenge"))) {
            if = false;
        }
        }
    }

    public void onSkippedTurn(SkippedTurnEvent paramSkippedTurnEvent)
    {
        try.a(paramSkippedTurnEvent);
    }

    public void onScannedRobot(ScannedRobotEvent paramScannedRobotEvent)
    {
        a.a(paramScannedRobotEvent);
        if (!byte) {
      goto.a(paramScannedRobotEvent);
    }
    case.a(paramScannedRobotEvent);
    }

    public void onRobotDeath(RobotDeathEvent paramRobotDeathEvent)
    {
        a.a(paramRobotDeathEvent);
        try.a(paramRobotDeathEvent);
    }

    public void onHitByBullet(HitByBulletEvent paramHitByBulletEvent)
    {
        a.a(paramHitByBulletEvent);
        do.a(paramHitByBulletEvent);
    }

    public void onHitRobot(HitRobotEvent paramHitRobotEvent)
    {
        a.a(paramHitRobotEvent);
    case.a(paramHitRobotEvent);
    }

    public void onHitWall(HitWallEvent paramHitWallEvent)
    {
        try.a(paramHitWallEvent);
    }

    public void onBulletHit(BulletHitEvent paramBulletHitEvent)
    {
        a.a(paramBulletHitEvent);
    goto.a(paramBulletHitEvent);
    }

    public void onBulletMissed(BulletMissedEvent paramBulletMissedEvent)
    {
    goto.a(paramBulletMissedEvent);
    }

    public void onBulletHitBullet(BulletHitBulletEvent paramBulletHitBulletEvent)
    {
        a.a(paramBulletHitBulletEvent);
        do.a(paramBulletHitBulletEvent);
    goto.a(paramBulletHitBulletEvent);
    }

    public void onDeath(DeathEvent paramDeathEvent)
    {
        Vector localVector = getAllEvents();
        Iterator localIterator = localVector.iterator();
        while (localIterator.hasNext())
        {
            Event localEvent = (Event)localIterator.next();
            if ((localEvent instanceof HitByBulletEvent)) {
                onHitByBullet((HitByBulletEvent)localEvent);
            }
        }
        try.a(paramDeathEvent);
        if (tryjdField_else != getRoundNum())
        {
      goto.jdMethod_for();
            do.jdMethod_do();
      case.jdMethod_do();
            a.jdMethod_do();
        }
    }

    public void onWin(WinEvent paramWinEvent)
    {
        try.a(paramWinEvent);
    goto.jdMethod_for();
        do.jdMethod_do();
    case.jdMethod_do();
        a.jdMethod_do();
    }

    public void onMessageReceived(MessageEvent paramMessageEvent)
    {
    goto.a(paramMessageEvent);
    }

    public void onPaint(Graphics2D paramGraphics2D)
    {
        a.a(paramGraphics2D);
        if (!else) {
        if (getOthers() > 1) {
        case.a(paramGraphics2D);
        } else {
            do.a(paramGraphics2D);
        }
    }
    goto.a(paramGraphics2D);
    }
}
