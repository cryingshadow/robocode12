package abc;

import java.awt.Graphics2D;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import robocode.Bullet;
import robocode.BulletHitBulletEvent;
import robocode.BulletHitEvent;
import robocode.BulletMissedEvent;
import robocode.MessageEvent;
import robocode.ScannedRobotEvent;
import robocode.TeamRobot;

public class m
  extends p
{
  private HashMap e = new HashMap();
  private HashMap d = new HashMap();
  
  public m(TeamRobot paramTeamRobot, l paramL)
  {
    super(paramTeamRobot, paramL);
  }
  
  public void a(Bullet paramBullet)
  {
    super.a(paramBullet);
  }
  
  public void a(BulletHitEvent paramBulletHitEvent)
  {
    super.a(paramBulletHitEvent);
  }
  
  public void a(BulletHitBulletEvent paramBulletHitBulletEvent)
  {
    super.a(paramBulletHitBulletEvent);
  }
  
  public void a(BulletMissedEvent paramBulletMissedEvent) {}
  
  public void a(ScannedRobotEvent paramScannedRobotEvent)
  {
    n localN = (n)jdField_for.get(paramScannedRobotEvent.getName());
    Object localObject;
    if (jdField_long.getOthers() > 1)
    {
      localObject = (c)e.get(jdField_goto);
      if (localObject == null) {
        e.put(jdField_goto, localObject = new c(jdField_long, jdField_goto));
      }
      a = a(localN);
      ((c)localObject).a(paramScannedRobotEvent, localN);
    }
    else
    {
      localObject = (a)d.get(jdField_goto);
      if (localObject == null) {
        d.put(jdField_goto, localObject = new a(jdField_long, jdField_goto));
      }
      k = a(localN);
      if ((!c) || (jdField_long.getEnergy() > 0.1D)) {
        ((a)localObject).a(paramScannedRobotEvent);
      }
    }
  }
  
  public void a(MessageEvent paramMessageEvent)
  {
    if ((paramMessageEvent.getMessage() instanceof q))
    {
      q localQ = (q)paramMessageEvent.getMessage();
      n localN = (n)jdField_for.get(a);
      HashMap localHashMap = e;
      c localC = (c)localHashMap.get(a);
      if (localC != null) {
        localC.a(localQ, localN, true);
      }
    }
  }
  
  public void jdMethod_if()
  {
    super.jdMethod_if();
    if ((jdField_long.getOthers() < 2) && (jdField_for.jdField_for != null))
    {
      a localA = (a)d.get(jdField_for.jdField_for.jdField_goto);
      if (localA != null) {
        localA.jdMethod_do();
      }
    }
  }
  
  public double a(n paramN)
  {
    double d1 = 0.0D;
    if (paramN == null) {
      return 0.0D;
    }
    double d2 = b.jdMethod_if(jdField_long, s, p);
    if ((jdField_long.getEnergy() < 50.0D) && (jdField_long.getOthers() > 1))
    {
      if (d2 < 150.0D) {
        d1 = 3.0D;
      } else if (d2 < 800.0D) {
        d1 = (800.0D - d2) / 800.0D * 3.0D;
      } else {
        d1 = 0.1D;
      }
    }
    else if ((d2 < 200.0D) || (jdField_long.getOthers() > 2)) {
      d1 = 3.0D;
    } else if (d2 < 900.0D) {
      d1 = (810000.0D - d2 * d2) / 770000.0D * 3.0D;
    } else {
      d1 = 0.1D;
    }
    if (jdField_long.getOthers() > 1) {
      if (jdField_long.getEnergy() > 80.0D) {
        d1 = Math.max(d1, 3.0D);
      } else if (jdField_long.getEnergy() > 60.0D) {
        d1 = Math.max(d1, 1.9D);
      } else if (jdField_long.getEnergy() > 40.0D) {
        d1 = Math.max(d1, 1.9D);
      }
    }
    if ((jdField_long.getOthers() == 1) || ((jdField_long.getOthers() > 2) && (jdField_long.getEnergy() < 80.0D) && (jdField_long.getEnergy() > 30.0D))) {
      d1 = d2 > 150.0D ? 1.9D : 3.0D;
    }
    d1 = Math.min(d1, (c + 0.1D) / 4.0D);
    if (d1 * 6.0D >= jdField_long.getEnergy()) {
      d1 = jdField_long.getEnergy() / 6.0D;
    }
    if (d1 >= jdField_long.getEnergy() - 0.1D) {
      d1 = jdField_long.getEnergy() - 0.1D;
    }
    d1 = Math.max(Math.min(d1, jdField_try), b);
    if (c) {
      d1 = Math.min(jdField_long.getEnergy(), 3.0D);
    }
    return d1;
  }
  
  public double a(n paramN, double paramDouble1, double paramDouble2)
  {
    a localA = (a)d.get(jdField_goto);
    c localC1 = (c)e.get(jdField_goto);
    if ((jdField_long.getOthers() > 1) || (localA == null) || ((localC1 != null) && (jdField_char < 30)))
    {
      jdField_void = false;
      a = a(paramN);
      double[][][] arrayOfDouble = new double[jdField_for.values().size()][][];
      n[] arrayOfN = new n[jdField_for.values().size()];
      int i = 0;
      int j = 0;
      Iterator localIterator = jdField_for.values().iterator();
      while (localIterator.hasNext())
      {
        localObject = (n)localIterator.next();
        if (d)
        {
          c localC2 = (c)e.get(jdField_goto);
          a = a;
          arrayOfDouble[j] = localC2.a(paramDouble1, paramDouble2);
          if (jdField_long.isTeammate(jdField_goto)) {
            for (k = 0; k < arrayOfDouble[j].length; k++)
            {
              arrayOfDouble[j][k][2] *= -1.0D;
              arrayOfDouble[j][k][3] *= -1.0D;
            }
          }
          arrayOfN[j] = localObject;
          i += arrayOfDouble[j].length;
          j++;
        }
      }
      Object localObject = new double[i][4];
      double d1 = jdField_long.getGunHeading();
      int k = 0;
      int n;
      for (int m = 0; m < j; m++) {
        for (n = 0; n < arrayOfDouble[m].length; n++)
        {
          for (int i1 = 0; i1 < 4; i1++) {
            localObject[k][i1] = arrayOfDouble[m][n][i1];
          }
          double d3 = Math.abs(b.jdMethod_for(arrayOfDouble[m][n][0] - d1));
          d3 = Math.floor(d3 / 18.0D);
          if (d3 > 0.0D)
          {
            arrayOfDouble[m][n][2] *= 0.5D;
            arrayOfDouble[m][n][3] *= 0.5D;
          }
          k++;
        }
      }
      for (m = 0; m < k; m++) {
        for (n = 0; n < k; n++) {
          if ((m != n) && (Math.abs(b.jdMethod_for(localObject[n][0] - localObject[m][0])) < localObject[n][1])) {
            localObject[n][2] += localObject[m][3];
          }
        }
      }
      if (k > 0)
      {
        double d2 = 0.0D;
        int i2 = 0;
        for (int i3 = 0; i3 < k; i3++) {
          if (localObject[i3][2] > d2)
          {
            d2 = localObject[i3][2];
            i2 = i3;
          }
        }
        if (d2 < 0.0D) {
          return 10000.0D;
        }
        return localObject[i2][0];
      }
      return 10000.0D;
    }
    jdField_void = true;
    k = a(paramN);
    return localA.a(paramDouble1, paramDouble2);
  }
  
  public void jdMethod_for()
  {
    super.jdMethod_for();
    Iterator localIterator1 = e.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry1 = (Map.Entry)localIterator1.next();
      localObject2 = (a)d.get((String)localEntry1.getKey());
      if (localObject2 == null) {
        d.put((String)localEntry1.getKey(), new a(jdField_long, (String)localEntry1.getKey()));
      }
    }
    int i = 1;
    if (i != 0)
    {
      Object localObject3 = e.values().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject2 = (c)((Iterator)localObject3).next();
        ((c)localObject2).jdMethod_if();
      }
      localObject2 = e.entrySet().iterator();
      String str1;
      int j;
      String str2;
      Object localObject4;
      Iterator localIterator2;
      Map.Entry localEntry2;
      String str3;
      String str4;
      Object localObject5;
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        str1 = (String)((Map.Entry)localObject3).getKey();
        j = str1.indexOf("(");
        str2 = str1;
        if (j > 0) {
          str2 = str1.substring(0, j);
        }
        localObject4 = (c)((Map.Entry)localObject3).getValue();
        localIterator2 = e.entrySet().iterator();
        while (localIterator2.hasNext())
        {
          localEntry2 = (Map.Entry)localIterator2.next();
          str3 = (String)localEntry2.getKey();
          j = str3.indexOf("(");
          str4 = str3;
          if (j > 0) {
            str4 = str3.substring(0, j);
          }
          if ((localEntry2 != localObject3) && (str4.equals(str2)))
          {
            localObject5 = (c)localEntry2.getValue();
            ((c)localObject4).a((c)localObject5);
          }
        }
      }
      localObject3 = d.values().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject2 = (a)((Iterator)localObject3).next();
        ((a)localObject2).jdMethod_new();
      }
      localObject2 = d.entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        str1 = (String)((Map.Entry)localObject3).getKey();
        j = str1.indexOf("(");
        str2 = str1;
        if (j > 0) {
          str2 = str1.substring(0, j);
        }
        localObject4 = (a)((Map.Entry)localObject3).getValue();
        localIterator2 = d.entrySet().iterator();
        while (localIterator2.hasNext())
        {
          localEntry2 = (Map.Entry)localIterator2.next();
          str3 = (String)localEntry2.getKey();
          j = str3.indexOf("(");
          str4 = str3;
          if (j > 0) {
            str4 = str3.substring(0, j);
          }
          if ((localEntry2 != localObject3) && (str4.equals(str2)))
          {
            localObject5 = (a)localEntry2.getValue();
            ((a)localObject4).a((a)localObject5);
          }
        }
      }
    }
    Object localObject2 = e.values().iterator();
    Object localObject1;
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (c)((Iterator)localObject2).next();
      ((c)localObject1).jdMethod_do();
    }
    localObject2 = d.values().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (a)((Iterator)localObject2).next();
      ((a)localObject1).a();
    }
  }
  
  public void a(Graphics2D paramGraphics2D)
  {
    Iterator localIterator = d.values().iterator();
    while (localIterator.hasNext())
    {
      a localA = (a)localIterator.next();
      localA.a(paramGraphics2D);
    }
  }
}
