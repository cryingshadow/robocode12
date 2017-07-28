package abc;

import java.awt.Graphics2D;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import robocode.Bullet;
import robocode.BulletHitBulletEvent;
import robocode.BulletHitEvent;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.RobotDeathEvent;
import robocode.ScannedRobotEvent;
import robocode.TeamRobot;

public class l
  extends HashMap
{
  private TeamRobot jdField_try;
  public n jdField_for;
  public String jdField_int;
  private int jdField_do = 1;
  private long jdField_if;
  public int a = 0;
  static final long jdField_new = 1L;
  
  public l(TeamRobot paramTeamRobot)
  {
    jdField_try = paramTeamRobot;
    a();
  }
  
  public void a()
  {
    jdField_if = 5L;
    Iterator localIterator = values().iterator();
    while (localIterator.hasNext())
    {
      n localN = (n)localIterator.next();
      localN.a();
    }
    jdField_for = null;
  }
  
  public void jdMethod_do()
  {
    Iterator localIterator = values().iterator();
    while (localIterator.hasNext())
    {
      n localN = (n)localIterator.next();
      localN.jdMethod_if();
    }
  }
  
  public void jdMethod_if()
  {
    long l = jdField_try.getTime();
    Object localObject = null;
    Iterator localIterator1 = values().iterator();
    while (localIterator1.hasNext())
    {
      n localN1 = (n)localIterator1.next();
      if (d)
      {
        localObject = localN1;
        break;
      }
    }
    double d1;
    if (jdField_try.getOthers() == 0)
    {
      d1 = 360.0D - jdField_try.getRadarHeading();
      jdField_try.setTurnRadarRight(d1 < 90.0D ? d1 + 360.0D : d1);
    }
    else if ((jdField_try.getOthers() == 1) && (localObject != null) && (jdField_try.getTime() - jdField_try < 5L))
    {
      d1 = b.jdMethod_for(jdField_try.getRadarHeading() - b.a(jdField_try, s, p));
      if (d1 < 0.0D) {
        d1 -= 15.0D;
      } else {
        d1 += 15.0D;
      }
      jdField_try.setTurnRadarLeft(d1);
    }
    else
    {
      int i = 0;
      int j = 0;
      Iterator localIterator2 = values().iterator();
      while (localIterator2.hasNext())
      {
        n localN2 = (n)localIterator2.next();
        if ((!jdField_try.isTeammate(jdField_goto)) && (d) && (jdField_try <= l) && (l - jdField_try < 20L))
        {
          if (jdField_try < jdField_if)
          {
            i = 1;
            j = 1;
            break;
          }
          double d2 = b.jdMethod_for(jdField_try.getRadarHeading() - b.a(jdField_try, s, p));
          if (d2 > 0.0D) {
            j = 1;
          }
          if (d2 < 0.0D) {
            i = 1;
          }
        }
      }
      if (((i != 0) || (j != 0)) && (((jdField_do == 1) && (i == 0)) || ((jdField_do == -1) && (j == 0))))
      {
        jdField_do = (-jdField_do);
        jdField_if = l;
      }
      jdField_try.setTurnRadarRight(10000 * jdField_do);
    }
  }
  
  public void a(ScannedRobotEvent paramScannedRobotEvent)
  {
    n localN = (n)get(paramScannedRobotEvent.getName());
    if (localN == null) {
      put(paramScannedRobotEvent.getName(), localN = new n(jdField_try, paramScannedRobotEvent.getName()));
    }
    localN.a(paramScannedRobotEvent);
    if ((jdField_try.getOthers() == 1) && (jdField_for == null)) {
      jdField_for = localN;
    }
  }
  
  public void a(RobotDeathEvent paramRobotDeathEvent)
  {
    n localN = (n)get(paramRobotDeathEvent.getName());
    if (localN != null) {
      d = false;
    }
  }
  
  public void a(BulletHitEvent paramBulletHitEvent)
  {
    n localN = (n)get(paramBulletHitEvent.getName());
    if (localN != null) {
      localN.a(paramBulletHitEvent);
    }
  }
  
  public void a(HitRobotEvent paramHitRobotEvent)
  {
    n localN = (n)get(paramHitRobotEvent.getName());
    if (localN != null) {
      localN.a(paramHitRobotEvent);
    }
  }
  
  public void a(HitByBulletEvent paramHitByBulletEvent)
  {
    jdField_int = paramHitByBulletEvent.getName();
    n localN = (n)get(paramHitByBulletEvent.getName());
    if (localN != null) {
      localN.a(paramHitByBulletEvent);
    }
  }
  
  public void a(BulletHitBulletEvent paramBulletHitBulletEvent)
  {
    n localN = (n)get(paramBulletHitBulletEvent.getHitBullet().getName());
    if (localN != null) {
      localN.a(paramBulletHitBulletEvent);
    }
  }
  
  public void a(Graphics2D paramGraphics2D) {}
}
