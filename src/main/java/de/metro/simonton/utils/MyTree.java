package simonton.utils;

import abc.h;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MyTree
{
  private final Node jdField_new;
  private final int jdField_byte;
  private final double jdField_if;
  private int jdField_char;
  private long jdField_for;
  public int jdField_do;
  private final double[] jdField_try;
  private final double[] jdField_int;
  private final double[] a;
  private final double[] jdField_case;
  
  public MyTree(int paramInt1, int paramInt2, double paramDouble, int paramInt3)
  {
    jdField_byte = paramInt2;
    jdField_if = paramDouble;
    jdField_new = new Node(paramInt3);
    jdField_try = new double[paramInt1];
    jdField_int = new double[paramInt1];
    a = new double[paramInt1];
    jdField_case = new double[paramInt1];
  }
  
  public void a(double[] paramArrayOfDouble, Object paramObject)
  {
    a(new Cluster.Point(paramObject, paramArrayOfDouble));
  }
  
  public Cluster.Point a(Cluster.Point paramPoint)
  {
    for (int i = 0; i < a.length; i++)
    {
      a[i] += a[i];
      jdField_case[i] += a[i] * a[i];
      jdField_for += 1L;
    }
    jdMethod_if();
    Cluster.Point localPoint = jdField_new.a(paramPoint);
    if (localPoint == null) {
      jdField_char += 1;
    } else {
      jdField_do += 1;
    }
    return localPoint;
  }
  
  public void a()
  {
    for (int i = 0; i < a.length; i++) {
      System.out.println(i + ":" + Math.sqrt((jdField_for * jdField_case[i] - a[i] * a[i]) / (jdField_for * (jdField_for - 1L))));
    }
  }
  
  public Cluster a(double[] paramArrayOfDouble, int paramInt, h paramH)
  {
    jdMethod_if();
    Cluster localCluster = new Cluster(paramArrayOfDouble, paramInt, paramH);
    jdField_new.a(localCluster);
    return localCluster;
  }
  
  public int jdMethod_do()
  {
    return jdField_char;
  }
  
  private void jdMethod_if()
  {
    int i = jdField_try.length;
    do
    {
      jdField_try[i] = 0.0D;
      jdField_int[i] = jdField_if;
      i--;
    } while (i >= 0);
  }
  
  private class Node
  {
    private final int jdField_new;
    private boolean jdField_if = false;
    private Node jdField_int;
    private Node jdField_do;
    private Queue jdField_for = new LinkedList();
    
    public Node(int paramInt)
    {
      jdField_new = paramInt;
    }
    
    public Cluster.Point a(Cluster.Point paramPoint)
    {
      if (jdField_if)
      {
        double[] arrayOfDouble = a;
        int j = jdField_new % arrayOfDouble.length;
        double d2 = (MyTree.jdMethod_if(MyTree.this)[j] + MyTree.a(MyTree.this)[j]) / 2.0D;
        if (arrayOfDouble[j] < d2)
        {
          MyTree.a(MyTree.this)[j] = d2;
          if (jdField_int == null) {
            jdField_int = new Node(MyTree.this, jdField_new - 1);
          }
          return jdField_int.a(paramPoint);
        }
        MyTree.jdMethod_if(MyTree.this)[j] = d2;
        if (jdField_do == null) {
          jdField_do = new Node(MyTree.this, jdField_new - 1);
        }
        return jdField_do.a(paramPoint);
      }
      if (jdField_for.size() < MyTree.jdMethod_do(MyTree.this))
      {
        jdField_for.add(paramPoint);
        return null;
      }
      if (jdField_new == 1)
      {
        jdField_for.add(paramPoint);
        return (Cluster.Point)jdField_for.poll();
      }
      int i = jdField_new % MyTree.jdMethod_if(MyTree.this).length;
      double d1 = (MyTree.jdMethod_if(MyTree.this)[i] + MyTree.a(MyTree.this)[i]) / 2.0D;
      Iterator localIterator = jdField_for.iterator();
      while (localIterator.hasNext())
      {
        Cluster.Point localPoint = (Cluster.Point)localIterator.next();
        if (a[i] < d1)
        {
          if (jdField_int == null) {
            jdField_int = new Node(MyTree.this, jdField_new - 1);
          }
          jdField_int.jdField_for.add(localPoint);
        }
        else
        {
          if (jdField_do == null) {
            jdField_do = new Node(MyTree.this, jdField_new - 1);
          }
          jdField_do.jdField_for.add(localPoint);
        }
      }
      jdField_for = null;
      jdField_if = true;
      return a(paramPoint);
    }
    
    public void a(Cluster paramCluster)
    {
      if (jdField_if)
      {
        int i = jdField_new % MyTree.jdMethod_if(MyTree.this).length;
        double d = (MyTree.jdMethod_if(MyTree.this)[i] + MyTree.a(MyTree.this)[i]) / 2.0D;
        boolean bool = a[i] < d;
        a(paramCluster, d, bool);
        a(paramCluster, d, !bool);
      }
      else
      {
        Iterator localIterator = jdField_for.iterator();
        while (localIterator.hasNext())
        {
          Cluster.Point localPoint = (Cluster.Point)localIterator.next();
          paramCluster.a(localPoint);
        }
      }
    }
    
    private void a(Cluster paramCluster, double paramDouble, boolean paramBoolean)
    {
      int i = jdField_new % MyTree.jdMethod_if(MyTree.this).length;
      double d;
      if (paramBoolean)
      {
        if (jdField_int == null) {
          return;
        }
        d = MyTree.a(MyTree.this)[i];
        MyTree.a(MyTree.this)[i] = paramDouble;
        if (paramCluster.a(MyTree.jdMethod_if(MyTree.this), MyTree.a(MyTree.this))) {
          jdField_int.a(paramCluster);
        }
        MyTree.a(MyTree.this)[i] = d;
      }
      else
      {
        if (jdField_do == null) {
          return;
        }
        d = MyTree.jdMethod_if(MyTree.this)[i];
        MyTree.jdMethod_if(MyTree.this)[i] = paramDouble;
        if (paramCluster.a(MyTree.jdMethod_if(MyTree.this), MyTree.a(MyTree.this))) {
          jdField_do.a(paramCluster);
        }
        MyTree.jdMethod_if(MyTree.this)[i] = d;
      }
    }
  }
}
