class Blob implements Measurable
{
  private double thing;
  private double it;

  public Blob(double x)
  {
    thing = 5;
    it = x * 3;
  }

  public double getArea()
  {
    return Math.PI * 1.5 + (thing * it);
  }

  public double getPerimeter()
  {
    return Math.sqrt(thing * 100 - it * it);
  }
}
