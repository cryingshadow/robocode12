package abc;

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import robocode.Bullet;
import robocode.BulletHitBulletEvent;
import robocode.HitByBulletEvent;
import robocode.TeamRobot;

public class e
{
  TeamRobot jdField_else;
  n jdField_byte;
  r jdField_do;
  public ArrayList jdField_try;
  public i jdField_char;
  public int jdField_int = 1;
  public boolean jdField_for = false;
  long a = 0L;
  long jdField_if = 0L;
  long jdField_case = 0L;
  long jdField_new = 0L;
  
  public e(TeamRobot paramTeamRobot, n paramN)
  {
    jdField_else = paramTeamRobot;
    jdField_byte = paramN;
    jdField_try = new ArrayList();
    jdField_do = new r(paramTeamRobot, 10);
  }
  
  public void a()
  {
    if (jdField_char == null) {
      jdField_char = new i(jdField_else, jdField_byte, 400, jdField_int, jdField_for);
    }
    jdField_try.clear();
  }
  
  public void jdMethod_if()
  {
    if (jdField_int > 1)
    {
      jdField_else.out.println(jdField_byte.j);
      jdField_else.out.println("Bullets fired/hit: " + a + "/" + jdField_if + " (" + Math.round(jdField_if * 1000.0D / a) / 10.0D + "%)");
      jdField_else.out.println("Power fired/hit: " + (int)jdField_case + "/" + (int)jdField_new + " (" + Math.round(jdField_new * 1000.0D / jdField_case) / 10.0D + "%)");
    }
    jdField_char.jdMethod_do();
  }
  
  public void a(HitByBulletEvent paramHitByBulletEvent)
  {
    if (paramHitByBulletEvent.getBullet().getName().equals(jdField_byte.jdField_goto))
    {
      jdField_if += 1L;
      jdField_new = ((jdField_new + paramHitByBulletEvent.getBullet().getPower()));
    }
    int i = 0;
    for (i = 0; i < jdField_try.size(); i++)
    {
      g localG = (g)jdField_try.get(i);
      long l = jdField_else.getTime() - jdField_char;
      double d1 = l * j;
      double d2 = b.a(paramHitByBulletEvent.getBullet().getX(), paramHitByBulletEvent.getBullet().getY(), d, b);
      double d3 = d2 - d1;
      if ((Math.abs(d3) < 40.0D) && (Math.abs(paramHitByBulletEvent.getBullet().getPower() - c) < 1.0D))
      {
        a = true;
        jdField_new = paramHitByBulletEvent.getBullet().getX();
        jdField_int = paramHitByBulletEvent.getBullet().getY();
        double d4 = b.jdMethod_for(b.jdMethod_if(d, b, jdField_new, jdField_int) - b.jdMethod_if(d, b, g, e));
        double d5 = Math.toDegrees(Math.asin(8.0D / j));
        d4 = Math.min(Math.max(d4, -d5), d5);
        h = (d4 * jdField_try / d5);
        jdField_char.a(localG, h, Math.asin(8.0D / j), i);
        jdField_char.a(jdField_char, i / j, jdField_long, jdField_void, jdField_goto, jdField_case, l, jdField_byte, jdField_else, h, true, false);
        break;
      }
    }
    if ((i == jdField_try.size()) && (jdField_int > 1)) {
      jdField_else.out.println("No match for incoming hit!");
    }
    jdField_char.jdMethod_if();
  }
  
  public void a(BulletHitBulletEvent paramBulletHitBulletEvent)
  {
    int i = 0;
    for (i = 0; i < jdField_try.size(); i++)
    {
      g localG = (g)jdField_try.get(i);
      long l = jdField_else.getTime() - jdField_char;
      double d1 = l * j;
      double d2 = b.a(paramBulletHitBulletEvent.getHitBullet().getX(), paramBulletHitBulletEvent.getHitBullet().getY(), d, b);
      double d3 = d2 - d1;
      if ((Math.abs(d3) < 40.0D) && (Math.abs(paramBulletHitBulletEvent.getHitBullet().getPower() - c) < 1.0D))
      {
        k = true;
        jdField_new = paramBulletHitBulletEvent.getHitBullet().getX();
        jdField_int = paramBulletHitBulletEvent.getHitBullet().getY();
        double d4 = b.jdMethod_for(b.jdMethod_if(d, b, jdField_new, jdField_int) - b.jdMethod_if(d, b, g, e));
        double d5 = Math.toDegrees(Math.asin(8.0D / j));
        d4 = Math.min(Math.max(d4, -d5), d5);
        jdField_char.a(localG, d4 * jdField_try / d5, 0.0D, 0.0D);
        jdField_char.a(jdField_char, i / j, jdField_long, jdField_void, jdField_goto, jdField_case, l, jdField_byte, jdField_else, d4 * jdField_try / d5, false, true);
        break;
      }
    }
    if ((i == jdField_try.size()) && (jdField_int > 1)) {
      jdField_else.out.println("No match for incoming bullet!");
    }
    jdField_char.jdMethod_if();
  }
  
