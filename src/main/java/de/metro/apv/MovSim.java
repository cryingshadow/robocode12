package apv;

import robocode.AdvancedRobot;
import robocode.util.Utils;

public class MovSim
{
  private double jdField_new = Math.toRadians(10.0D);
  private double jdField_do = 8.0D;
  private double jdField_int = 2.0D;
  private double jdField_if = 1.0D;
  public double a = 10.0D;
  public double jdField_for = 8.0D;
  
  public MovSim() {}
  
  public MovSimStat[] a(int paramInt, AdvancedRobot paramAdvancedRobot)
  {
    return a(paramInt, paramAdvancedRobot, jdField_for, a);
  }
  
  public MovSimStat[] a(int paramInt, AdvancedRobot paramAdvancedRobot, double paramDouble1, double paramDouble2)
  {
    return a(paramInt, paramAdvancedRobot.getX(), paramAdvancedRobot.getY(), paramAdvancedRobot.getVelocity(), paramDouble1, paramAdvancedRobot.getHeadingRadians(), paramAdvancedRobot.getDistanceRemaining(), paramAdvancedRobot.getTurnRemainingRadians(), paramDouble2, paramAdvancedRobot.getBattleFieldWidth(), paramAdvancedRobot.getBattleFieldHeight());
  }
  
  public MovSimStat[] a(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, double paramDouble10)
  {
    MovSimStat[] arrayOfMovSimStat = new MovSimStat[paramInt];
    double d1 = 0.0D;
    int i = 0;
    paramDouble8 = Math.toRadians(paramDouble8);
    double d2;
    if (paramDouble6 == 0.0D) {
      d2 = 0.0D;
    } else if (paramDouble6 < 0.0D) {
      d2 = -1.0D;
    } else {
      d2 = 1.0D;
    }
    for (int j = 0; j < paramInt; j++)
    {
      double d3 = paramDouble5;
      double d4 = Math.min(paramDouble8, (0.4D + 0.6D * (1.0D - Math.abs(paramDouble3) / jdField_do)) * jdField_new);
      if (paramDouble7 > 0.0D)
      {
        if (paramDouble7 < d4)
        {
          paramDouble5 += paramDouble7;
          paramDouble7 = 0.0D;
        }
        else
        {
          paramDouble5 += d4;
          paramDouble7 -= d4;
        }
      }
      else if (paramDouble7 < 0.0D) {
        if (paramDouble7 > -d4)
        {
          paramDouble5 += paramDouble7;
          paramDouble7 = 0.0D;
        }
        else
        {
          paramDouble5 -= d4;
          paramDouble7 += d4;
        }
      }
      paramDouble5 = Utils.normalAbsoluteAngle(paramDouble5);
      if ((paramDouble6 != 0.0D) || (paramDouble3 != 0.0D))
      {
        if ((i == 0) && (d2 == 0.0D))
        {
          i = 1;
          if (paramDouble3 > 0.0D) {
            d2 = 1.0D;
          } else if (paramDouble3 < 0.0D) {
            d2 = -1.0D;
          } else {
            d2 = 0.0D;
          }
        }
        double d5 = paramDouble6;
        if (i != 0) {
          if ((d2 == 1.0D) && (paramDouble6 < 0.0D)) {
            d5 = 0.0D;
          } else if ((d2 == -1.0D) && (paramDouble6 > 1.0D)) {
            d5 = 0.0D;
          }
        }
        double d6 = (int)(jdField_int / 2.0D * (Math.sqrt(4.0D * Math.abs(d5) + 1.0D) - 1.0D));
        if (d2 == -1.0D) {
          d6 = -d6;
        }
        if (i == 0) {
          if (d2 == 1.0D)
          {
            if (paramDouble3 < 0.0D) {
              d1 = jdField_int;
            } else {
              d1 = jdField_if;
            }
            if (paramDouble3 + d1 > d6) {
              i = 1;
            }
          }
          else if (d2 == -1.0D)
          {
            if (paramDouble3 > 0.0D) {
              d1 = -jdField_int;
            } else {
              d1 = -jdField_if;
            }
            if (paramDouble3 + d1 < d6) {
              i = 1;
            }
          }
        }
        if (i != 0)
        {
          if ((paramDouble6 != 0.0D) && (Math.abs(paramDouble3) <= jdField_int) && (Math.abs(paramDouble6) <= jdField_int)) {
            d6 = paramDouble6;
          }
          d7 = d6 - paramDouble3;
          if (d7 > jdField_int) {
            d7 = jdField_int;
          } else if (d7 < -jdField_int) {
            d7 = -jdField_int;
          }
          d1 = d7;
        }
        if ((paramDouble3 > paramDouble4) || (paramDouble3 < -paramDouble4)) {
          d1 = 0.0D;
        }
        paramDouble3 += d1;
        if (paramDouble3 > paramDouble4) {
          paramDouble3 -= Math.min(jdField_int, paramDouble3 - paramDouble4);
        }
        if (paramDouble3 < -paramDouble4) {
          paramDouble3 += Math.min(jdField_int, -paramDouble3 - paramDouble4);
        }
        double d7 = paramDouble3 * Math.sin(paramDouble5);
        double d8 = paramDouble3 * Math.cos(paramDouble5);
        paramDouble1 += d7;
        paramDouble2 += d8;
        if ((i != 0) && (paramDouble3 == 0.0D))
        {
          paramDouble6 = 0.0D;
          d2 = 0.0D;
          i = 0;
          d1 = 0.0D;
        }
        paramDouble6 -= paramDouble3;
        if ((paramDouble1 < 18.0D) || (paramDouble2 < 18.0D) || (paramDouble1 > paramDouble9 - 18.0D) || (paramDouble2 > paramDouble10 - 18.0D))
        {
          paramDouble6 = 0.0D;
          paramDouble7 = 0.0D;
          paramDouble3 = 0.0D;
          d2 = 0.0D;
          paramDouble1 = Math.max(18.0D, Math.min(paramDouble9 - 18.0D, paramDouble1));
          paramDouble2 = Math.max(18.0D, Math.min(paramDouble10 - 18.0D, paramDouble2));
        }
      }
      arrayOfMovSimStat[j] = new MovSimStat(paramDouble1, paramDouble2, paramDouble3, paramDouble5, Utils.normalRelativeAngle(paramDouble5 - d3));
    }
    return arrayOfMovSimStat;
  }
}
