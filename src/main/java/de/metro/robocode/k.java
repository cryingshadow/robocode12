package abc;

import java.awt.geom.Line2D.Double;
import java.awt.geom.Point2D.Double;

public class k
{
  public long jdField_if = 0L;
  public double jdField_case;
  public double jdField_byte = 0.0D;
  public double a = 0.0D;
  public double jdField_do = 0.0D;
  public double jdField_try = 0.0D;
  public double jdField_new = 0.0D;
  public double jdField_for = 0.0D;
  public boolean jdField_int = false;
  
  public k(long paramLong, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    jdField_if = paramLong;
    jdField_case = paramDouble1;
    jdField_byte = paramDouble2;
    a = paramDouble3;
    jdField_do = (20.0D - 3.0D * a);
    jdField_try = (4.0D * a + 2.0D * Math.max(a - 1.0D, 0.0D));
  }
  
  public Point2D.Double a(long paramLong)
  {
    double d1 = (paramLong - jdField_if) * jdField_do;
    double d2 = jdField_case + b.jdMethod_if(jdField_new) * d1;
    double d3 = jdField_byte + b.jdMethod_new(jdField_new) * d1;
    return new Point2D.Double(d2, d3);
  }
  
  public Line2D.Double jdMethod_if(long paramLong)
  {
    double d1 = (paramLong - jdField_if) * jdField_do;
    double d2 = jdField_case + b.jdMethod_if(jdField_new) * d1;
    double d3 = jdField_byte + b.jdMethod_new(jdField_new) * d1;
    double d4 = d2 + b.jdMethod_if(jdField_new) * 50.0D;
    double d5 = d3 + b.jdMethod_new(jdField_new) * 50.0D;
    return new Line2D.Double(d2, d3, d4, d5);
  }
  
  public Line2D.Double a(long paramLong1, long paramLong2)
  {
    double d1 = (paramLong1 - jdField_if) * jdField_do;
    double d2 = (paramLong2 - jdField_if) * jdField_do;
    double d3 = jdField_case + b.jdMethod_if(jdField_new) * d1;
    double d4 = jdField_byte + b.jdMethod_new(jdField_new) * d1;
    double d5 = jdField_case + b.jdMethod_if(jdField_new) * d2;
    double d6 = jdField_byte + b.jdMethod_new(jdField_new) * d2;
    return new Line2D.Double(d3, d4, d5, d6);
  }
}
