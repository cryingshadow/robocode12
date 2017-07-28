package abc;

import java.awt.geom.Line2D.Double;
import robocode.AdvancedRobot;

final class b
{
  b() {}
  
  public static final double jdMethod_int(double paramDouble)
  {
    return paramDouble * paramDouble;
  }
  
  public static final double jdMethod_if(double paramDouble)
  {
    return Math.sin(Math.toRadians(paramDouble));
  }
  
  public static final double jdMethod_new(double paramDouble)
  {
    return Math.cos(Math.toRadians(paramDouble));
  }
  
  public static final double jdMethod_do(double paramDouble)
  {
    return Math.tan(Math.toRadians(paramDouble));
  }
  
  public static final double jdMethod_if(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    return Math.toDegrees(1.5707963267948966D - Math.atan2(paramDouble4 - paramDouble2, paramDouble3 - paramDouble1));
  }
  
  public static final double jdMethod_do(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    return 1.5707963267948966D - Math.atan2(paramDouble4 - paramDouble2, paramDouble3 - paramDouble1);
  }
  
  public static final double a(AdvancedRobot paramAdvancedRobot, double paramDouble1, double paramDouble2)
  {
    return Math.toDegrees(1.5707963267948966D - Math.atan2(paramDouble2 - paramAdvancedRobot.getY(), paramDouble1 - paramAdvancedRobot.getX()));
  }
  
  public static final double jdMethod_int(AdvancedRobot paramAdvancedRobot, double paramDouble1, double paramDouble2)
  {
    return 1.5707963267948966D - Math.atan2(paramDouble2 - paramAdvancedRobot.getY(), paramDouble1 - paramAdvancedRobot.getX());
  }
  
