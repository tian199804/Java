package club.banyuan;

public class RectangleMeasurer implements Measurer<Rectangle>{

  @Override
  public double measure(Rectangle anObject) {
    if (anObject instanceof Rectangle) {
      Rectangle rectangle = (Rectangle) anObject;
      return rectangle.width * rectangle.height;
    }
    throw new IllegalArgumentException("不是矩形类");
  }
}
