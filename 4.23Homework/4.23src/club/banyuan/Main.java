package club.banyuan;
public class Main {
    public static void main(String[] args){
    Fraction f=new Fraction(4,2);
    Fraction r=new Fraction(1,2);
    f.print();
    r.print();
    System.out.println(r.toDouble());
    f.plus(r);
    f.print();
    f.multiply(r);
    f.print();
}

}