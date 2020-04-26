package club.banyuan.main;
import club.banyuan.person.Person;
public class Main{
    public static void main(String[] args){
Person person = new Person();
Person zhangsan = new Person("张三", 18);
zhangsan.speak(zhangsan);
Person lisi = new Person("李四");

}
}