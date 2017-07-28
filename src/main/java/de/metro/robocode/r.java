package abc;

import java.io.PrintStream;
import robocode.TeamRobot;

public class r
{
  TeamRobot jdField_try;
  int jdField_if;
  private int jdField_new;
  private a[] jdField_do;
  private long jdField_int;
  public double a;
  public long jdField_for = 0L;
  
  public r(TeamRobot paramTeamRobot, int paramInt)
  {
    jdField_try = paramTeamRobot;
    jdField_if = paramInt;
    jdField_do = new a[jdField_if];
    jdField_new = 0;
    jdField_int = -100L;
  }
  
  public void a()
  {
    jdField_new = 0;
    jdField_int = -100L;
    a = 1.0D;
  }
  
  public void jdMethod_do()
  {
    if (jdField_new == jdField_if)
    {
      for (int i = 1; i < jdField_if; i++) {
        jdField_do[(i - 1)] = jdField_do[i];
      }
      jdField_new -= 1;
    }
    long l = jdField_try.getTime() - jdField_int;
    double d = 0.0D;
    if (l == 1L) {
      d = (Math.abs(jdField_try.getVelocity()) - Math.abs(jdField_do[(jdField_new - 1)].jdField_new)) / l;
    }
    if ((jdField_try.getVelocity() * a < 0.0D) || (jdField_try.getVelocity() == 0.0D)) {
      jdField_for = jdField_try.getTime();
    }
    if (jdField_try.getVelocity() != 0.0D) {
      a = jdField_try.getVelocity();
    }
    jdField_do[jdField_new] = new a(jdField_try, a, d);
    jdField_do[jdField_new].jdField_for = (jdField_try.getTime() - jdField_for);
    jdField_new += 1;
    jdField_int = jdField_try.getTime();
  }
  
  public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    if (jdField_new == jdField_if)
    {
      for (int i = 1; i < jdField_if; i++) {
        jdField_do[(i - 1)] = jdField_do[i];
      }
      jdField_new -= 1;
    }
    double d = 0.0D;
    long l = jdField_try.getTime() - jdField_int;
    if (l == 1L) {
      d = (Math.abs(paramDouble4) - Math.abs(jdField_do[(jdField_new - 1)].jdField_new)) / l;
    }
    if (paramDouble4 != 0.0D) {
      a = paramDouble4;
    }
    jdField_do[jdField_new] = new a(paramDouble1, paramDouble2, paramDouble3, paramDouble4, a, d);
    jdField_new += 1;
    jdField_int = jdField_try.getTime();
  }
  
  public double jdMethod_int(long paramLong)
  {
    int i = (int)(jdField_new - 1 - paramLong);
    if (i < 0) {
      return 0.0D;
    }
    return jdField_do[i].jdField_if;
  }
  
  public double jdMethod_for(long paramLong)
  {
    int i = (int)(jdField_new - 1 - paramLong);
    if (i < 0) {
      return 0.0D;
    }
    return jdField_do[i].jdField_byte;
  }
  
  public double jdMethod_do(long paramLong)
  {
    int i = (int)(jdField_new - 1 - paramLong);
    if (i < 0) {
      return 0.0D;
    }
    return jdField_do[i].jdField_try;
  }
  
  public double jdMethod_new(long paramLong)
  {
    int i = (int)(jdField_new - 1 - paramLong);
    if (i < 0) {
      return 0.0D;
    }
    return jdField_do[i].jdField_new;
  }
  
  public double jdMethod_if(long paramLong)
  {
    int i = (int)(jdField_new - 1 - paramLong);
    if (i < 0) {
      return 0.0D;
    }
    return jdField_do[i].jdField_do;
  }
  
  public double a(long paramLong)
  {
    int i = (int)(jdField_new - 1 - paramLong);
    if (i < 0) {
      return 0.0D;
    }
    return jdField_do[i].jdField_int;
  }
  
  public double jdMethod_try(long paramLong)
  {
    int i = (int)(jdField_new - 1 - paramLong);
    if (i < 0) {
      return 0.0D;
    }
    return jdField_do[i].jdField_for;
  }
  
  public void jdMethod_if()
  {
    jdField_try.out.println("--- " + jdField_new + " ---");
    for (int i = 0; i < jdField_new; i++) {
      jdField_try.out.println(jdField_do[i].jdField_if + ", " + jdField_do[i].jdField_byte + ": " + jdField_do[i].jdField_new + ", " + jdField_do[i].jdField_int);
    }
  }
  
  class a
  {
    double jdField_if;
    double jdField_byte;
    double jdField_try;
    double jdField_new;
    double jdField_do;
    double jdField_int;
    double jdField_for;
    
    public a(TeamRobot paramTeamRobot, double paramDouble1, double paramDouble2)
    {
      jdField_if = paramTeamRobot.getX();
      jdField_byte = paramTeamRobot.getY();
      jdField_try = jdField_try.getHeading();
      jdField_new = jdField_try.getVelocity();
      jdField_int = paramDouble2;
      jdField_do = paramDouble1;
    }
    
    public a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
    {
      jdField_if = paramDouble1;
      jdField_byte = paramDouble2;
      jdField_try = paramDouble3;
      jdField_new = paramDouble4;
      jdField_int = paramDouble6;
      jdField_do = paramDouble5;
    }
  }
}
