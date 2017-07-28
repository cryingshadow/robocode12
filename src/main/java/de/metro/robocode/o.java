package abc;

import java.awt.Graphics2D;
import robocode.BulletHitBulletEvent;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.ScannedRobotEvent;
import robocode.TeamRobot;

public abstract class o
{
  protected final TeamRobot jdField_for;
  protected final l jdField_do;
  public int jdField_if = 0;
  public boolean a = false;
  
  public o(TeamRobot paramTeamRobot, l paramL)
  {
    jdField_for = paramTeamRobot;
    jdField_do = paramL;
  }
  
  public void a() {}
  
  public abstract void jdMethod_if();
  
  public void jdMethod_do() {}
  
  public void a(ScannedRobotEvent paramScannedRobotEvent) {}
  
  public void a(HitByBulletEvent paramHitByBulletEvent) {}
  
  public void a(BulletHitBulletEvent paramBulletHitBulletEvent) {}
  
  public void a(HitRobotEvent paramHitRobotEvent) {}
  
  public void a(Graphics2D paramGraphics2D) {}
}
