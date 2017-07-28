package abc;

import robocode.AdvancedRobot;

public class g
{
  public double d;
  public double b;
  public double c;
  public double j;
  public double i;
  public double g;
  public double e;
  public double jdField_try;
  public double jdField_long;
  public double f;
  public double jdField_else;
  public double jdField_do;
  public double jdField_byte;
  public double jdField_for;
  public double l;
  public double jdField_void;
  public double jdField_goto;
  public double jdField_case;
  public double jdField_new;
  public double jdField_int;
  public double n;
  public double m;
  public long jdField_char;
  public boolean jdField_if = false;
  public boolean a = false;
  public boolean k = false;
  public double h = 0.0D;
  
  public g(AdvancedRobot paramAdvancedRobot, long paramLong, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, double paramDouble10, double paramDouble11, double paramDouble12)
  {
    jdField_void = paramDouble10;
    jdField_goto = paramDouble11;
    jdField_case = paramDouble12;
    jdField_char = paramLong;
    d = paramDouble1;
    b = paramDouble2;
    c = paramDouble3;
    g = paramDouble4;
    e = paramDouble5;
    j = (20.0D - 3.0D * c);
    i = b.a(g, e, d, b);
    f = b.jdMethod_if(d, b, g, e);
    jdField_try = paramDouble6;
    if (paramDouble8 < 0.0D) {
      jdField_try += 180.0D;
    }
    jdField_try %= 360.0D;
    double d1 = 0.0D;
    double d2 = 0.0D;
    if ((jdField_try <= 90.0D) || (jdField_try >= 270.0D)) {
      d1 = (paramAdvancedRobot.getBattleFieldHeight() - e) / b.jdMethod_new(jdField_try);
    } else {
      d1 = e / b.jdMethod_new(jdField_try - 180.0D);
    }
    if (jdField_try <= 180.0D) {
      d2 = (paramAdvancedRobot.getBattleFieldWidth() - g) / b.jdMethod_new(jdField_try - 90.0D);
    } else {
      d2 = g / b.jdMethod_new(jdField_try - 180.0D - 90.0D);
    }
    jdField_byte = Math.min(400.0D, Math.min(d1, d2));
    if (((jdField_try + 180.0D) % 360.0D <= 90.0D) || ((jdField_try + 180.0D) % 360.0D >= 270.0D)) {
      d1 = (paramAdvancedRobot.getBattleFieldHeight() - e) / b.jdMethod_new(jdField_try + 180.0D);
    } else {
      d1 = e / b.jdMethod_new(jdField_try);
    }
    if ((jdField_try + 180.0D) % 360.0D <= 180.0D) {
      d2 = (paramAdvancedRobot.getBattleFieldWidth() - g) / b.jdMethod_new((jdField_try + 180.0D) % 360.0D - 90.0D);
    } else {
      d2 = g / b.jdMethod_new((jdField_try + 180.0D) % 360.0D - 180.0D - 90.0D);
    }
    double d3 = Math.min(400.0D, Math.min(d1, d2));
    jdField_for = d3;
    jdField_else = b.jdMethod_for(jdField_try - b.jdMethod_if(d, b, g, e));
    jdField_try = (jdField_else < 0.0D ? -1 : 1);
    jdField_long = Math.abs(paramDouble7);
    jdField_do = ((int)Math.abs(paramDouble7 * b.jdMethod_new(paramDouble6 - b.jdMethod_if(d, b, g, e))));
    l = paramDouble9;
    jdField_else = Math.abs(jdField_else);
  }
  
  public double a(AdvancedRobot paramAdvancedRobot)
  {
    long l1 = paramAdvancedRobot.getTime();
    double d1 = (l1 - jdField_char) * j;
    double d2 = b.a(paramAdvancedRobot.getX(), paramAdvancedRobot.getY(), d, b);
    return d2 - d1;
  }
  
  public double a(double paramDouble1, double paramDouble2, long paramLong)
  {
    double d1 = (paramLong - jdField_char) * j;
    double d2 = b.a(paramDouble1, paramDouble2, d, b);
    return d2 - d1;
  }
}
