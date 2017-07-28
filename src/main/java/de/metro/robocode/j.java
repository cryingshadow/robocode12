package abc;

import apv.MovSimStat;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import robocode.BulletHitEvent;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.ScannedRobotEvent;
import robocode.TeamRobot;
import robocode.util.Utils;

public class j
  extends o
{
  private long i = 25L;
  private static double l;
  private static double g;
  private static double h;
  private boolean k = false;
  String m = "";
  HashMap j;
  MovSimStat[] f;
  
  public j(TeamRobot paramTeamRobot, l paramL)
  {
    super(paramTeamRobot, paramL);
    l = jdField_for.getWidth() / 2.0D;
    g = jdField_for.getBattleFieldWidth();
    h = jdField_for.getBattleFieldHeight();
    if (paramTeamRobot.getTeammates() != null) {
      k = (paramTeamRobot.getTeammates().length > 0);
    }
    j = new HashMap();
  }
  
  public void a()
  {
    m = "";
    Iterator localIterator = j.values().iterator();
    while (localIterator.hasNext())
    {
      d localD = (d)localIterator.next();
      localD.a();
    }
  }
  
  public void a(ScannedRobotEvent paramScannedRobotEvent)
  {
    d localD = (d)j.get(paramScannedRobotEvent.getName());
    if (localD == null) {
      j.put(paramScannedRobotEvent.getName(), localD = new d(jdField_for, jdField_do, j));
    }
    localD.a(paramScannedRobotEvent);
  }
  
  public void a(HitRobotEvent paramHitRobotEvent)
  {
    i = 0L;
  }
  
  public void a(HitByBulletEvent paramHitByBulletEvent)
  {
    m = paramHitByBulletEvent.getName();
  }
  
  public void a(BulletHitEvent paramBulletHitEvent)
  {
    d localD = (d)j.get(paramBulletHitEvent.getName());
    if (localD != null) {
      localD.a(paramBulletHitEvent);
    }
  }
  
  public void jdMethod_if()
  {
    Iterator localIterator1 = j.values().iterator();
    while (localIterator1.hasNext())
    {
      d localD1 = (d)localIterator1.next();
      localD1.jdMethod_if();
    }
    i -= 1L;
    double d1 = jdField_for.getX();
    double d2 = jdField_for.getY();
    double d3 = jdField_for.getVelocity();
    long l1 = jdField_for.getTime();
    if (l1 < 10L) {
      return;
    }
    Object localObject1;
    Object localObject2;
    if (i < 1L)
    {
      localObject1 = jdField_do.values().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        n localN1 = (n)((Iterator)localObject1).next();
        l = 0.0D;
        x = 0.0D;
        k = 0.0D;
        w = 0.0D;
        if (d)
        {
          jdField_else = 1200.0D;
          if (!jdField_for.isTeammate(jdField_goto))
          {
            double d4 = b.a(d1, d2, s, p);
            localObject2 = jdField_do.values().iterator();
            while (((Iterator)localObject2).hasNext())
            {
              n localN2 = (n)((Iterator)localObject2).next();
              if ((d) && (localN2 != localN1) && ((!k) || (jdField_for.isTeammate(jdField_goto))))
              {
                double d7 = Math.max(100.0D, b.a(s, p, s, p));
                if (d7 < jdField_else) {
                  jdField_else = d7;
                }
              }
            }
            e = false;
            if (jdField_else + 100.0D > d4) {
              e = true;
            }
          }
        }
      }
    }
    if (i < 1L)
    {
      int n = 18;
      localObject1 = new double[n];
      double[] arrayOfDouble = new double[n];
      double d5 = 1200.0D;
      Iterator localIterator2 = jdField_do.values().iterator();
      while (localIterator2.hasNext())
      {
        localObject2 = (n)localIterator2.next();
        if ((d) && (!jdField_for.isTeammate(jdField_goto)))
        {
          d8 = b.a(d1, d2, s, p);
          if (d8 < d5) {
            d5 = d8;
          }
        }
      }
      if (d5 == 1200.0D)
      {
        double d6 = g / 2.0D;
        d8 = h / 2.0D;
        b.jdMethod_do(jdField_for, d6, d8);
        return;
      }
      d5 = Math.min(Math.max(d5, 200.0D), 600.0D);
      i = 5L;
      int i1 = 5;
      int i2 = 0;
      double d8 = Double.POSITIVE_INFINITY;
      double d9 = jdField_for.getHeading();
      for (int i3 = 0; i3 < n; i3++)
      {
        localObject1[i3] = 0.0D;
        arrayOfDouble[i3] = (i3 * (360 / n));
        double d11 = b.jdMethod_for(arrayOfDouble[i3] - d9);
        double d13 = 1000.0D;
        if (Math.abs(d11) > 90.0D)
        {
          d13 *= -1.0D;
          if (d11 > 0.0D) {
            d11 -= 180.0D;
          } else {
            d11 += 180.0D;
          }
        }
        jdField_for.setTurnRight(d11);
        jdField_for.setAhead(d13);
        MovSimStat[] arrayOfMovSimStat = a((int)i * i1, d1, d2, d3, Math.toRadians(d9), d13, Math.toRadians(d11));
        Object localObject3 = j.values().iterator();
        Object localObject4;
        while (((Iterator)localObject3).hasNext())
        {
          d localD2 = (d)((Iterator)localObject3).next();
          Iterator localIterator3 = jdField_new.iterator();
          while (localIterator3.hasNext())
          {
            localObject4 = (k)localIterator3.next();
            double d15 = jdField_do * (l1 - jdField_if);
            double d17 = b.a(jdField_case, jdField_byte, d1, d2);
            jdField_int = (d15 > d17);
          }
        }
        for (int i4 = 0; i4 < i * i1; i4++)
        {
          if ((a < 2.0D + l) || (a > g - 2.0D - l) || (jdField_int < 2.0D + l) || (jdField_int > h - 2.0D - l)) {
            localObject1[i3] += 1.0D;
          }
          localObject4 = jdField_do.values().iterator();
          double d16;
          while (((Iterator)localObject4).hasNext())
          {
            localObject3 = (n)((Iterator)localObject4).next();
            if (d)
            {
              double d14 = b.a(s, p, a, jdField_int);
              if (!jdField_for.isTeammate(jdField_goto))
              {
                if (k)
                {
                  if (d14 < jdField_else + 100.0D) {
                    localObject1[i3] += c / (d14 * d14);
                  } else {
                    localObject1[i3] -= c / b.jdMethod_int(d14 * d14);
                  }
                }
                else
                {
                  d16 = d14 * (d14 < jdField_else + 100.0D ? 0.5D : 1.0D);
                  localObject1[i3] += c / (1.0D + d16 * d16) / (i4 + 1);
                }
              }
              else if (d14 < 300.0D) {
                localObject1[i3] += 200.0D / (d14 * d14);
              }
            }
          }
          localObject4 = j.values().iterator();
          while (((Iterator)localObject4).hasNext())
          {
            localObject3 = (d)((Iterator)localObject4).next();
            Iterator localIterator4 = jdField_new.iterator();
            while (localIterator4.hasNext())
            {
              k localK = (k)localIterator4.next();
              if (!jdField_int)
              {
                d16 = jdField_do * (l1 + i4 + 1L - jdField_if);
                double d18 = b.a(jdField_case, jdField_byte, a, jdField_int);
                if (d16 > d18)
                {
                  double d19 = b.jdMethod_if(jdField_case, jdField_byte, a, jdField_int);
                  d19 = Math.abs(b.jdMethod_for(d19 - jdField_new));
                  if (d19 < 90.0D) {
                    localObject1[i3] += 1.0D / (1.0D + d19 * d19) / (i4 + 1);
                  }
                  jdField_int = true;
                }
              }
            }
          }
        }
        if (localObject1[i3] < d8)
        {
          d8 = localObject1[i3];
          i2 = i3;
          f = arrayOfMovSimStat;
        }
      }
      double d10 = b.jdMethod_for(arrayOfDouble[i2] - d9);
      double d12 = 1000.0D;
      if (Math.abs(d10) > 90.0D)
      {
        d12 *= -1.0D;
        if (d10 > 0.0D) {
          d10 -= 180.0D;
        } else {
          d10 += 180.0D;
        }
      }
      jdField_for.setTurnRight(d10);
      jdField_for.setAhead(d12);
    }
  }
  
  private MovSimStat[] a(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
  {
    double d1 = Math.toRadians(10.0D);
    double d2 = 8.0D;
    double d3 = 2.0D;
    double d4 = 1.0D;
    MovSimStat[] arrayOfMovSimStat = new MovSimStat[paramInt];
    double d5 = 0.0D;
    int n = 0;
    double d7 = d2;
    double d8 = d1;
    double d6;
    if (paramDouble5 == 0.0D) {
      d6 = 0.0D;
    } else if (paramDouble5 < 0.0D) {
      d6 = -1.0D;
    } else {
      d6 = 1.0D;
    }
    for (int i1 = 0; i1 < paramInt; i1++)
    {
      double d9 = paramDouble4;
      double d10 = Math.min(d8, (0.4D + 0.6D * (1.0D - Math.abs(paramDouble3) / d2)) * d1);
      if (paramDouble6 > 0.0D)
      {
        if (paramDouble6 < d10)
        {
          paramDouble4 += paramDouble6;
          paramDouble6 = 0.0D;
        }
        else
        {
          paramDouble4 += d10;
          paramDouble6 -= d10;
        }
      }
      else if (paramDouble6 < 0.0D) {
        if (paramDouble6 > -d10)
        {
          paramDouble4 += paramDouble6;
          paramDouble6 = 0.0D;
        }
        else
        {
          paramDouble4 -= d10;
          paramDouble6 += d10;
        }
      }
      paramDouble4 = Utils.normalAbsoluteAngle(paramDouble4);
      if ((paramDouble5 != 0.0D) || (paramDouble3 != 0.0D))
      {
        if ((n == 0) && (d6 == 0.0D))
        {
          n = 1;
          if (paramDouble3 > 0.0D) {
            d6 = 1.0D;
          } else if (paramDouble3 < 0.0D) {
            d6 = -1.0D;
          } else {
            d6 = 0.0D;
          }
        }
        double d11 = paramDouble5;
        if (n != 0) {
          if ((d6 == 1.0D) && (paramDouble5 < 0.0D)) {
            d11 = 0.0D;
          } else if ((d6 == -1.0D) && (paramDouble5 > 1.0D)) {
            d11 = 0.0D;
          }
        }
        double d12 = (int)(d3 / 2.0D * (Math.sqrt(4.0D * Math.abs(d11) + 1.0D) - 1.0D));
        if (d6 == -1.0D) {
          d12 = -d12;
        }
        if (n == 0) {
          if (d6 == 1.0D)
          {
            if (paramDouble3 < 0.0D) {
              d5 = d3;
            } else {
              d5 = d4;
            }
            if (paramDouble3 + d5 > d12) {
              n = 1;
            }
          }
          else if (d6 == -1.0D)
          {
            if (paramDouble3 > 0.0D) {
              d5 = -d3;
            } else {
              d5 = -d4;
            }
            if (paramDouble3 + d5 < d12) {
              n = 1;
            }
          }
        }
        if (n != 0)
        {
          if ((paramDouble5 != 0.0D) && (Math.abs(paramDouble3) <= d3) && (Math.abs(paramDouble5) <= d3)) {
            d12 = paramDouble5;
          }
          d13 = d12 - paramDouble3;
          if (d13 > d3) {
            d13 = d3;
          } else if (d13 < -d3) {
            d13 = -d3;
          }
          d5 = d13;
        }
        if ((paramDouble3 > d7) || (paramDouble3 < -d7)) {
          d5 = 0.0D;
        }
        paramDouble3 += d5;
        if (paramDouble3 > d7) {
          paramDouble3 -= Math.min(d3, paramDouble3 - d7);
        }
        if (paramDouble3 < -d7) {
          paramDouble3 += Math.min(d3, -paramDouble3 - d7);
        }
        double d13 = paramDouble3 * Math.sin(paramDouble4);
        double d14 = paramDouble3 * Math.cos(paramDouble4);
        paramDouble1 += d13;
        paramDouble2 += d14;
        if ((n != 0) && (paramDouble3 == 0.0D))
        {
          paramDouble5 = 0.0D;
          d6 = 0.0D;
          n = 0;
          d5 = 0.0D;
        }
        paramDouble5 -= paramDouble3;
        if ((paramDouble1 < 18.0D) || (paramDouble2 < 18.0D) || (paramDouble1 > g - 18.0D) || (paramDouble2 > h - 18.0D))
        {
          paramDouble5 = 0.0D;
          paramDouble6 = 0.0D;
          paramDouble3 = 0.0D;
          d6 = 0.0D;
          paramDouble1 = Math.max(18.0D, Math.min(g - 18.0D, paramDouble1));
          paramDouble2 = Math.max(18.0D, Math.min(h - 18.0D, paramDouble2));
        }
      }
      arrayOfMovSimStat[i1] = new MovSimStat(paramDouble1, paramDouble2, paramDouble3, paramDouble4, Utils.normalRelativeAngle(paramDouble4 - d9));
    }
    return arrayOfMovSimStat;
  }
  
  public void a(Graphics2D paramGraphics2D)
  {
    Iterator localIterator = jdField_do.values().iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (n)localIterator.next();
      if (d) {
        if (!jdField_for.isTeammate(jdField_goto))
        {
          paramGraphics2D.setColor(new Color(1.0F, 0.0F, 0.0F, 0.1F));
          paramGraphics2D.drawOval((int)(s - 3.0D), (int)(p - 3.0D), 6, 6);
          paramGraphics2D.fillOval((int)(s - jdField_else), (int)(p - jdField_else), (int)(jdField_else * 2.0D), (int)(jdField_else * 2.0D));
        }
        else
        {
          paramGraphics2D.setColor(Color.blue);
          paramGraphics2D.drawOval((int)(s - 3.0D), (int)(p - 3.0D), 6, 6);
        }
      }
    }
    localIterator = j.values().iterator();
    while (localIterator.hasNext())
    {
      localObject = (d)localIterator.next();
      ((d)localObject).a(paramGraphics2D);
    }
  }
}
