package simonton.utils;

public class Util
{
  public Util() {}
  
  static double a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return Math.max(paramDouble2, Math.min(paramDouble3, paramDouble1));
  }
}
