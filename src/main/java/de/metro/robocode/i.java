package abc;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import robocode.TeamRobot;

public class i
{
  TeamRobot d;
  n jdField_do;
  public int jdField_int = 10;
  boolean jdField_if = false;
  private int jdField_for = 6000;
  private int h = 1000;
  public int f = 0;
  public int jdField_else = 0;
  private b jdField_void;
  private b jdField_new;
  public HashMap jdField_char;
  private double b = 0.0D;
  private double jdField_try = 0.0D;
  private double jdField_byte = 0.0D;
  private double j = 0.0D;
  private double i = 0.0D;
  private long jdField_case = 0L;
  private boolean k = false;
  private boolean a = true;
  private static final boolean c = true;
  private static long jdField_long = 2500L;
  private static long e = 50000L;
  public double g = 0.5D;
  private static final double[] jdField_goto = new double[''];
  
  public i(TeamRobot paramTeamRobot, n paramN, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    d = paramTeamRobot;
    jdField_do = paramN;
    jdField_char = new HashMap();
    jdField_int = paramInt2;
    jdField_if = paramBoolean;
    for (int m = 0; m < 150; m++) {
      goto[m] = Math.exp(b.jdMethod_int(m) / -3.0D);
    }
  }
  
  public void a(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, boolean paramBoolean1, boolean paramBoolean2)
  {
    b localB = new b(paramLong + jdField_case, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, Math.min(500.0D, Math.max(-500.0D, paramDouble7)), Math.abs(paramDouble8), paramDouble9);
    if ((paramBoolean1) || (paramBoolean2))
    {
      if (jdField_else == 0)
      {
        jdField_new = localB;
      }
      else
      {
        jdField_char = jdField_new;
        jdField_new = localB;
      }
      jdField_else += 1;
    }
    else
    {
      jdField_try += 1.0D;
      j += 1.0D;
      if (f == 0)
      {
        jdField_void = localB;
      }
      else
      {
        jdField_char = jdField_void;
        jdField_void = localB;
      }
      f += 1;
    }
  }
  
  public void jdMethod_if()
  {
    if (!a) {
      return;
    }
    Iterator localIterator = jdField_char.values().iterator();
    while (localIterator.hasNext())
    {
      a localA = (a)localIterator.next();
      localA.a(true);
    }
  }
  
  public double a(g paramG, double paramDouble)
  {
    if (!jdField_char.containsKey(paramG)) {
      jdField_char.put(paramG, new a(paramG));
    }
    a localA = (a)jdField_char.get(paramG);
    if ((jdField_new == null) || (jdField_do.jdField_for == 0L)) {
      return 1.0D / b.jdMethod_int(Math.abs(paramDouble) + 1.0D);
    }
    if (!k) {
      return localA.jdMethod_int(paramDouble);
    }
    return localA.jdMethod_do(paramDouble);
  }
  
  public void a(g paramG, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if (paramDouble2 > 0.0D)
    {
      double d1 = 0.059D / (18.0D / paramDouble3 / paramDouble2);
      b += d1;
      jdField_byte += d1;
    }
    if (!jdField_char.containsKey(paramG)) {
      jdField_char.put(paramG, new a(paramG));
    }
    a localA = (a)jdField_char.get(paramG);
    double d2 = localA.jdMethod_if(paramDouble1);
    double d3 = localA.jdMethod_try(paramDouble1);
    if (d2 < d3) {
      g += (1.0D - g) / 5.0D;
    } else if (d2 > d3) {
      g += (0.0D - g) / 5.0D;
    }
  }
  
  public void jdMethod_do()
  {
    jdField_char.clear();
    jdField_case += d.getTime();
    if (d.getRoundNum() == 0)
    {
      i = (b / jdField_try);
    }
    else
    {
      i *= 0.8D;
      i += 0.2D * jdField_byte / j;
    }
    jdField_byte = 0.0D;
    j = 0.0D;
    jdMethod_try();
    b localB;
    int m;
    if (f > jdField_for)
    {
      localB = jdField_void;
      for (m = 1; m < jdField_for; m++) {
        localB = jdField_char;
      }
      jdField_char = null;
      f = jdField_for;
    }
    if (jdField_else > h)
    {
      localB = jdField_new;
      for (m = 1; m < h; m++) {
        localB = jdField_char;
      }
      jdField_char = null;
      jdField_else = h;
    }
    jdMethod_for();
  }
  
  public void jdMethod_try()
  {
    if (jdField_do.jdField_for == 0L)
    {
      k = false;
      a = true;
    }
    else
    {
      k = (i > 0.065D);
      a = (i < 0.05D);
    }
  }
  
  public void jdMethod_for() {}
  
  private int a(double paramDouble, int paramInt)
  {
    int m = (int)Math.round((paramDouble + 1.0D) / 2.0D * paramInt + 0.5D) - 1;
    return Math.max(0, Math.min(paramInt - 1, m));
  }
  
