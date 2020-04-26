package club.banyuan.person;
public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Person(String name){
        this.name=name;

    }
    public Person(){

    }
    public void speak(Person person){
        System.out.println(person.name+"的年龄为"+person.age);

    }
}
