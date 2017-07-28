package abc;

import apv.MovSim;
import apv.MovSimStat;
import java.awt.Graphics2D;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Iterator;
import robocode.Bullet;
import robocode.BulletHitBulletEvent;
import robocode.BulletHitEvent;
import robocode.BulletMissedEvent;
import robocode.MessageEvent;
import robocode.ScannedRobotEvent;
import robocode.TeamRobot;

public abstract class p
{
  protected final TeamRobot jdField_long;
  protected final l jdField_for;
  protected final MovSim jdField_int = new MovSim();
  private boolean jdField_char;
  protected boolean jdField_void = true;
  protected double a = 3.0D;
  public int jdField_byte = 1;
  protected double b = 0.1D;
  protected double jdField_try = 3.0D;
  protected boolean c = false;
  private double jdField_do = 0.0D;
  private long jdField_goto = 0L;
  private long jdField_if = 0L;
  private long jdField_new = 0L;
  private double jdField_else = 0.0D;
  private double jdField_case = 0.0D;
  
  public p(TeamRobot paramTeamRobot, l paramL)
  {
    jdField_long = paramTeamRobot;
    jdField_for = paramL;
  }
  
  public void a()
  {
    jdField_char = false;
    if (jdField_long.getOthers() > 4)
    {
      jdField_long.setTurnGunRight(180.0D);
      jdField_long.turnRadarRight(360.0D);
    }
  }
  
  protected n jdMethod_do()
  {
    double d1 = Double.POSITIVE_INFINITY;
    Object localObject = null;
    Iterator localIterator = jdField_for.values().iterator();
    while (localIterator.hasNext())
    {
      n localN = (n)localIterator.next();
      double d2 = localN.a(jdField_long) * (localN == jdField_for.jdField_for ? 0.9D : 1.0D) * (jdField_goto == jdField_for.jdField_int ? 0.9D : 1.0D) * (jdField_char ? 0.8D : 1.0D);
      if ((!jdField_long.isTeammate(jdField_goto)) && (d) && (d2 < d1) && (jdField_try > jdField_long.getTime() - 32L))
      {
        localObject = localN;
        d1 = d2;
      }
    }
    return localObject;
  }
  
  public abstract double a(n paramN);
  
  public abstract double a(n paramN, double paramDouble1, double paramDouble2);
  
  public void a(ScannedRobotEvent paramScannedRobotEvent) {}
  
  public void a(BulletHitEvent paramBulletHitEvent)
  {
    jdField_new += 1L;
    jdField_case += paramBulletHitEvent.getBullet().getPower();
  }
  
  public void a(BulletHitBulletEvent paramBulletHitBulletEvent) {}
  
  public void a(BulletMissedEvent paramBulletMissedEvent) {}
  
  public void a(MessageEvent paramMessageEvent) {}
  
  public void jdMethod_if()
  {
    Bullet localBullet = null;
    if ((jdField_for.jdField_for != null) && (!jdField_for.jdField_for.d)) {
      jdField_for.jdField_for = null;
    }
    if (jdField_for.jdField_for == null)
    {
      jdField_char = false;
      jdField_for.jdField_for = jdMethod_do();
    }
    if (jdField_for.jdField_for != null)
    {
      if (!jdField_char) {
        jdField_for.jdField_for = jdMethod_do();
      }
      if (jdField_for.jdField_for == null) {
        return;
      }
      a = a(jdField_for.jdField_for);
      MovSimStat[] arrayOfMovSimStat = jdField_int.a(1, jdField_long);
      double d1 = 0a;
      double d2 = 0jdField_int;
      if ((jdField_long.getGunHeat() >= jdField_long.getGunCoolingRate() * 2.0D) || (jdField_long.getEnergy() < a) || (a == 0.0D))
      {
        jdField_char = false;
        if (jdField_void) {
          jdField_long.setTurnGunRight(b.jdMethod_for(b.jdMethod_if(d1, d2, jdField_for.jdField_for.s, jdField_for.jdField_for.p) - jdField_long.getGunHeading()));
        }
      }
      else if ((jdField_char) && (jdField_long.getGunTurnRemaining() == 0.0D) && (jdField_long.getGunHeat() == 0.0D))
      {
        localBullet = jdField_long.setFireBullet(a);
        jdField_char = false;
      }
      else
      {
        if ((jdField_char) && (jdField_long.getGunTurnRemaining() != 0.0D) && (jdField_long.getGunHeat() == 0.0D)) {
          jdField_goto += 1L;
        }
        if ((jdField_for.jdField_for.c == 0.0D) && (jdField_for.jdField_for.jdField_byte == 0.0D))
        {
          a = 0.1D;
          jdField_do = b.jdMethod_if(d1, d2, jdField_for.jdField_for.s, jdField_for.jdField_for.p);
        }
        else
        {
          jdField_do = a(jdField_for.jdField_for, d1, d2);
        }
        if (jdField_do != 10000.0D)
        {
          jdField_long.setTurnGunRight(b.jdMethod_for(jdField_do - jdField_long.getGunHeading()));
          if (c) {
            jdField_long.setTurnRight(jdField_long.getGunTurnRemaining());
          }
          jdField_char = true;
        }
        else
        {
          double d3 = b.jdMethod_if(d1, d2, jdField_for.jdField_for.s, jdField_for.jdField_for.p);
          jdField_long.setTurnGunRight(b.jdMethod_for(d3 - jdField_long.getGunHeading()));
        }
      }
    }
    else
    {
      jdField_long.setTurnGunRight(jdField_long.getRadarTurnRemaining());
      if (jdField_long.getOthers() == 0) {
        jdField_long.setFire(0.1D);
      }
    }
    if (localBullet != null) {
      a(localBullet);
    }
  }
  
  public void a(Bullet paramBullet)
  {
    jdField_if += 1L;
    jdField_else += paramBullet.getPower();
  }
  
  public void jdMethod_for()
  {
    if (jdField_byte > 1)
    {
      jdField_long.out.println("Bullets fired/hit: " + jdField_if + "/" + jdField_new + " (" + Math.round(jdField_new * 1000.0D / jdField_if) / 10.0D + "%)");
      jdField_long.out.println("Power fired/hit: " + (int)jdField_else + "/" + (int)jdField_case + " (" + Math.round(jdField_case * 1000.0D / jdField_else) / 10.0D + "%)");
      jdField_long.out.println("Shot oportunities missed: " + jdField_goto);
    }
  }
  
  public void a(Graphics2D paramGraphics2D) {}
}
