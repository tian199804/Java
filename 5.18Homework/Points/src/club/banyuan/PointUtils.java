package club.banyuan;

import org.junit.Assert;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class PointUtils {

  /**
   * 返回具有最大Y值的点。如果存在多个这样的点，则只需选择一个即可。
   */
  public static Point highestPoint(List<Point> points) {
    /* 这等效于实验室中提到的初始化步骤。 */
    Iterator<Point> pointIterator = points.iterator();
    Point maxPoint = points.get(0);
    while (pointIterator.hasNext()) {
      Point point = pointIterator.next();
      if (point.getY() > maxPoint.getY()) {
        maxPoint = point;
      }
    }

   // 方案一
    // Point rlt=points.get(0);
   // for (Point point:points){
    //  if(point.getY()>rlt.getY())
     //   rlt=point;
   // }

    // TODO 使用迭代器完成此方法!
    return maxPoint;
  }

  /**
   * 返回一个新点，新点的X值是所有给定点的X值的平均值，Y值是所有给定点的Y值的平均值。
   */
  public static Point centroid(List<Point> points) {
    Iterator<Point> pointIterator = points.iterator();
    int sumX=0;
    int sumY=0;
    int count=0;
    // TODO 使用迭代器完成此方法!
    while(pointIterator.hasNext()){
      Point temp=pointIterator.next();
      sumX +=temp.getX();
      sumY +=temp.getY();
      count++;

    }
    return new Point(sumX/count,sumY/count);
  }
@org.junit.Test
  public void test() {
    List<Point> points = new LinkedList<>();
    points.add(new Point(1, 1));
    points.add(new Point(1, 3));
    points.add(new Point(3, 1));
    points.add(new Point(3, 3));

    /* 应该是Point [x = 3，y = 3]或Point [x = 1，y = 3] */
    System.out.println(highestPoint(points));
    // TODO 编写一个单元测试
    // assert 结果是[x = 3，y = 3] 或  [x = 1，y = 3]中的一个
  Assert.assertEquals(points.get(1).toString(),highestPoint(points).toString());

    // 应该是Point[x=2,y=2]
    System.out.println(centroid(points));
    // TODO 编写一个单元测试测试结果
  Assert.assertEquals("Point{x=2,y=2}",centroid(points).toString());

    points = new LinkedList<Point>();
    points.add(new Point(1, 1));
    points.add(new Point(1, -1));
    points.add(new Point(-1, 1));
    points.add(new Point(-1, -1));

    /* 应该是Point[x=1,y=1] 或[x=-1,y=1] */
    System.out.println(highestPoint(points));
    // TODO 编写一个单元测试
    // assert 结果是[x=1,y=1] 或  [x=-1,y=1]中的一个
Assert.assertEquals(points.get(0).toString(),highestPoint(points).toString());
    // 应该是[x=0,y=0]
    System.out.println(centroid(points));
    // TODO 编写一个单元测试测试结果
  Assert.assertEquals("Point{x=0,y=0}", centroid(points).toString());
  }
}