  public class a
  {
    double jdField_int;
    double jdField_new;
    int c;
    int jdField_case;
    double[] jdField_byte;
    double[] jdField_if;
    double[] jdField_for;
    double[] jdField_long;
    double jdField_try = 0.0D;
    double f = 0.0D;
    double a = 0.0D;
    double b = 0.0D;
    g d;
    double jdField_goto;
    double jdField_else;
    double jdField_char;
    long jdField_void = i.jdMethod_do(i.this) + d.getTime();
    long jdField_do = i.jdMethod_new();
    
    public a(g paramG)
    {
      d = paramG;
      jdField_int = Math.asin(8.0D / d.j);
      jdField_new = (d.getWidth() / d.i);
      c = ((int)Math.ceil(3.0D * jdField_int / jdField_new));
      jdField_case = (c * 2 + 1);
      jdField_byte = new double[jdField_case];
      jdField_for = new double[jdField_case];
      jdField_if = new double[jdField_case];
      jdField_long = new double[jdField_case];
      jdField_goto = 100.0D;
      jdField_else = 100.0D;
      jdField_char = g;
      a(false);
      if (i.jdMethod_for(i.this)) {
        a();
      }
    }
    
    public void a(boolean paramBoolean)
    {
      if (paramBoolean)
      {
        if (i.a(i.this) != null)
        {
          i.b localB1 = i.a(i.this);
          double d2 = 1.0D;
          d2 += b.jdMethod_int((jdField_else - d.i / d.j) / 50.0D * jdField_else);
          d2 += b.jdMethod_int((jdField_int - d.jdField_else) / 180.0D * jdField_else);
          d2 += b.jdMethod_int((jdField_goto - d.jdField_long) / 8.0D * jdField_else);
          d2 += b.jdMethod_int((jdField_if - d.jdField_case) / 100.0D * jdField_else);
          d2 += b.jdMethod_int((a - d.jdField_byte) / 1000.0D * jdField_else);
          jdField_for[i.a(i.this, jdField_do, jdField_case)] += 1.0D / d2;
          a += 1.0D / d2;
          jdField_long[i.a(i.this, jdField_do, jdField_case)] += 1.0D / d2;
          b += 1.0D / d2;
        }
        return;
      }
      a = 0.0D;
      b = 0.0D;
      i.b localB2 = i.a(i.this);
      for (int i = 0; (localB2 != null) && (jdField_void - jdField_for < jdField_do); i++)
      {
        double d3 = 1.0D;
        d3 += b.jdMethod_int((jdField_else - d.i / d.j) / 50.0D * jdField_else);
        d3 += b.jdMethod_int((jdField_int - d.jdField_else) / 180.0D * jdField_else);
        d3 += b.jdMethod_int((jdField_goto - d.jdField_long) / 8.0D * jdField_else);
        d3 += b.jdMethod_int((jdField_if - d.jdField_case) / 100.0D * jdField_else);
        d3 += b.jdMethod_int((a - d.jdField_byte) / 1000.0D * jdField_else);
        double d1 = 1.0D - (jdField_void - jdField_for) / jdField_do;
        jdField_for[i.a(i.this, jdField_do, jdField_case)] += 1.0D / d3 * d1;
        a += 1.0D / d3 * d1;
        if (jdField_void - jdField_for < i.jdMethod_int())
        {
          d1 = 1.0D - (jdField_void - jdField_for) / i.jdMethod_int();
          jdField_long[i.a(i.this, jdField_do, jdField_case)] += 1.0D / d3 * d1;
          b += 1.0D / d3 * d1;
        }
        localB2 = jdField_char;
      }
    }
    
    public void a()
    {
      jdField_try = 0.0D;
      f = 0.0D;
      int i = 0;
      double d2 = Double.POSITIVE_INFINITY;
      i.b localB = i.jdMethod_if(i.this);
      while ((localB != null) && (jdField_void - jdField_for < jdField_do))
      {
        double d3 = 1.0D;
        d3 += b.jdMethod_int((jdField_else - d.i / d.j) / 50.0D * jdField_goto);
        d3 += b.jdMethod_int((jdField_int - d.jdField_else) / 180.0D * jdField_goto);
        d3 += b.jdMethod_int((jdField_goto - d.jdField_long) / 8.0D * jdField_goto);
        d3 += b.jdMethod_int((jdField_if - d.jdField_case) / 100.0D * jdField_goto);
        d3 += b.jdMethod_int((a - d.jdField_byte) / 1000.0D * jdField_goto);
        if (d3 < d2) {
          d2 = d3;
        }
        double d1 = 1.0D - (jdField_void - jdField_for) / jdField_do;
        jdField_byte[i.a(i.this, jdField_do, jdField_case)] += 1.0D / d3 * d1;
        jdField_try += 1.0D / d3 * d1;
        if (jdField_void - jdField_for < i.jdMethod_int())
        {
          d1 = 1.0D - (jdField_void - jdField_for) / i.jdMethod_int();
          jdField_if[i.a(i.this, jdField_do, jdField_case)] += 1.0D / d3 * d1;
          f += 1.0D / d3 * d1;
        }
        localB = jdField_char;
        i++;
      }
    }
    
