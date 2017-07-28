package abc;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import robocode.Bullet;
import robocode.BulletHitEvent;
import robocode.ScannedRobotEvent;
import robocode.TeamRobot;

public class d
{
  private static double jdField_int;
  private TeamRobot jdField_goto;
  private l jdField_do;
  private HashMap jdField_try;
  private long a = 0L;
  private double jdField_else = 0.0D;
  private double jdField_for = 0.0D;
  private double jdField_if = 0.0D;
  private double jdField_long = 0.0D;
  double jdField_byte = 3.0D;
  private long jdField_char = 0L;
  private double jdField_case = 0.0D;
  public ArrayList jdField_new;
  
  public d(TeamRobot paramTeamRobot, l paramL, HashMap paramHashMap)
  {
    jdField_goto = paramTeamRobot;
    jdField_do = paramL;
    jdField_try = paramHashMap;
    int = jdField_goto.getGunCoolingRate();
    jdField_new = new ArrayList();
  }
  
  public void a()
  {
    jdField_new.clear();
    a = 0L;
    jdField_long = 3.0D;
    jdField_else = 100.0D;
  }
  
  public void a(BulletHitEvent paramBulletHitEvent)
  {
    jdField_char = paramBulletHitEvent.getTime();
    jdField_case = paramBulletHitEvent.getBullet().getPower();
  }
  
  public void a(ScannedRobotEvent paramScannedRobotEvent)
  {
    double d1 = jdField_goto.getHeading() + paramScannedRobotEvent.getBearing();
    double d2 = jdField_goto.getX() + paramScannedRobotEvent.getDistance() * b.jdMethod_if(d1);
    double d3 = jdField_goto.getY() + paramScannedRobotEvent.getDistance() * b.jdMethod_new(d1);
    double d4 = jdField_else - paramScannedRobotEvent.getEnergy();
    long l1 = a + (paramScannedRobotEvent.getTime() - a) / 2L;
    double d5 = jdField_for + (d2 - jdField_for) / 2.0D;
    double d6 = jdField_if + (d3 - jdField_if) / 2.0D;
    if (jdField_long > 0.0D)
    {
      jdField_long -= (paramScannedRobotEvent.getTime() - a) * int;
      if (jdField_long <= 0.0D) {
        jdField_long = 0.0D;
      }
    }
    double d7 = 0.0D;
    Object localObject2;
    Object localObject1;
    Iterator localIterator1;
    k localK;
    long l2;
    double d9;
    double d11;
    if (d4 > 0.0D)
    {
      if ((jdField_char > a) && (jdField_char <= paramScannedRobotEvent.getTime())) {
        d4 -= 4.0D * jdField_case + 2.0D * Math.max(jdField_case - 1.0D, 0.0D);
      }
      localObject2 = jdField_try.values().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (d)((Iterator)localObject2).next();
        if (localObject1 != this)
        {
          localIterator1 = jdField_new.iterator();
          while (localIterator1.hasNext())
          {
            localK = (k)localIterator1.next();
            l2 = l1 - jdField_if;
            d9 = l2 * jdField_do;
            d11 = b.a(jdField_case, jdField_byte, d5, d6);
            if (Math.abs(d9 - d11) < jdField_do * 4.0D) {
              d7 += jdField_try;
            }
          }
        }
      }
    }
    if ((d4 > 0.0D) && (d7 == 0.0D) && (d4 <= 3.0D)) {
      jdField_byte = d4;
    }
    if (d4 > 3.0D)
    {
      localObject2 = jdField_try.values().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (d)((Iterator)localObject2).next();
        if (localObject1 != this)
        {
          localIterator1 = jdField_new.iterator();
          while (localIterator1.hasNext())
          {
            localK = (k)localIterator1.next();
            l2 = l1 - jdField_if;
            d9 = l2 * jdField_do;
            d11 = b.a(jdField_case, jdField_byte, d5, d6);
            if (Math.abs(d9 - d11) < jdField_do * 2.0D)
            {
              if (Math.abs(jdField_try + jdField_byte - d4) < 0.1D)
              {
                jdField_new.remove(localK);
                d4 = jdField_byte;
                break;
              }
              if (Math.abs(jdField_try - d4) < 0.1D)
              {
                jdField_new.remove(localK);
                d4 = 0.0D;
                break;
              }
            }
          }
        }
      }
    }
    if ((jdField_long <= 0.5D) && (d4 > 0.09D) && (d4 < 3.01D))
    {
      jdField_long = (1.0D + Math.min(3.0D, d4) / 5.0D);
      localObject1 = new n(jdField_goto, "me");
      s = jdField_goto.getX();
      p = jdField_goto.getY();
      localObject2 = new k(l1, d5, d6, d4);
      jdField_new = b.jdMethod_if(d5, d6, s, p);
      if (jdField_goto.getOthers() < 4) {
        jdField_new.add(localObject2);
      }
      double d8 = b.a(d5, d6, s, p);
      int i = 1;
      Iterator localIterator2 = jdField_do.values().iterator();
      while (localIterator2.hasNext())
      {
        localObject3 = (n)localIterator2.next();
        if ((d) && (jdField_goto != paramScannedRobotEvent.getName()))
        {
          double d10 = b.a(d5, d6, s, p);
          if (d10 < d8 * (i != 0 ? 1.1D : 1.0D))
          {
            i = 0;
            localObject1 = localObject3;
            d8 = d10;
          }
        }
      }
      Object localObject3 = new k(l1, d5, d6, Math.min(3.0D, d4));
      jdField_new = b.jdMethod_if(d5, d6, s, p);
      jdField_new.add(localObject3);
    }
    a = paramScannedRobotEvent.getTime();
    jdField_else = paramScannedRobotEvent.getEnergy();
    jdField_for = d2;
    jdField_if = d3;
  }
  
  public void jdMethod_if()
  {
    long l1 = jdField_goto.getTime();
    Iterator localIterator = jdField_new.iterator();
    while (localIterator.hasNext())
    {
      k localK = (k)localIterator.next();
      long l2 = l1 - jdField_if;
      double d = l2 * jdField_do;
      if (d > 1000.0D) {
        localIterator.remove();
      }
    }
  }
  
  public void a(Graphics2D paramGraphics2D)
  {
    long l = jdField_goto.getTime();
    Iterator localIterator = jdField_new.iterator();
    while (localIterator.hasNext())
    {
      k localK = (k)localIterator.next();
      paramGraphics2D.setColor(Color.blue);
    }
  }
}
