package abc;

import java.io.PrintStream;
import robocode.AdvancedRobot;
import robocode.DeathEvent;
import robocode.HitWallEvent;
import robocode.RobotDeathEvent;
import robocode.SkippedTurnEvent;
import robocode.WinEvent;

public class f
{
  private AdvancedRobot jdField_byte;
  private static long jdField_try = 0L;
  private static long jdField_case = 0L;
  private static int jdField_int = 0;
  private static int jdField_new = 0;
  private static int jdField_char = 0;
  private static int jdField_if = 0;
  public int jdField_else = -1;
  private static boolean a = false;
  public int jdField_for = 1;
  private static long jdField_do;
  
  public f(AdvancedRobot paramAdvancedRobot)
  {
    jdField_byte = paramAdvancedRobot;
    a = jdField_byte.getOthers() > 1;
    do = System.currentTimeMillis();
  }
  
  public void a()
  {
    if (jdField_for > 0)
    {
      if (jdField_for > 1)
      {
        jdField_byte.out.println("Skipped turns: " + try);
        jdField_byte.out.println("WallHits: " + case);
      }
      if (a) {
        jdField_byte.out.println("Rounds won: " + int + " (" + Math.round(int * 100.0D / (int + new)) + "%)" + "; 2nds: " + char + "; 3rds: " + if);
      } else {
        jdField_byte.out.println("Rounds won/lost: " + int + "/" + new + " (" + Math.round(int * 100.0D / (int + new)) + "%)");
      }
      long l1 = (System.currentTimeMillis() - do) / 1000L;
      long l2 = l1 / 60L;
      l1 -= l2 * 60L;
      jdField_byte.out.printf("time elapsed: %02d:%02d\n", new Object[] { Long.valueOf(l2), Long.valueOf(l1) });
    }
  }
  
  public void a(SkippedTurnEvent paramSkippedTurnEvent)
  {
    try += 1L;
  }
  
  public void a(HitWallEvent paramHitWallEvent)
  {
    if (jdField_byte.getOthers() > 0) {
      case += 1L;
    }
  }
  
  public void a(DeathEvent paramDeathEvent)
  {
    if (jdField_else != jdField_byte.getRoundNum())
    {
      new += 1;
      a();
    }
    if (jdField_byte.getOthers() == 1) {
      char += 1;
    } else if (jdField_byte.getOthers() == 2) {
      if += 1;
    }
  }
  
  public void a(WinEvent paramWinEvent)
  {
    int += 1;
    jdField_else = jdField_byte.getRoundNum();
    a();
  }
  
  public void a(RobotDeathEvent paramRobotDeathEvent) {}
}
