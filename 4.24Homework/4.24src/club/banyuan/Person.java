package club.banyuan;

public class Person {

  private String name;
  private int age;
  private static int count;
  private static int count1;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    ++count;
    ++count1;
  }

  public Person(String name) {
    this.name = name;
    ++count;
  }

  public Person() {
      ++count;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
  public static int  getCount(){
      return count;

  }
  public static int getCount1(){
      return count1;
  }

}