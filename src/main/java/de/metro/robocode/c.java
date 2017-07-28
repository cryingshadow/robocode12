package abc;

import java.io.IOException;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Queue;
import robocode.ScannedRobotEvent;
import robocode.TeamRobot;
import simonton.utils.Cluster;
import simonton.utils.Cluster.Point;
import simonton.utils.MyTree;

public class c
{
  private final TeamRobot c;
  private final int jdField_try = 240000;
  private final int jdField_for = 50;
  private final int jdField_new = 10;
  private final double b = 25.0D;
  private final boolean l = true;
  private final double jdField_char = 300.0D;
  private static final int jdField_goto = 9;
  private double[] m = new double[9];
  private MyTree e = new MyTree(9, 20, 8.0D, 1000);
  private Queue jdField_case = new LinkedList();
  private final int h = 10;
  private h jdField_else = new h();
  private a jdField_long;
  private a jdField_void;
  private a jdField_byte;
  private a jdField_do;
  private int f = 0;
  private double jdField_if = 1.0D;
  private long d = 0L;
  private long k = 0L;
  double a = 3.0D;
  private final double g;
  private final double j;
  private double i = 0.0D;
  private double jdField_int = 0.0D;
  
  public c(TeamRobot paramTeamRobot, String paramString)
  {
    c = paramTeamRobot;
    g = c.getBattleFieldWidth();
    j = c.getBattleFieldHeight();
  }
  
  public long jdMethod_int()
  {
    return f;
  }
  
  public void jdMethod_if()
  {
    jdField_byte = null;
    jdField_do = null;
    if (jdField_void == null) {
      return;
    }
    int n = c.getRoundNum();
    if (jdField_void.jdField_for != n) {
      return;
    }
    jdField_byte = jdField_void;
    jdField_do = jdField_void;
    while ((jdField_byte.jdField_do != null) && (jdField_byte.jdField_do.jdField_for == n)) {
      jdField_byte = jdField_byte.jdField_do;
    }
  }
  
  public a jdMethod_for()
  {
    return jdField_byte;
  }
  
  public a a()
  {
    return jdField_do;
  }
  
  public void a(c paramC)
  {
    a localA1 = paramC.jdMethod_for();
    a localA2 = paramC.a();
    if (localA1 == null) {
      return;
    }
    int n = 0;
    while (localA1 != null)
    {
      a localA3 = new a(jdField_try, jdField_new, jdField_int, jdField_case);
      if (jdField_void == null)
      {
        jdField_void = localA3;
        jdField_long = jdField_void;
      }
      else
      {
        jdField_void.a = localA3;
        jdField_do = jdField_void;
        jdField_void = localA3;
      }
      e.a((double[])jdField_byte.a.clone(), localA3);
      f += 1;
      n++;
      if (localA1 == localA2) {
        localA1 = null;
      } else {
        localA1 = a;
      }
    }
  }
  
  public void jdMethod_do()
  {
    d = 0L;
    k = 0L;
    jdField_case.clear();
    if (f == 0) {
      return;
    }
    while (f > 240000)
    {
      jdField_long = jdField_long.a;
      f -= 1;
    }
    jdField_long.jdField_do = null;
  }
  
  public void a(ScannedRobotEvent paramScannedRobotEvent, n paramN)
  {
    double d1 = paramScannedRobotEvent.getDistance();
    double d2 = paramScannedRobotEvent.getVelocity();
    double d3 = c.getHeading() + paramScannedRobotEvent.getBearing();
    double d4 = c.getX() + d1 * b.jdMethod_if(d3);
    double d5 = c.getY() + d1 * b.jdMethod_new(d3);
    long l1 = paramScannedRobotEvent.getTime();
    d3 = paramScannedRobotEvent.getHeading();
    q localQ = new q(paramScannedRobotEvent.getName(), l1, d4, d5, d3, d2, paramScannedRobotEvent.getEnergy(), c.getRoundNum());
    try
    {
      c.broadcastMessage(localQ);
    }
    catch (IOException localIOException)
    {
      c.out.println("error sending message");
    }
    a(localQ, paramN, false);
  }
  
