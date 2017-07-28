package abc;

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import robocode.ScannedRobotEvent;
import robocode.TeamRobot;
import simonton.utils.Cluster;
import simonton.utils.Cluster.Point;
import simonton.utils.MyTree;

public class a
{
  private TeamRobot jdField_else;
  String b;
  private final boolean Y = false;
  private int Q = 0;
  private final int y = 2400000;
  private final int t = 100;
  private final int x = 100;
  private final int C = 10;
  private final int D = 4;
  private final boolean jdField_byte = false;
  private long[] o = new long[4];
  private double[] f = new double[4];
  private ArrayList N;
  private final int q = 100;
  private final int v = 100;
  private static final double m = 25.0D;
  private static final int p = 9;
  private static final int n = 10;
  private double[] F = new double[10];
  private MyTree S = new MyTree(9, 20, 1.0D, 1000);
  private MyTree R = new MyTree(10, 20, 1.0D, 1000);
  private Queue O = new LinkedList();
  private Queue M = new LinkedList();
  private final int d = 20;
  private h V = new h();
  private static final boolean u = false;
  private static final int g = 10;
  private int[][] r = new int[9][10];
  private long l = 0L;
  private double B;
  private double A;
  private double L;
  private a jdField_goto;
  private a e;
  private a W;
  private a jdField_try;
  public int jdField_char = 0;
  private double jdField_int = 1.0D;
  private double jdField_new = 1.0D;
  private long E = 0L;
  private long z = 0L;
  private long j = 0L;
  private double s = 40.0D;
  private double c;
  public double K = 0.0D;
  private long jdField_do = 0L;
  public double k = 3.0D;
  private long X = 0L;
  private final double w;
  private final double H;
  private double a = 0.0D;
  private double i;
  private double h;
  private double P;
  double[][] jdField_void = new double[100][3];
  int U = 0;
  int T = 0;
  double G = 0.0D;
  double I = 1.5707963267948966D;
  double J = 18.0D;
  double jdField_for = J;
  double jdField_if = J;
  double jdField_case = 600.0D - J;
  double jdField_long = 800.0D - J;
  
  public a(TeamRobot paramTeamRobot, String paramString)
  {
    jdField_else = paramTeamRobot;
    b = paramString;
    w = jdField_else.getBattleFieldWidth();
    H = jdField_else.getBattleFieldHeight();
    N = new ArrayList();
  }
  
  public long jdMethod_if()
  {
    return jdField_char;
  }
  
  public void jdMethod_new()
  {
    W = null;
    jdField_try = null;
    if (e == null) {
      return;
    }
    int i1 = jdField_else.getRoundNum();
    if (e.jdField_for != i1) {
      return;
    }
    W = e;
    jdField_try = e;
    while ((W.jdField_int != null) && (W.jdField_int.jdField_for == i1)) {
      W = W.jdField_int;
    }
  }
  
  public a jdMethod_for()
  {
    return W;
  }
  
  public a jdMethod_int()
  {
    return jdField_try;
  }
  
  public void a(a paramA)
  {
    a localA1 = paramA.jdMethod_for();
    a localA2 = paramA.jdMethod_int();
    if (localA1 == null) {
      return;
    }
    int i1 = 0;
    while (localA1 != null)
    {
      a localA3 = new a(jdField_byte, jdField_try, jdField_new, jdField_char);
      if (e == null)
      {
        e = localA3;
        jdField_goto = e;
      }
      else
      {
        e.jdField_if = localA3;
        jdField_int = e;
        e = localA3;
      }
      if (jdField_case == null) {
        jdField_else.out.println(i1 + ": info.point null");
      }
      if (localA3 == null) {
        jdField_else.out.println(i1 + ": info1 null");
      }
      S.a((double[])jdField_case.a.clone(), localA3);
      jdField_char += 1;
      i1++;
      if (localA1 == localA2) {
        localA1 = null;
      } else {
        localA1 = jdField_if;
      }
    }
  }
  
