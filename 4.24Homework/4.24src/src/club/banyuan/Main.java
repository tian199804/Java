package club.banyuan;
import club.banyuan.Person;

public class Main {

  public static void main(String[] args) {
    Person person = new Person();
    Person zhangsan = new Person("张三", 18);
    Person lisi = new Person("李四");
    Person wangwu = new Person("王五");
    Person zhaoliu = new Person("赵六", 20);
    Person.getCount();
    System.out.println("一共创建了"+Person.getCount()+"个对象");
    System.out.println("两个参数的构造方法被调用了"+Person.getCount1()+"次");

  }
}
