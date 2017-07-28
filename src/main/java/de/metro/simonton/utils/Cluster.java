package simonton.utils;

import abc.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;

public class Cluster
  implements Iterable
{
  public final double[] a;
  private final int jdField_for;
  private final h jdField_do;
  private final PriorityQueue jdField_int = new PriorityQueue();
  private final double[] jdField_if;
  
  public Cluster(double[] paramArrayOfDouble, int paramInt, h paramH)
  {
    a = paramArrayOfDouble;
    jdField_for = paramInt;
    jdField_do = paramH;
    jdField_if = new double[paramArrayOfDouble.length];
  }
  
  public Collection jdMethod_if()
  {
    ArrayList localArrayList = new ArrayList(jdField_int.size());
    Iterator localIterator = jdField_int.iterator();
    while (localIterator.hasNext())
    {
      Point localPoint = (Point)localIterator.next();
      localArrayList.add(jdField_do);
    }
    return localArrayList;
  }
  
  public Point a()
  {
    return (Point)jdField_int.poll();
  }
  
  public Point jdMethod_do()
  {
    return (Point)jdField_int.peek();
  }
  
  public void a(Object paramObject, double[] paramArrayOfDouble)
  {
    a(new Point(paramObject, paramArrayOfDouble));
  }
  
  public void a(Point paramPoint)
  {
    paramPoint.a(jdField_do, a);
    if (jdField_int.size() < jdField_for)
    {
      jdField_int.add(paramPoint);
    }
    else if (jdField_if < jdField_int.peek()).jdField_if)
    {
      jdField_int.poll();
      jdField_int.add(paramPoint);
    }
  }
  
  public void a(int paramInt)
  {
    while (jdField_int.size() > paramInt) {
      jdField_int.poll();
    }
  }
  
  public boolean a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    if (jdField_int.size() < jdField_for) {
      return true;
    }
    int i = paramArrayOfDouble1.length;
    do
    {
      jdField_if[i] = Util.a(a[i], paramArrayOfDouble1[i], paramArrayOfDouble2[i]);
      i--;
    } while (i >= 0);
    return ((Point)jdField_int.peek()).a(jdField_if, a, jdField_do);
  }
  
  public Iterator iterator()
  {
    return jdField_int.iterator();
  }
  
  public int jdMethod_for()
  {
    return jdField_int.size();
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Cluster)) {
      return false;
    }
    HashSet localHashSet1 = new HashSet(jdField_int);
    HashSet localHashSet2 = new HashSet(jdField_int);
    return localHashSet1.equals(localHashSet2);
  }
  
  public String toString()
  {
    return jdField_int.toString();
  }
  
  public static class Point
    implements Comparable
  {
    public final Object jdField_do;
    public final double[] a;
    public double jdField_if;
    
    public Point(Object paramObject, double[] paramArrayOfDouble)
    {
      jdField_do = paramObject;
      a = paramArrayOfDouble;
    }
    
    public void a(h paramH, double[] paramArrayOfDouble)
    {
      jdField_if = paramH.a(paramArrayOfDouble, a);
    }
    
    public boolean a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, h paramH)
    {
      return jdField_if > paramH.a(paramArrayOfDouble1, paramArrayOfDouble2);
    }
    
    public int a(Point paramPoint)
    {
      if (jdField_if > jdField_if) {
        return -1;
      }
      if (jdField_if < jdField_if) {
        return 1;
      }
      return 0;
    }
    
    public boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof Point)) {
        return false;
      }
      Point localPoint = (Point)paramObject;
      return (jdField_do.equals(jdField_do)) && (Arrays.equals(a, a));
    }
    
    public int hashCode()
    {
      return Arrays.hashCode(a) ^ jdField_do.hashCode();
    }
    
    public String toString()
    {
      return jdField_do.toString();
    }
  }
}