  public void a()
  {
    N.clear();
    O.clear();
    M.clear();
    if (jdField_char == 0) {
      return;
    }
    while (jdField_char > 2400000)
    {
      jdField_goto = jdField_goto.jdField_if;
      jdField_char -= 1;
    }
    jdField_goto.jdField_int = null;
    U = 0;
    T = 0;
    G = 0.0D;
  }
  
  public void a(ScannedRobotEvent paramScannedRobotEvent)
  {
    long l1 = paramScannedRobotEvent.getTime() - jdField_do;
    if (l1 - X > 1L) {
      Q = ((int)(Q + (l1 - X - 1L)));
    }
    if ((l1 - X > 20L) || (l1 < X))
    {
      jdField_do = paramScannedRobotEvent.getTime();
      l1 = 0L;
      E = 0L;
    }
    double d1 = paramScannedRobotEvent.getDistance();
    double d2 = paramScannedRobotEvent.getVelocity();
    double d4;
    double d5;
    double d6;
    if (paramScannedRobotEvent.getTime() == jdField_else.getTime())
    {
      d4 = jdField_else.getX();
      d5 = jdField_else.getY();
      d6 = jdField_else.getHeading();
    }
    else
    {
      d4 = B;
      d5 = A;
      d6 = L;
    }
    double d3 = d6 + paramScannedRobotEvent.getBearing();
    double d7 = d4 + d1 * b.jdMethod_if(d3);
    double d8 = d5 + d1 * b.jdMethod_new(d3);
    long l2 = paramScannedRobotEvent.getTime();
    Object localObject = N.iterator();
    while (((Iterator)localObject).hasNext())
    {
      b localB = (b)((Iterator)localObject).next();
      double d10 = d1;
      double d12 = (l2 - jdField_byte - 1L) * jdField_new;
      if (d12 >= d10)
      {
        double d14 = b.jdMethod_if(jdField_do, jdField_if, d7, d8);
        int i1 = 1;
        for (int i2 = 0; i2 < 4; i2++) {
          if (jdField_for[i2] > 1000.0D) {
            i1 = 0;
          }
        }
        if (i1 != 0)
        {
          d16 = Math.toDegrees(25.0D / d10);
          for (int i3 = 0; i3 < 4; i3++)
          {
            double d18 = Math.abs(b.jdMethod_for(d14 - jdField_for[i3]));
            if (d18 < d16) {
              f[i3] += 1.0D;
            }
          }
        }
        ((Iterator)localObject).remove();
      }
    }
    jdField_int = (d2 != 0.0D ? d2 : jdField_int);
    d3 = jdField_int < 0.0D ? (paramScannedRobotEvent.getHeading() + 180.0D) % 360.0D : paramScannedRobotEvent.getHeading();
    localObject = new a(d7, d8, d3, l1);
    jdField_for = jdField_else.getRoundNum();
    if (d2 * jdField_new < 0.0D)
    {
      j += 1L;
      z += l1 - E;
      s *= 0.9D;
      s += 0.1D * (l1 - E);
      if (E > l1) {
        jdField_else.out.println("lastInvTime=" + E + "; t1=" + l1 + "; getTime=" + jdField_else.getTime() + "     !!!!!!!!!!!!!!!!!!!");
      }
      E = l1;
    }
    if (d2 != 0.0D) {
      jdField_new = d2;
    }
    double d9 = Math.min(8000.0D, paramScannedRobotEvent.getDistance()) / 800.0D;
    double d11 = Math.abs(b.jdMethod_for(d3 - d6 - paramScannedRobotEvent.getBearing())) / 180.0D;
    double d13 = b.jdMethod_for(d3 - d6 - paramScannedRobotEvent.getBearing());
    d13 = d13 < 0.0D ? -1 : 1;
    a = d13;
    double d15 = 0.0D;
    if (l1 > 0L) {
      d15 = Math.abs(b.jdMethod_for(c - paramScannedRobotEvent.getHeading()) / (l1 - X) / 10.0D) * d13;
    }
    d15 = (d15 + 1.0D) / 2.0D;
    c = paramScannedRobotEvent.getHeading();
    double d16 = 400.0D;
    double d17 = 0.0D;
    double d19 = 0.0D;
    if ((d3 == 90.0D) || (d3 == 270.0D)) {
      d17 = Double.POSITIVE_INFINITY;
    } else if ((d3 < 90.0D) || (d3 > 270.0D)) {
      d17 = (H - d8) / b.jdMethod_new(d3);
    } else {
      d17 = d8 / b.jdMethod_new(d3 - 180.0D);
    }
    if ((d3 == 180.0D) || (d3 == 0.0D)) {
      d19 = Double.POSITIVE_INFINITY;
    } else if (d3 < 180.0D) {
      d19 = (w - d7) / b.jdMethod_new(d3 - 90.0D);
    } else {
      d19 = d7 / b.jdMethod_new(d3 - 180.0D - 90.0D);
    }
    double d20 = Math.min(Math.min(d17, d19), d16) / d16;
    double d21 = (d3 + 180.0D) % 360.0D;
    if (d21 < 0.0D) {
      d21 += 360.0D;
    }
    if ((d21 == 90.0D) || (d21 == 270.0D)) {
      d17 = Double.POSITIVE_INFINITY;
    } else if ((d21 < 90.0D) || (d21 > 270.0D)) {
      d17 = (H - d8) / b.jdMethod_new(d21);
    } else {
      d17 = d8 / b.jdMethod_new(d21 - 180.0D);
    }
    if ((d21 == 180.0D) || (d21 == 0.0D)) {
      d19 = Double.POSITIVE_INFINITY;
    } else if (d21 < 180.0D) {
      d19 = (w - d7) / b.jdMethod_new(d21 - 90.0D);
    } else {
      d19 = d7 / b.jdMethod_new(d21 - 180.0D - 90.0D);
    }
    double d22 = Math.min(Math.min(d17, d19), d16) / d16;
    if (jdField_char == 0)
    {
      jdField_goto = ((a)localObject);
      e = ((a)localObject);
    }
    else
    {
      e.jdField_if = ((a)localObject);
      jdField_int = e;
      e = ((a)localObject);
    }
    jdField_char += 1;
    double d23 = 0.15789473684210525D;
    double d24 = 0.23809523809523808D;
    double d25 = 0.36D;
    double d26 = 0.43859649122807015D;
    double d27 = 0.47107438016528924D;
    double d28 = 0.4859437751004016D;
    double d29 = 0.49306930693069306D;
    if (jdField_char > 1)
    {
      a localA1 = e;
      a localA2 = e;
      l1 = jdField_char;
      i4 = 64;
      int i5 = 2;
      int i6 = 0;
      double d30 = 0.0D;
      while ((jdField_int != null) && (jdField_int).jdField_char < l1) && (i6 < i4)) {
        if (l1 - jdField_char >= i5) {
          if (i5 == 2)
          {
            d23 = Math.sqrt(jdMethod_if(jdField_byte - jdField_byte) + jdMethod_if(jdField_try - jdField_try));
            d30 = 1.5707963267948966D - Math.atan2(jdField_try - jdField_try, jdField_byte - jdField_byte);
            d30 -= Math.toRadians(jdField_new);
            d23 *= i5 / (l1 - jdField_char) * Math.cos(d30);
            d23 = (Math.min(16.0D, Math.max(-3.0D, d23)) + 3.0D) / 19.0D;
            i6 = 2;
            i5 = 4;
          }
          else if (i5 == 4)
          {
            d24 = Math.sqrt(jdMethod_if(jdField_byte - jdField_byte) + jdMethod_if(jdField_try - jdField_try));
            d30 = 1.5707963267948966D - Math.atan2(jdField_try - jdField_try, jdField_byte - jdField_byte);
            d30 -= Math.toRadians(jdField_new);
            d24 *= i5 / (l1 - jdField_char) * Math.cos(d30);
            d24 = (Math.min(32.0D, Math.max(-10.0D, d24)) + 10.0D) / 42.0D;
            i6 = 4;
            i5 = 8;
          }
          else if (i5 == 8)
          {
            d25 = Math.sqrt(jdMethod_if(jdField_byte - jdField_byte) + jdMethod_if(jdField_try - jdField_try));
            d30 = 1.5707963267948966D - Math.atan2(jdField_try - jdField_try, jdField_byte - jdField_byte);
            d30 -= Math.toRadians(jdField_new);
            d25 *= i5 / (l1 - jdField_char) * Math.cos(d30);
            d25 = (Math.min(64.0D, Math.max(-36.0D, d25)) + 36.0D) / 100.0D;
            i6 = 8;
            i5 = 64;
          }
          else if (i5 == 16)
          {
            d26 = Math.sqrt(jdMethod_if(jdField_byte - jdField_byte) + jdMethod_if(jdField_try - jdField_try));
            d30 = 1.5707963267948966D - Math.atan2(jdField_try - jdField_try, jdField_byte - jdField_byte);
            d30 -= Math.toRadians(jdField_new);
            d26 *= i5 / (l1 - jdField_char) * Math.cos(d30);
            d26 = (Math.min(128.0D, Math.max(-100.0D, d26)) + 100.0D) / 228.0D;
            i6 = 16;
            i5 = 32;
          }
          else if (i5 == 32)
          {
            d27 = Math.sqrt(jdMethod_if(jdField_byte - jdField_byte) + jdMethod_if(jdField_try - jdField_try));
            d30 = 1.5707963267948966D - Math.atan2(jdField_try - jdField_try, jdField_byte - jdField_byte);
            d30 -= Math.toRadians(jdField_new);
            d27 *= i5 / (l1 - jdField_char) * Math.cos(d30);
            d27 = (Math.min(256.0D, Math.max(-228.0D, d27)) + 228.0D) / 484.0D;
            i6 = 32;
            i5 = 64;
          }
          else if (i5 == 64)
          {
            d28 = Math.sqrt(jdMethod_if(jdField_byte - jdField_byte) + jdMethod_if(jdField_try - jdField_try));
            d30 = 1.5707963267948966D - Math.atan2(jdField_try - jdField_try, jdField_byte - jdField_byte);
            d30 -= Math.toRadians(jdField_new);
            d28 *= i5 / (l1 - jdField_char) * Math.cos(d30);
            d28 = (Math.min(512.0D, Math.max(-484.0D, d28)) + 484.0D) / 996.0D;
            i6 = 64;
            i5 = 128;
          }
          else if (i5 == 128)
          {
            d29 = Math.sqrt(jdMethod_if(jdField_byte - jdField_byte) + jdMethod_if(jdField_try - jdField_try));
            d30 = 1.5707963267948966D - Math.atan2(jdField_try - jdField_try, jdField_byte - jdField_byte);
            d30 -= Math.toRadians(jdField_new);
            d29 *= i5 / (l1 - jdField_char) * Math.cos(d30);
            d29 = (Math.min(1024.0D, Math.max(-996.0D, d29)) + 996.0D) / 2020.0D;
            i6 = 128;
            i5 = 0;
          }
        }
      }
    }
    int i4 = 0;
    F[(i4++)] = d9;
    F[(i4++)] = d11;
    F[(i4++)] = (Math.abs(d2) / 8.0D);
    F[(i4++)] = jdMethod_if(d20);
    F[(i4++)] = jdMethod_if(d22);
    F[(i4++)] = ((d13 + 1.0D) / 2.0D);
    F[(i4++)] = jdMethod_if(d23);
    F[(i4++)] = jdMethod_if(d24);
    F[(i4++)] = jdMethod_if(d25);
    F[(i4++)] = jdMethod_if(d28);
    double[] arrayOfDouble = new double[9];
    System.arraycopy(F, 0, arrayOfDouble, 0, 9);
    Cluster.Point localPoint = new Cluster.Point(localObject, arrayOfDouble);
    O.add(localPoint);
    jdField_case = localPoint;
    while (O.size() > 20) {
      S.a((Cluster.Point)O.poll());
    }
    X = l1;
  }
  
  private int a(double paramDouble, int paramInt)
  {
    return Math.max(0, Math.min(paramInt - 1, (int)Math.floor(paramDouble * paramInt)));
  }
  
  public void jdMethod_do()
  {
    B = jdField_else.getX();
    A = jdField_else.getY();
    L = jdField_else.getHeading();
  }
  
  public double a(double paramDouble1, double paramDouble2)
  {
    if (e == null) {
      return 10000.0D;
    }
    double[] arrayOfDouble1 = { 10000.0D, 10000.0D, 10000.0D, 10000.0D, 10000.0D, 10000.0D, 10000.0D, 10000.0D };
    double d1 = b.jdMethod_if(paramDouble1, paramDouble2, e.jdField_byte, e.jdField_try);
    int i1 = 100;
    double[] arrayOfDouble2 = new double[9];
    System.arraycopy(F, 0, arrayOfDouble2, 0, 9);
    Cluster localCluster = S.a(arrayOfDouble2, i1, V);
    i1 = localCluster.jdMethod_for();
    a[] arrayOfA = new a[i1];
    double[] arrayOfDouble3 = new double[i1];
    for (int i2 = i1 - 1; i2 >= 0; i2--)
    {
      Cluster.Point localPoint = localCluster.a();
      arrayOfDouble3[i2] = jdField_if;
      arrayOfA[i2] = ((a)jdField_do);
    }
    double[][] arrayOfDouble = new double[i1][5];
    for (int i3 = 0; i3 < i1; i3++) {
      arrayOfDouble[i3][0] = 1000.0D;
    }
    i3 = 0;
    double d2 = 0.0D;
    int i4 = 0;
    double d3 = 0.0D;
    int i5 = 0;
    int i6 = 0;
    double d4 = 0.0D;
    int i7 = 0;
    double[] arrayOfDouble4 = new double[i1];
    double d5 = 18.0D;
    G = d5;
    for (int i8 = 0; (i8 < i1) && (i3 < 100); i8++)
    {
      double d6 = a(arrayOfA[i8], paramDouble1, paramDouble2, false);
      if (d6 < 1000.0D)
      {
        jdField_void[i3][0] = i;
        jdField_void[i3][1] = h;
        jdField_void[i3][2] = P;
        for (int i11 = 0; i11 < i3; i11++)
        {
          double d7 = jdMethod_if(jdField_void[i3][0] - jdField_void[i11][0]) + jdMethod_if(jdField_void[i3][1] - jdField_void[i11][1]);
          d4 += d7;
          i7++;
          arrayOfDouble4[i3] += d7;
          arrayOfDouble4[i11] += d7;
        }
        d6 = b.jdMethod_for(d6 - d1);
        arrayOfDouble[i3][0] = d6;
        arrayOfDouble[i3][1] = a;
        arrayOfDouble[i3][2] = 1.0D;
        arrayOfDouble[i3][3] = 1.0D;
        arrayOfDouble[i3][4] = 1.0D;
        for (i11 = 0; i11 < i3; i11++) {
          if (arrayOfDouble[i11][0] < 1000.0D)
          {
            if (Math.abs(arrayOfDouble[i11][0] - arrayOfDouble[i3][0]) < a) {
              if (arrayOfDouble[i11][2] += arrayOfDouble[i3][3] > d2)
              {
                d2 = arrayOfDouble[i11][2];
                i4 = i11;
              }
            }
            if (Math.abs(arrayOfDouble[i3][0] - arrayOfDouble[i11][0]) < arrayOfDouble[i11][1]) {
              if (arrayOfDouble[i3][2] += arrayOfDouble[i11][3] > d2)
              {
                d2 = arrayOfDouble[i3][2];
                i4 = i3;
              }
            }
            if ((jdMethod_if(jdField_void[i11][0] - jdField_void[i3][0]) < 324.0D) && (jdMethod_if(jdField_void[i11][1] - jdField_void[i3][1]) < 324.0D))
            {
              if (arrayOfDouble[i11][4] += arrayOfDouble[i3][3] > d3)
              {
                d3 = arrayOfDouble[i11][4];
                i5 = i11;
              }
              if (arrayOfDouble[i3][4] += arrayOfDouble[i11][3] > d3)
              {
                d3 = arrayOfDouble[i3][4];
                i5 = i3;
              }
            }
          }
        }
        i3++;
        if (i3 == 10) {
          arrayOfDouble1[1] = arrayOfDouble[i4][0];
        }
      }
    }
    if (i3 > 0)
    {
      arrayOfDouble1[0] = arrayOfDouble[i4][0];
      arrayOfDouble1[2] = arrayOfDouble[i5][0];
      i8 = 0;
      for (i9 = 1; i9 < i3; i9++) {
        if (arrayOfDouble4[i9] < arrayOfDouble4[i8]) {
          i8 = i9;
        }
      }
      i6 = i8;
      arrayOfDouble1[3] = arrayOfDouble[i6][0];
    }
    U = i3;
    T = i5;
    i8 = 0;
    for (int i9 = 0; i9 < 4; i9++) {
      if (arrayOfDouble1[i9] < 1000.0D) {
        i8 = 1;
      }
    }
    if (i8 == 0) {
      return 10000.0D;
    }
    i9 = 0;
    for (int i10 = 1; i10 < 4; i10++) {
      if ((arrayOfDouble1[i10] < 1000.0D) && (f[i10] > f[i9])) {
        i9 = i10;
      }
    }
    o[i9] += 1L;
    for (i10 = 0; i10 < 4; i10++) {
      arrayOfDouble1[i10] += d1;
    }
    b localB = new b(jdField_else.getTime(), k, paramDouble1, paramDouble2, arrayOfDouble1);
    N.add(localB);
    jdField_try = e;
    return arrayOfDouble1[i9];
  }
  
  private double a(a paramA, double paramDouble1, double paramDouble2, boolean paramBoolean)
  {
    a = 0.0D;
    a localA = paramA;
    double d1 = 20.0D - 3.0D * k;
    double d2 = b.a(e.jdField_byte, e.jdField_try, paramDouble1, paramDouble2);
    double d3 = b.jdMethod_if(e.jdField_byte, e.jdField_try, paramDouble1, paramDouble2);
    double d4 = d3 + 180.0D;
    double d5 = jdField_new - e.jdField_new;
    if (paramBoolean) {
      d5 += 180.0D;
    }
    d3 += d5;
    double d6 = jdField_byte + d2 * b.jdMethod_if(d3);
    double d7 = jdField_try + d2 * b.jdMethod_new(d3);
    double d8 = d1;
    do
    {
      localA = jdField_if;
      if ((localA == null) || (jdField_char < jdField_char)) {
        return Double.POSITIVE_INFINITY;
      }
      d8 += d1 * (jdField_char - jdField_int.jdField_char);
      d2 = b.jdMethod_for(d6, d7, jdField_byte, jdField_try);
    } while (jdMethod_if(d8) < d2);
    d2 = Math.sqrt(d2);
    double d9 = jdField_byte;
    double d10 = jdField_try;
    d3 = b.jdMethod_if(d6, d7, d9, d10) - d5;
    if (paramBoolean) {
      d3 = 2.0D * d4 - d3;
    }
    d9 = paramDouble1 + d2 * b.jdMethod_if(d3);
    d10 = paramDouble2 + d2 * b.jdMethod_new(d3);
    if ((d9 < 18.0D) || (d9 > w - 18.0D) || (d10 < 18.0D) || (d10 > H - 18.0D)) {
      return Double.POSITIVE_INFINITY;
    }
    a = Math.toDegrees(25.0D / d2);
    i = d9;
    h = d10;
    P = (jdField_char - jdField_char);
    return d3;
  }
  
  public void a(Graphics2D paramGraphics2D)
  {
    paramGraphics2D.setColor(Color.RED);
    paramGraphics2D.setColor(Color.RED.darker().darker().darker());
    for (int i1 = 0; i1 < T; i1++) {
      paramGraphics2D.drawRect((int)(jdField_void[i1][0] - G), (int)(jdField_void[i1][1] - G), (int)(G * 2.0D), (int)(G * 2.0D));
    }
    for (i1 = T; i1 < U; i1++) {
      paramGraphics2D.drawRect((int)(jdField_void[i1][0] - G), (int)(jdField_void[i1][1] - G), (int)(G * 2.0D), (int)(G * 2.0D));
    }
    paramGraphics2D.setColor(Color.RED);
    paramGraphics2D.drawRect((int)(jdField_void[T][0] - G), (int)(jdField_void[T][1] - G), (int)(G * 2.0D), (int)(G * 2.0D));
  }
  
  public static final double a(double[] paramArrayOfDouble)
  {
    double d1 = 0.0D;
    for (int i1 = 0; i1 < paramArrayOfDouble.length; i1++) {
      d1 += paramArrayOfDouble[i1];
    }
    double d2 = 0.0D;
    for (int i2 = 0; i2 < paramArrayOfDouble.length; i2++) {
      if (paramArrayOfDouble[i2] != 0.0D) {
        d2 += -paramArrayOfDouble[i2] / d1 * Math.log(paramArrayOfDouble[i2] / d1) / Math.log(2.0D);
      }
    }
    return d2;
  }
  
  public static final double a(int paramInt)
  {
    return Math.log(paramInt) / Math.log(2.0D);
  }
  
  double a(double paramDouble1, double paramDouble2, int paramInt)
  {
    return Math.min(Math.min(Math.min(a(jdField_case - jdField_else.getY(), paramDouble1, paramDouble2 - I, paramInt), a(jdField_long - jdField_else.getX(), paramDouble1, paramDouble2 + 3.141592653589793D, paramInt)), a(jdField_else.getY() - jdField_for, paramDouble1, paramDouble2 + I, paramInt)), a(jdField_else.getX() - jdField_if, paramDouble1, paramDouble2, paramInt));
  }
  
  double a(double paramDouble1, double paramDouble2, double paramDouble3, int paramInt)
  {
    if (paramDouble2 <= paramDouble1) {
      return Double.POSITIVE_INFINITY;
    }
    double d1 = Math.acos(-paramInt * paramDouble1 / paramDouble2) + paramInt * I;
    return a(paramInt * (d1 - paramDouble3));
  }
  
  private static final double a(double paramDouble)
  {
    while (paramDouble < 0.0D) {
      paramDouble += 6.283185307179586D;
    }
    return paramDouble % 6.283185307179586D;
  }
  
  public static final double jdMethod_if(double[] paramArrayOfDouble)
  {
    return a(paramArrayOfDouble) / a(paramArrayOfDouble.length);
  }
  
  private static final double jdMethod_if(double paramDouble)
  {
    return paramDouble * paramDouble;
  }
  
  private final class b
  {
    public long jdField_byte;
    public double jdField_int;
    public double jdField_new;
    public double jdField_do;
    public double jdField_if;
    public double[] jdField_for;
    public a.a jdField_try;
    
    public b(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double[] paramArrayOfDouble)
    {
      jdField_int = paramDouble1;
      jdField_new = (20.0D - 3.0D * jdField_int);
      jdField_byte = paramLong;
      jdField_do = paramDouble2;
      jdField_if = paramDouble3;
      jdField_for = paramArrayOfDouble;
    }
  }
  
  private final class a
  {
    public double jdField_byte = 0.0D;
    public double jdField_try = 0.0D;
    public double jdField_new = 0.0D;
    public double a = 0.0D;
    public long jdField_char = 0L;
    public a jdField_int;
    public a jdField_if;
    public Cluster.Point jdField_case;
    public int jdField_for;
    
    public a(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong)
    {
      jdField_byte = paramDouble1;
      jdField_try = paramDouble2;
      jdField_new = paramDouble3;
      jdField_char = paramLong;
    }
  }
}
