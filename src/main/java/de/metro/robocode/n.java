package abc;

import robocode.Bullet;
import robocode.BulletHitBulletEvent;
import robocode.BulletHitEvent;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.ScannedRobotEvent;
import robocode.TeamRobot;

public class n
{
  private TeamRobot jdField_new;
  public String jdField_goto;
  public String j;
  public boolean d = true;
  public boolean jdField_char = false;
  public double c;
  public double s;
  public double p;
  public double jdField_byte;
  public double t;
  public long jdField_try;
  public double b = 3.0D;
  public long m = 0L;
  public long r = 0L;
  public long jdField_if = 0L;
  public long a = 0L;
  public long v = 0L;
  public double u = 0.0D;
  public double o;
  public double n;
  public double f = 0.0D;
  public double i;
  public double h;
  public double jdField_void = 0.0D;
  public long jdField_int = 0L;
  public long jdField_for = 0L;
  public long jdField_do = 0L;
  public long jdField_long = 0L;
  public double g = 0.0D;
  private long q = 0L;
  private long jdField_case = 0L;
  boolean e = false;
  double jdField_else = Double.POSITIVE_INFINITY;
  double l = 0.0D;
  double k = 0.0D;
  double x = 0.0D;
  double w = 0.0D;
  
  public n(TeamRobot paramTeamRobot, String paramString)
  {
    jdField_new = paramTeamRobot;
    jdField_goto = paramString;
    j = paramString;
    int i1 = j.indexOf(" ");
    if (i1 > 0) {
      j = j.substring(0, i1);
    }
    i1 = j.lastIndexOf(".");
    if (i1 > 0) {
      j = j.substring(i1 + 1);
    }
    if (j.length() > 15) {
      j = j.substring(0, 15);
    }
  }
  
  public void a()
  {
    jdField_try = -1000L;
    jdField_if = -1000L;
    v = -1000L;
    r = -1000L;
    d = true;
    q = 0L;
    jdField_case = 0L;
  }
  
  public double a(TeamRobot paramTeamRobot)
  {
    return b.jdMethod_if(jdField_new, s, p);
  }
  
  public void a(ScannedRobotEvent paramScannedRobotEvent)
  {
    if ((jdField_new.getTime() < 30L) && (paramScannedRobotEvent.getEnergy() > 150.0D)) {
      jdField_char = true;
    }
    double d1 = jdField_new.getHeading() + paramScannedRobotEvent.getBearing();
    s = (jdField_new.getX() + paramScannedRobotEvent.getDistance() * b.jdMethod_if(d1));
    p = (jdField_new.getY() + paramScannedRobotEvent.getDistance() * b.jdMethod_new(d1));
    t = paramScannedRobotEvent.getHeading();
    if ((jdField_new.getOthers() == 1) && (jdField_new.getTime() - jdField_try == 1L) && (jdField_new.getTime() > 1L))
    {
      double d2 = c - paramScannedRobotEvent.getEnergy();
      if (jdField_new.getTime() == m)
      {
        d2 -= jdField_void * 4.0D;
        if (jdField_void > 1.0D) {
          d2 -= (jdField_void - 1.0D) * 2.0D;
        }
      }
      if (jdField_new.getTime() == jdField_if) {
        d2 += 3.0D * u;
      }
      if (jdField_new.getTime() == a) {
        d2 -= 0.6D;
      }
      if ((paramScannedRobotEvent.getVelocity() == 0.0D) && (Math.abs(jdField_byte) > 2.0D)) {
        d2 -= Math.abs(jdField_byte) * 0.5D - 1.0D;
      }
      if ((d2 > 0.09D) && (d2 < 3.01D))
      {
        jdField_int += 1L;
        q += 1L;
        b = d2;
        jdField_do = ((jdField_do + d2));
        r = jdField_new.getTime();
      }
    }
    jdField_byte = paramScannedRobotEvent.getVelocity();
    c = paramScannedRobotEvent.getEnergy();
    jdField_try = jdField_new.getTime();
  }
  
  public void a(BulletHitEvent paramBulletHitEvent)
  {
    m = jdField_new.getTime();
    jdField_void = paramBulletHitEvent.getBullet().getPower();
  }
  
  public void a(HitByBulletEvent paramHitByBulletEvent)
  {
    jdField_if = jdField_new.getTime();
    u = paramHitByBulletEvent.getBullet().getPower();
    jdField_for += 1L;
    jdField_long = ((jdField_long + u));
    jdField_case += 1L;
    o = paramHitByBulletEvent.getBullet().getX();
    n = paramHitByBulletEvent.getBullet().getY();
  }
  
  public void a(BulletHitBulletEvent paramBulletHitBulletEvent)
  {
    v = jdField_new.getTime();
    f = paramBulletHitBulletEvent.getHitBullet().getPower();
    i = paramBulletHitBulletEvent.getHitBullet().getX();
    h = paramBulletHitBulletEvent.getHitBullet().getY();
  }
  
  public void a(HitRobotEvent paramHitRobotEvent)
  {
    a = jdField_new.getTime();
  }
  
  public void jdMethod_if()
  {
    if (q > 0L) {
      g = (jdField_case / q);
    } else {
      g = 0.0D;
    }
  }
}