  public void a(q paramQ, n paramN, boolean paramBoolean)
  {
    long l1 = jdField_do - d;
    if ((l1 - k > 20L) || (l1 < k))
    {
      d = jdField_do;
      l1 = 0L;
    }
    if ((paramBoolean) && (l1 <= k)) {
      return;
    }
    double d1 = jdField_for;
    double d2 = jdField_byte;
    double d3 = jdField_new;
    jdField_if = (d1 != 0.0D ? d1 : jdField_if);
    double d4 = jdField_if < 0.0D ? (jdField_case + 180.0D) % 360.0D : jdField_case;
    a localA3 = new a(d2, d3, d4, l1);
    jdField_for = jdField_int;
    double d5 = c.getOthers();
    double d6 = b.jdMethod_if(g / 2.0D, j / 2.0D, d2, d3);
    double d7 = b.jdMethod_for(d4 - d6);
    d7 = d7 > 0.0D ? 1 : -1;
    double d8 = 0.0D;
    double d9 = 0.0D;
    if ((d4 == 90.0D) || (d4 == 270.0D)) {
      d8 = Double.POSITIVE_INFINITY;
    } else if ((d4 < 90.0D) || (d4 > 270.0D)) {
      d8 = (j - d3) / b.jdMethod_new(d4);
    } else {
      d8 = d3 / b.jdMethod_new(d4 - 180.0D);
    }
    if ((d4 == 180.0D) || (d4 == 0.0D)) {
      d9 = Double.POSITIVE_INFINITY;
    } else if (d4 < 180.0D) {
      d9 = (g - d2) / b.jdMethod_new(d4 - 90.0D);
    } else {
      d9 = d2 / b.jdMethod_new(d4 - 180.0D - 90.0D);
    }
    double d10 = Math.min(Math.min(d8, d9), 300.0D);
    double d11 = (d4 + 180.0D) % 360.0D;
    if (d11 < 0.0D) {
      d11 += 360.0D;
    }
    if ((d11 == 90.0D) || (d11 == 270.0D)) {
      d8 = Double.POSITIVE_INFINITY;
    } else if ((d11 < 90.0D) || (d11 > 270.0D)) {
      d8 = (j - d3) / b.jdMethod_new(d11);
    } else {
      d8 = d3 / b.jdMethod_new(d11 - 180.0D);
    }
    if ((d11 == 180.0D) || (d11 == 0.0D)) {
      d9 = Double.POSITIVE_INFINITY;
    } else if (d11 < 180.0D) {
      d9 = (g - d2) / b.jdMethod_new(d11 - 90.0D);
    } else {
      d9 = d2 / b.jdMethod_new(d11 - 180.0D - 90.0D);
    }
    double d12 = Math.min(Math.min(d8, d9), 300.0D);
    d11 = (d4 - 90.0D * d7) % 360.0D;
    if (d11 < 0.0D) {
      d11 += 360.0D;
    }
    if ((d11 == 90.0D) || (d11 == 270.0D)) {
      d8 = Double.POSITIVE_INFINITY;
    } else if ((d11 < 90.0D) || (d11 > 270.0D)) {
      d8 = (j - d3) / b.jdMethod_new(d11);
    } else {
      d8 = d3 / b.jdMethod_new(d11 - 180.0D);
    }
    if ((d11 == 180.0D) || (d11 == 0.0D)) {
      d9 = Double.POSITIVE_INFINITY;
    } else if (d11 < 180.0D) {
      d9 = (g - d2) / b.jdMethod_new(d11 - 90.0D);
    } else {
      d9 = d2 / b.jdMethod_new(d11 - 180.0D - 90.0D);
    }
    double d13 = Math.min(Math.min(d8, d9), 300.0D);
    if (f == 0)
    {
      jdField_long = localA3;
      jdField_void = localA3;
    }
    else
    {
      jdField_void.a = localA3;
      jdField_do = jdField_void;
      jdField_void = localA3;
    }
    f += 1;
    double d14 = 0.0D;
    double d15 = 0.0D;
    double d16 = 0.0D;
    double d17 = 0.0D;
    double d18 = 0.0D;
    if (f > 1)
    {
      a localA1 = jdField_void;
      a localA2 = jdField_void;
      l1 = jdField_case;
      long l2 = 0L;
      long l3 = 8L;
      long l4 = 32L;
      double d19 = 0.0D;
      while ((jdField_do != null) && (jdField_do).jdField_case < l1) && (l2 < l4)) {
        if (l1 - jdField_case >= l3) {
          if (l3 == 8L)
          {
            d14 = Math.sqrt(a(jdField_try - jdField_try) + a(jdField_new - jdField_new));
            d14 = d14 * (l1 - jdField_case) / 8.0D;
            d19 = 1.5707963267948966D - Math.atan2(jdField_new - jdField_new, jdField_try - jdField_try);
            d19 -= Math.toRadians(jdField_int);
            d14 = (Math.min(64.0D, Math.max(-36.0D, d14 * Math.cos(d19))) + 36.0D) / 100.0D;
            l2 = 8L;
            l3 = 16L;
          }
          else if (l3 == 16L)
          {
            d15 = Math.sqrt(a(jdField_try - jdField_try) + a(jdField_new - jdField_new));
            d15 = d15 * (l1 - jdField_case) / 16.0D;
            d19 = 1.5707963267948966D - Math.atan2(jdField_new - jdField_new, jdField_try - jdField_try);
            d19 -= Math.toRadians(jdField_int);
            d15 = (Math.min(128.0D, Math.max(-100.0D, d15 * Math.cos(d19))) + 100.0D) / 228.0D;
            l2 = 16L;
            l3 = 32L;
          }
          else if (l3 == 32L)
          {
            d16 = Math.sqrt(a(jdField_try - jdField_try) + a(jdField_new - jdField_new));
            d16 = d16 * (l1 - jdField_case) / 32.0D;
            d19 = 1.5707963267948966D - Math.atan2(jdField_new - jdField_new, jdField_try - jdField_try);
            d19 -= Math.toRadians(jdField_int);
            d16 = (Math.min(256.0D, Math.max(-228.0D, d16 * Math.cos(d19))) + 228.0D) / 484.0D;
            l2 = 32L;
            l3 = 64L;
          }
          else if (l3 == 64L)
          {
            d17 = b.a(jdField_try, jdField_new, jdField_try, jdField_new);
            d17 = d17 * (l1 - jdField_case) / 64.0D;
            d19 = 1.5707963267948966D - Math.atan2(jdField_new - jdField_new, jdField_try - jdField_try);
            d19 -= Math.toRadians(jdField_int);
            d17 = Math.min(512.0D, Math.max(-484.0D, d17 * Math.cos(d19)));
            l2 = 64L;
            l3 = 128L;
          }
          else if (l3 == 128L)
          {
            d18 = b.a(jdField_try, jdField_new, jdField_try, jdField_new);
            d18 = d18 * (l1 - jdField_case) / 128.0D;
            d19 = 1.5707963267948966D - Math.atan2(jdField_new - jdField_new, jdField_try - jdField_try);
            d19 -= Math.toRadians(jdField_int);
            d18 = Math.min(1024.0D, Math.max(-1024.0D, d18 * Math.cos(d19)));
            l2 = 128L;
            l3 = 0L;
          }
        }
      }
    }
    int n = 0;
    m[(n++)] = (Math.abs(d1) / 8.0D);
    m[(n++)] = d14;
    m[(n++)] = d15;
    m[(n++)] = d16;
    m[(n++)] = (d10 / 300.0D);
    m[(n++)] = (d12 / 300.0D);
    m[(n++)] = (d13 / 300.0D);
    m[(n++)] = (d5 / 10.0D);
    m[(n++)] = ((jdField_else - 100.0D) / 300.0D);
    Cluster.Point localPoint = new Cluster.Point(localA3, (double[])m.clone());
    jdField_case.add(localPoint);
    jdField_byte = localPoint;
    while (jdField_case.size() > 10) {
      e.a((Cluster.Point)jdField_case.poll());
    }
    k = l1;
  }
  
  public double[][] a(double paramDouble1, double paramDouble2)
  {
    if (jdField_void == null) {
      return new double[0][0];
    }
    Cluster localCluster = e.a((double[])m.clone(), 50, jdField_else);
    int n = localCluster.jdMethod_for();
    a[] arrayOfA = new a[n];
    double[] arrayOfDouble = new double[n];
    for (int i1 = n - 1; i1 >= 0; i1--)
    {
      Cluster.Point localPoint = localCluster.a();
      arrayOfDouble[i1] = jdField_if;
      arrayOfA[i1] = ((a)jdField_do);
    }
    double[][] arrayOfDouble1 = new double[50][4];
    for (int i2 = 0; i2 < n; i2++)
    {
      arrayOfDouble1[i2][0] = 1000.0D;
      arrayOfDouble1[i2][1] = 0.0D;
      arrayOfDouble1[i2][2] = 0.0D;
    }
    i2 = 0;
    for (int i3 = 0; (i3 < n) && (i2 < 10); i3++)
    {
      double d1 = a(arrayOfA[i3], paramDouble1, paramDouble2);
      if (d1 < 1000.0D)
      {
        arrayOfDouble1[i2][0] = d1;
        arrayOfDouble1[i2][1] = i;
        arrayOfDouble1[i2][2] = (1.0D / jdField_int);
        arrayOfDouble1[i2][3] = (1.0D / jdField_int);
        i2++;
      }
    }
    double[][] arrayOfDouble2 = new double[i2][4];
    for (int i4 = 0; i4 < i2; i4++) {
      for (int i5 = 0; i5 < 4; i5++) {
        arrayOfDouble2[i4][i5] = arrayOfDouble1[i4][i5];
      }
    }
    return arrayOfDouble2;
  }
  
  private double a(a paramA, double paramDouble1, double paramDouble2)
  {
    i = 0.0D;
    a localA = paramA;
    double d1 = 20.0D - 3.0D * a;
    long l1 = c.getTime() - d - jdField_void.jdField_case;
    double d2 = b.a(jdField_void.jdField_try, jdField_void.jdField_new, paramDouble1, paramDouble2);
    double d3 = b.jdMethod_if(jdField_void.jdField_try, jdField_void.jdField_new, paramDouble1, paramDouble2);
    double d4 = jdField_int - jdField_void.jdField_int;
    double d5 = jdField_try + d2 * b.jdMethod_if(d3 + d4);
    double d6 = jdField_new + d2 * b.jdMethod_new(d3 + d4);
    double d7 = -d1 * (l1 - 1L);
    double d8 = 0.0D;
    double d9 = 0.0D;
    do
    {
      localA = a;
      if ((localA == null) || (jdField_case < jdField_case)) {
        return Double.POSITIVE_INFINITY;
      }
      d9 = d7;
      d7 += d1 * (jdField_case - jdField_do.jdField_case);
      d8 = d2;
      d2 = b.jdMethod_for(d5, d6, jdField_try, jdField_new);
    } while (a(d7) < d2);
    d8 = Math.sqrt(d8);
    d2 = Math.sqrt(d2);
    double d10 = jdField_try;
    double d11 = jdField_new;
    if ((jdField_do != null) && (jdField_do.jdField_case < jdField_case))
    {
      double d12 = d2 - d8;
      double d13 = d7 - d9;
      double d14 = d13 - d12;
      double d15 = d8 - d9;
      double d16 = d15 / d14;
      if ((d16 < 0.0D) || (d16 > 1.0D)) {
        return Double.POSITIVE_INFINITY;
      }
      d10 = jdField_do.jdField_try + (d10 - jdField_do.jdField_try) * d16;
      d11 = jdField_do.jdField_new + (d11 - jdField_do.jdField_new) * d16;
      d2 -= (1.0D - d16) * d12;
    }
    d3 = b.jdMethod_if(d5, d6, d10, d11);
    d10 = paramDouble1 + d2 * b.jdMethod_if(d3 - d4);
    d11 = paramDouble2 + d2 * b.jdMethod_new(d3 - d4);
    if ((d10 < 15.0D) || (d10 > g - 15.0D) || (d11 < 15.0D) || (d11 > j - 15.0D)) {
      return Double.POSITIVE_INFINITY;
    }
    i = Math.toDegrees(25.0D / d2);
    jdField_int = d2;
    return d3 - d4;
  }
  
  private static final double a(double paramDouble)
  {
    return paramDouble * paramDouble;
  }
  
  private final class a
  {
    public double jdField_try = 0.0D;
    public double jdField_new = 0.0D;
    public double jdField_int = 0.0D;
    public long jdField_case = 0L;
    public a jdField_do;
    public a a;
    public Cluster.Point jdField_byte;
    public int jdField_for;
    
    public a(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong)
    {
      jdField_try = paramDouble1;
      jdField_new = paramDouble2;
      jdField_int = paramDouble3;
      jdField_case = paramLong;
    }
  }
}