    public double jdMethod_int(double paramDouble)
    {
      if (a == 0.0D) {
        return 0.0D;
      }
      double d1 = 0.0D;
      int i = i.a(i.this, paramDouble, jdField_case);
      for (int j = 0; j < jdField_case; j++)
      {
        double d2 = i.a()[(i - j)];
        d1 += jdField_for[j] * d2;
      }
      return d1 / a;
    }
    
    public double a(double paramDouble)
    {
      if (b == 0.0D) {
        return 0.0D;
      }
      double d1 = 0.0D;
      int i = i.a(i.this, paramDouble, jdField_case);
      for (int j = 0; j < jdField_case; j++)
      {
        double d2 = i.a()[(i - j)];
        d1 += jdField_long[j] * d2;
      }
      return d1 / b;
    }
    
    public double jdMethod_if(double paramDouble)
    {
      if (jdField_try == 0.0D) {
        return 0.0D;
      }
      double d1 = 0.0D;
      int i = i.a(i.this, paramDouble, jdField_case);
      for (int j = 0; j < jdField_case; j++)
      {
        double d2 = i.a()[(i - j)];
        d1 += jdField_byte[j] * d2;
      }
      return d1 / jdField_try;
    }
    
    public double jdMethod_try(double paramDouble)
    {
      if (f == 0.0D) {
        return 0.0D;
      }
      double d1 = 0.0D;
      int i = i.a(i.this, paramDouble, jdField_case);
      for (int j = 0; j < jdField_case; j++)
      {
        double d2 = i.a()[(i - j)];
        d1 += jdField_if[j] * d2;
      }
      return d1 / f;
    }
    
    public double jdMethod_new(double paramDouble)
    {
      int i = 0;
      for (int j = 1; j < jdField_case; j++) {
        if (jdField_byte[j] > jdField_byte[i]) {
          i = j;
        }
      }
      return jdField_byte[i.a(i.this, paramDouble, jdField_case)] / jdField_byte[i];
    }
    
    public double jdMethod_for(double paramDouble)
    {
      int i = 0;
      for (int j = 1; j < jdField_case; j++) {
        if (jdField_if[j] > jdField_long[i]) {
          i = j;
        }
      }
      return jdField_if[i.a(i.this, paramDouble, jdField_case)] / jdField_if[i];
    }
    
    public double jdMethod_do(double paramDouble)
    {
      if (jdField_try == 0.0D) {
        return jdMethod_int(paramDouble);
      }
      double d1 = 0.0D;
      double d2 = 0.0D;
      double d3 = 0.0D;
      double d4 = 0.0D;
      int i = i.a(i.this, paramDouble, jdField_case);
      for (int j = 0; j < jdField_case; j++)
      {
        double d5 = i.a()[(i - j)];
        d1 += jdField_byte[j] * d5;
        d3 += jdField_for[j] * d5;
        d2 += jdField_if[j] * d5;
        d4 += jdField_long[j] * d5;
      }
      return (1.0D - jdField_char) * (d1 / jdField_try + d3 / a) + jdField_char * (d2 / f + d4 / b);
    }
    
    public double jdMethod_byte(double paramDouble)
    {
      double d1 = 0.0D;
      double d2 = 0.0D;
      int i = i.a(i.this, paramDouble, jdField_case);
      for (int j = 0; j < jdField_case; j++)
      {
        double d3 = i.a()[(i - j)];
        d1 += jdField_byte[j] * d3;
        d2 += jdField_for[j] * d3;
      }
      return (jdField_try == 0.0D ? 0.0D : d1 / jdField_try) + (a == 0.0D ? 0.0D : d2 / a);
    }
    
    public double jdMethod_case(double paramDouble)
    {
      double d1 = 0.0D;
      double d2 = 0.0D;
      int i = i.a(i.this, paramDouble, jdField_case);
      for (int j = 0; j < jdField_case; j++)
      {
        double d3 = i.a()[(i - j)];
        d1 += jdField_if[j] * d3;
        d2 += jdField_long[j] * d3;
      }
      return (f == 0.0D ? 0.0D : d1 / f) + (b == 0.0D ? 0.0D : d2 / b);
    }
  }
  
  public class b
  {
    public long jdField_for;
    public double jdField_else;
    public double jdField_goto;
    public double jdField_byte;
    public double jdField_new;
    public double jdField_if;
    public double jdField_try;
    public double a;
    public double jdField_int;
    public double jdField_do;
    public b jdField_char;
    
    public b(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9)
    {
      jdField_for = paramLong;
      jdField_else = paramDouble1;
      jdField_goto = paramDouble2;
      jdField_byte = paramDouble3;
      jdField_new = paramDouble4;
      jdField_if = paramDouble5;
      jdField_try = paramDouble6;
      a = paramDouble7;
      jdField_int = paramDouble8;
      jdField_do = paramDouble9;
    }
  }
}