  public static final double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    return Math.sqrt(jdMethod_int(paramDouble3 - paramDouble1) + jdMethod_int(paramDouble4 - paramDouble2));
  }
  
  public static final double jdMethod_if(AdvancedRobot paramAdvancedRobot, double paramDouble1, double paramDouble2)
  {
    return Math.sqrt(jdMethod_int(paramDouble1 - paramAdvancedRobot.getX()) + jdMethod_int(paramDouble2 - paramAdvancedRobot.getY()));
  }
  
  public static final double jdMethod_for(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    return jdMethod_int(paramDouble3 - paramDouble1) + jdMethod_int(paramDouble4 - paramDouble2);
  }
  
  public static final double jdMethod_for(AdvancedRobot paramAdvancedRobot, double paramDouble1, double paramDouble2)
  {
    return jdMethod_int(paramDouble1 - paramAdvancedRobot.getX()) + jdMethod_int(paramDouble2 - paramAdvancedRobot.getY());
  }
  
  public static double jdMethod_for(double paramDouble)
  {
    paramDouble %= 360.0D;
    if (paramDouble > 180.0D) {
      paramDouble -= 360.0D;
    }
    if (paramDouble < -180.0D) {
      paramDouble += 360.0D;
    }
    return paramDouble;
  }
  
  public static double a(double paramDouble)
  {
    paramDouble = paramDouble % 3.141592653589793D * 2.0D;
    if (paramDouble > 3.141592653589793D) {
      paramDouble -= 6.283185307179586D;
    }
    if (paramDouble < -3.141592653589793D) {
      paramDouble += 6.283185307179586D;
    }
    return paramDouble;
  }
  
  public static void jdMethod_if(AdvancedRobot paramAdvancedRobot, double paramDouble)
  {
    paramAdvancedRobot.setTurnRight(jdMethod_for(paramDouble - paramAdvancedRobot.getHeading()));
  }
  
  public static void jdMethod_do(AdvancedRobot paramAdvancedRobot, double paramDouble)
  {
    paramAdvancedRobot.setTurnLeftRadians(a(paramAdvancedRobot.getHeadingRadians() - paramDouble));
  }
  
  public static double jdMethod_new(AdvancedRobot paramAdvancedRobot, double paramDouble)
  {
    double d = jdMethod_for(paramAdvancedRobot.getHeading() - paramDouble);
    if (d > 90.0D) {
      d -= 180.0D;
    }
    if (d < -90.0D) {
      d += 180.0D;
    }
    paramAdvancedRobot.setTurnLeft(d);
    return (paramAdvancedRobot.getHeading() < 90.0D) || (paramAdvancedRobot.getHeading() > 270.0D) ? 1 : -1;
  }
  
  public static void a(AdvancedRobot paramAdvancedRobot, double paramDouble)
  {
    paramAdvancedRobot.setTurnGunLeft(jdMethod_for(paramAdvancedRobot.getGunHeading() - paramDouble));
  }
  
  public static void jdMethod_int(AdvancedRobot paramAdvancedRobot, double paramDouble)
  {
    paramAdvancedRobot.setTurnRadarLeft(jdMethod_for(paramAdvancedRobot.getRadarHeading() - paramDouble));
  }
  
  public static void jdMethod_do(AdvancedRobot paramAdvancedRobot, double paramDouble1, double paramDouble2)
  {
    double d1 = Math.sqrt(jdMethod_int(paramAdvancedRobot.getX() - paramDouble1) + jdMethod_int(paramAdvancedRobot.getY() - paramDouble2));
    double d2 = jdMethod_for(a(paramAdvancedRobot, paramDouble1, paramDouble2) - paramAdvancedRobot.getHeading());
    if (Math.abs(d2) > 90.0D)
    {
      d1 *= -1.0D;
      if (d2 > 0.0D) {
        d2 -= 180.0D;
      } else {
        d2 += 180.0D;
      }
    }
    if (Math.abs(d2) > 20.0D) {
      paramAdvancedRobot.setMaxVelocity(3.0D);
    } else {
      paramAdvancedRobot.setMaxVelocity(8.0D);
    }
    paramAdvancedRobot.setTurnRight(d2);
    paramAdvancedRobot.setAhead(d1);
  }
  
  public static void jdMethod_new(AdvancedRobot paramAdvancedRobot, double paramDouble1, double paramDouble2)
  {
    double d1 = jdMethod_for(a(paramAdvancedRobot, paramDouble1, paramDouble2) - paramAdvancedRobot.getHeading());
    double d2 = 1000.0D;
    if (Math.abs(d1) > 90.0D)
    {
      d2 *= -1.0D;
      if (d1 > 0.0D) {
        d1 -= 180.0D;
      } else {
        d1 += 180.0D;
      }
    }
    paramAdvancedRobot.setTurnRight(d1);
    paramAdvancedRobot.setAhead(d2);
  }
  
  public static void jdMethod_for(AdvancedRobot paramAdvancedRobot, double paramDouble)
  {
    double d1 = jdMethod_for(paramDouble - paramAdvancedRobot.getHeading());
    double d2 = 1000.0D;
    if (Math.abs(d1) > 90.0D)
    {
      d2 *= -1.0D;
      if (d1 > 0.0D) {
        d1 -= 180.0D;
      } else {
        d1 += 180.0D;
      }
    }
    paramAdvancedRobot.setTurnRight(d1);
    paramAdvancedRobot.setAhead(d2);
  }
  
  public static boolean a(Line2D.Double paramDouble1, Line2D.Double paramDouble2)
  {
    double d1 = x1;
    double d2 = x2;
    double d3 = x1;
    double d4 = x2;
    double d5 = y1;
    double d6 = y2;
    double d7 = y1;
    double d8 = y2;
    double d9 = d1 - d3;
    double d10 = d2 - d1;
    double d11 = d4 - d3;
    double d12 = d5 - d7;
    double d13 = d6 - d5;
    double d14 = d8 - d7;
    double d15 = d14 * d10 - d11 * d13;
    double d16 = (d11 * d12 - d14 * d9) / d15;
    double d17 = (d10 * d12 - d13 * d9) / d15;
    return (d16 >= 0.0D) && (d16 <= 1.0D) && (d17 >= 0.0D) && (d17 <= 1.0D);
  }
}
