package abc;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import robocode.BulletHitBulletEvent;
import robocode.HitByBulletEvent;
import robocode.TeamRobot;

public class s
  extends o
{
  private double c = 1.0D;
  private double jdField_char = 0.0D;
  private double jdField_void = 8.0D;
  private double e = 8.0D;
  private double jdField_try = 450.0D;
  private double jdField_case = 200.0D;
  private static double d;
  private static double b;
  private static double jdField_goto;
  private static double jdField_int;
  public int jdField_if = 1;
  public boolean a = true;
  private n jdField_long;
  private r jdField_else;
  private HashMap jdField_byte;
  private e jdField_new;
  
  public s(TeamRobot paramTeamRobot, l paramL)
  {
    super(paramTeamRobot, paramL);
    jdField_for.setColors(Color.darkGray, Color.red.darker(), Color.orange.darker().darker().darker());
    jdField_else = new r(jdField_for, 15);
    jdField_byte = new HashMap();
    d = jdField_for.getWidth() / 2.0D;
    b = 125.0D + d;
    goto = jdField_for.getBattleFieldWidth();
    int = jdField_for.getBattleFieldHeight();
  }
  
  public void a()
  {
    jdField_else.a();
    jdField_long = null;
    Iterator localIterator = jdField_byte.values().iterator();
    while (localIterator.hasNext())
    {
      e localE = (e)localIterator.next();
      localE.a();
    }
  }
  
  public void a(HitByBulletEvent paramHitByBulletEvent)
  {
    if (jdField_new != null) {
      jdField_new.a(paramHitByBulletEvent);
    }
  }
  
  public void a(BulletHitBulletEvent paramBulletHitBulletEvent)
  {
    if (jdField_new != null) {
      jdField_new.a(paramBulletHitBulletEvent);
    }
  }
  
  public void jdMethod_if()
  {
    if ((jdField_do.jdField_for != null) && (jdField_long != jdField_do.jdField_for))
    {
      jdField_long = jdField_do.jdField_for;
      jdField_new = ((e)jdField_byte.get(jdField_long));
      if (jdField_new == null) {
        jdField_byte.put(jdField_long, this.new = new e(jdField_for, jdField_long));
      }
      jdField_new.jdField_int = jdField_if;
      jdField_new.jdField_for = a;
      jdField_new.a();
    }
    if (jdField_long != null)
    {
      jdField_else.jdMethod_do();
      jdField_new.a(jdField_else);
      double[][] arrayOfDouble = { { c, e, a(c, e) }, { -c, e, a(-c, e) }, { c, 0.0D, a(Math.random() > 0.5D ? c : -c, 0.0D) } };
      int i = 0;
      for (int j = 1; j < arrayOfDouble.length; j++) {
        if (arrayOfDouble[j][2] < arrayOfDouble[i][2]) {
          i = j;
        }
      }
      c = arrayOfDouble[i][0];
      jdField_void = arrayOfDouble[i][1];
      double d1 = jdField_long.s;
      double d2 = jdField_long.p;
      double d3 = Double.POSITIVE_INFINITY;
      for (int k = 0; k < jdField_new.jdField_try.size(); k++)
      {
        g localG = (g)jdField_new.jdField_try.get(k);
        double d4 = localG.a(jdField_for);
        if ((d4 > 0.0D) && (d4 < d3) && (!a) && (!k))
        {
          d3 = d4;
          d1 = d;
          d2 = b;
        }
      }
      a(jdField_for.getX(), jdField_for.getY(), jdField_for.getHeading(), jdField_for.getVelocity(), d1, d2);
    }
    b.jdMethod_if(jdField_for, jdField_char);
    if (Math.abs(jdField_for.getTurnRemaining()) > 22.5D) {
      jdField_for.setMaxVelocity(3.0D);
    } else {
      jdField_for.setMaxVelocity(jdField_void);
    }
    jdField_for.setAhead(100.0D * c);
  }
  
  private void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
  {
    double d1 = b.jdMethod_if(paramDouble1, paramDouble2, paramDouble5, paramDouble6);
    double d2 = b.a(paramDouble1, paramDouble2, paramDouble5, paramDouble6);
    double d3 = b.jdMethod_for(d1 - paramDouble3);
    if (d3 > 0.0D) {
      jdField_char = (d1 - 90.0D);
    } else {
      jdField_char = (d1 + 90.0D);
    }
    double d4 = b.jdMethod_int((d2 - jdField_try) / 500.0D) * 45.0D;
    if (d3 > 0.0D)
    {
      if (d2 > jdField_try) {
        jdField_char += d4 * c;
      } else {
        jdField_char -= d4 * c;
      }
    }
    else if (d2 > jdField_try) {
      jdField_char -= d4 * c;
    } else {
      jdField_char += d4 * c;
    }
    jdField_char %= 360.0D;
    if (jdField_char < 0.0D) {
      jdField_char += 360.0D;
    }
    double d5 = jdField_char;
    if (c < 0.0D) {
      d5 = (jdField_char + 180.0D) % 360.0D;
    }
    double d6 = b.jdMethod_for(d1 - d5);
    double d7;
    if (paramDouble2 < b + d)
    {
      d7 = b - paramDouble2 + d;
      d7 /= b;
      d7 *= 90.0D;
      if ((d6 > 0.0D) && (d5 < 270.0D) && (d5 > 90.0D)) {
        d5 = Math.max(180.0D + d7, d5);
      }
      if ((d6 < 0.0D) && (d5 < 270.0D) && (d5 > 90.0D)) {
        d5 = Math.min(180.0D - d7, d5);
      }
    }
    if (paramDouble2 > int - b - d)
    {
      d7 = paramDouble2 + d - (int - b);
      d7 /= b;
      d7 *= 90.0D;
      if (d6 > 0.0D)
      {
        if (d5 > 270.0D) {
          d5 = 0.0D;
        }
        if ((d5 < 90.0D) || (d5 > 270.0D)) {
          d5 = Math.max(d7, d5);
        }
      }
      if (d6 < 0.0D)
      {
        if (d5 < 90.0D) {
          d5 = 360.0D;
        }
        if ((d5 < 90.0D) || (d5 > 270.0D)) {
          d5 = Math.min(360.0D - d7, d5);
        }
      }
    }
    if (paramDouble1 < b + d)
    {
      d7 = b - paramDouble1 + d;
      d7 /= b;
      d7 *= 90.0D;
      if ((d6 > 0.0D) && (d5 > 180.0D)) {
        d5 = Math.max(270.0D + d7, d5);
      }
      if ((d6 < 0.0D) && (d5 > 180.0D)) {
        d5 = Math.min(270.0D - d7, d5);
      }
    }
    if (paramDouble1 > goto - b - d)
    {
      d7 = paramDouble1 + d - (goto - b);
      d7 /= b;
      d7 *= 90.0D;
      if ((d6 > 0.0D) && (d5 < 180.0D)) {
        d5 = Math.max(90.0D + d7, d5);
      }
      if ((d6 < 0.0D) && (d5 < 180.0D)) {
        d5 = Math.min(90.0D - d7, d5);
      }
    }
    jdField_char = d5;
    if (c < 0.0D) {
      jdField_char = ((d5 + 180.0D) % 360.0D);
    }
  }
  
  public double a(double paramDouble1, double paramDouble2)
  {
    double d1 = 0.0D;
    double d2 = b.jdMethod_if(jdField_for, jdField_long.s, jdField_long.p);
    double d3 = jdField_char;
    double d4 = c;
    double d5 = jdField_void;
    c = paramDouble1;
    jdField_void = paramDouble2;
    double d6 = jdField_for.getVelocity();
    double d7 = jdField_for.getX();
    double d8 = jdField_for.getY();
    double d9 = jdField_for.getHeading();
    double d10 = jdField_long.s;
    double d11 = jdField_long.p;
    long l = jdField_for.getTime();
    int i = jdField_new.jdField_try.size();
    g[] arrayOfG = new g[i];
    for (int j = 0; j < i; j++) {
      arrayOfG[j] = ((g)jdField_new.jdField_try.get(j));
    }
    boolean[] arrayOfBoolean = new boolean[i];
    for (int k = 0; k < i; k++) {
      arrayOfBoolean[k] = false;
    }
    k = i;
    while ((k > 0) || (l - jdField_for.getTime() < 15L))
    {
      d10 = jdField_long.s;
      d11 = jdField_long.p;
      d12 = Double.POSITIVE_INFINITY;
      for (int m = 0; m < i; m++) {
        if (arrayOfG[m] != null)
        {
          double d14 = arrayOfG[m].a(d7, d8, l);
          if ((d14 < -25.0D - j) || (a) || (k))
          {
            arrayOfG[m] = null;
            k--;
          }
          else
          {
            if ((d14 < j) && (arrayOfBoolean[m] == 0))
            {
              arrayOfBoolean[m] = true;
              double d16 = d7;
              double d18 = d8;
              double d20 = c / Math.pow(Math.max(arrayOfG[m].a(jdField_for) / j, 1.0D), 2.0D);
              double d21 = b.jdMethod_for(b.jdMethod_if(d, b, d16, d18) - b.jdMethod_if(d, b, g, e));
              double d22 = Math.toDegrees(Math.asin(8.0D / j));
              double d23 = Math.min(Math.max(d21, -d22), d22);
              d1 += jdField_new.jdField_char.a(arrayOfG[m], d23 * jdField_try / d22) * d20;
            }
            if ((arrayOfG[m] != null) && (d14 < d12) && (d14 > 0.0D))
            {
              d12 = d14;
              d10 = d;
              d11 = b;
            }
          }
        }
      }
      a(d7, d8, d9, d6, d10, d11);
      double d13 = 10.0D - 0.75D * Math.abs(d6);
      double d15 = b.jdMethod_for(jdField_char - d9);
      double d17 = Math.abs(d15) > 22.5D ? 3.0D : jdField_void;
      if (d15 < 0.0D) {
        d15 = Math.max(d15, -d13);
      } else {
        d15 = Math.min(d15, d13);
      }
      d9 += d15;
      double d19 = d17 * c;
      if (d6 < 0.0D)
      {
        if (d6 < d19) {
          d6 = Math.min(d6 + 2.0D, d19);
        } else {
          d6 = Math.max(d6 - 1.0D, d19);
        }
      }
      else if (d6 > d19) {
        d6 = Math.max(d6 - 2.0D, d19);
      } else {
        d6 = Math.min(d6 + 1.0D, d19);
      }
      d7 += b.jdMethod_if(d9) * d6;
      d8 += b.jdMethod_new(d9) * d6;
      if ((d7 < 18.0D) || (d7 > goto - 18.0D) || (d8 < 18.0D) || (d8 > int - 18.0D))
      {
        d6 = 0.0D;
        d7 = Math.max(18.0D, Math.min(goto - 18.0D, d7));
        d8 = Math.max(18.0D, Math.min(int - 18.0D, d8));
        return Double.POSITIVE_INFINITY;
      }
      l += 1L;
    }
    double d12 = b.a(d7, d8, jdField_long.s, jdField_long.p);
    if ((d12 < jdField_case) && (d12 < d2)) {
      return Double.POSITIVE_INFINITY;
    }
    jdField_char = d3;
    c = d4;
    jdField_void = d5;
    return d1;
  }
  
  public void jdMethod_do()
  {
    Iterator localIterator = jdField_byte.values().iterator();
    while (localIterator.hasNext())
    {
      e localE = (e)localIterator.next();
      localE.jdMethod_if();
    }
  }
  
  public void a(Graphics2D paramGraphics2D)
  {
    Iterator localIterator = jdField_byte.values().iterator();
    while (localIterator.hasNext())
    {
      e localE = (e)localIterator.next();
      localE.a(paramGraphics2D);
    }
  }
}