  public void a(r paramR)
  {
    jdField_do.a(jdField_byte.s, jdField_byte.p, jdField_byte.t, jdField_byte.jdField_byte);
    double d2;
    double d3;
    double d4;
    if (jdField_else.getTime() == jdField_byte.r)
    {
      a += 1L;
      jdField_case = ((jdField_case + Math.min(jdField_byte.b, 3.0D)));
      double d1 = 1.5707963267948966D - Math.atan2(paramR.jdMethod_for(1L) - paramR.jdMethod_for(3L), paramR.jdMethod_int(1L) - paramR.jdMethod_int(3L));
      d1 -= Math.toRadians(paramR.jdMethod_do(1L) + (paramR.jdMethod_if(1L) < 0.0D ? 180 : 0));
      d2 = b.a(paramR.jdMethod_int(3L), paramR.jdMethod_for(3L), paramR.jdMethod_int(1L), paramR.jdMethod_for(1L));
      d2 *= Math.cos(d1);
      d1 = 1.5707963267948966D - Math.atan2(paramR.jdMethod_for(1L) - paramR.jdMethod_for(5L), paramR.jdMethod_int(1L) - paramR.jdMethod_int(5L));
      d1 -= Math.toRadians(paramR.jdMethod_do(1L) + (paramR.jdMethod_if(1L) < 0.0D ? 180 : 0));
      d3 = b.a(paramR.jdMethod_int(5L), paramR.jdMethod_for(5L), paramR.jdMethod_int(1L), paramR.jdMethod_for(1L));
      d3 *= Math.cos(d1);
      d1 = 1.5707963267948966D - Math.atan2(paramR.jdMethod_for(1L) - paramR.jdMethod_for(9L), paramR.jdMethod_int(1L) - paramR.jdMethod_int(9L));
      d1 -= Math.toRadians(paramR.jdMethod_do(1L) + (paramR.jdMethod_if(1L) < 0.0D ? 180 : 0));
      d4 = b.a(paramR.jdMethod_int(9L), paramR.jdMethod_for(9L), paramR.jdMethod_int(1L), paramR.jdMethod_for(1L));
      d4 *= Math.cos(d1);
      jdField_try.add(new g(jdField_else, jdField_else.getTime() - 1L, jdField_do.jdMethod_int(1L), jdField_do.jdMethod_for(1L), Math.min(jdField_byte.b, 3.0D), paramR.jdMethod_int(2L), paramR.jdMethod_for(2L), paramR.jdMethod_do(1L), paramR.jdMethod_new(1L), paramR.jdMethod_if(1L), paramR.a(1L), d2, d3, d4));
    }
    for (int i = 0; i < jdField_try.size(); i++)
    {
      g localG = (g)jdField_try.get(i);
      d2 = localG.a(jdField_else);
      if ((d2 < j) && (!jdField_if))
      {
        n = jdField_else.getX();
        m = jdField_else.getY();
        d3 = b.jdMethod_for(b.jdMethod_if(d, b, n, m) - b.jdMethod_if(d, b, g, e));
        d4 = Math.toDegrees(Math.asin(8.0D / j));
        d3 = Math.min(Math.max(d3, -d4), d4);
        h = (d3 * jdField_try / d4);
        jdField_char.a(jdField_char, i / j, jdField_long, jdField_void, jdField_goto, jdField_case, l, jdField_byte, jdField_else, h, false, false);
        jdField_if = true;
      }
      if (d2 < -50.0D)
      {
        if ((!jdField_if) && (jdField_int > 1)) {
          jdField_else.out.println(jdField_else.getTime() + ": unprocessed bullet: power=" + c);
        }
        jdField_try.remove(i);
        jdField_char.jdField_char.remove(localG);
        i--;
      }
    }
  }
  
  public void a(Graphics2D paramGraphics2D)
  {
    Iterator localIterator = jdField_try.iterator();
    while (localIterator.hasNext())
    {
      g localG = (g)localIterator.next();
      long l = jdField_else.getTime() - jdField_char;
      double d1 = l * j;
      double d2 = localG.a(jdField_else);
      if (d2 > -25.0D - j)
      {
        if (d2 < 25.0D + j) {
          paramGraphics2D.setColor(Color.red);
        } else {
          paramGraphics2D.setColor(Color.blue);
        }
        paramGraphics2D.drawOval((int)(d - d1), (int)(b - d1), (int)(d1 * 2.0D), (int)(d1 * 2.0D));
        double d3 = b.jdMethod_if(d, b, g, e);
        paramGraphics2D.setColor(Color.blue.darker());
        paramGraphics2D.drawLine((int)d, (int)b, (int)(d + b.jdMethod_if(d3) * d1), (int)(b + b.jdMethod_new(d3) * d1));
      }
    }
  }
}
