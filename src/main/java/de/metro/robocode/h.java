package abc;

public final class h
{
  public double[] a = { 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D, 1.0D };
  public double[][] jdField_if;
  
  public h() {}
  
  public double a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    double d1 = 1.0D;
    for (int i = 0; i < paramArrayOfDouble1.length; i++)
    {
      double d2 = (paramArrayOfDouble1[i] - paramArrayOfDouble2[i]) * a[i];
      d1 += d2 * d2;
    }
    return d1;
  }
}
