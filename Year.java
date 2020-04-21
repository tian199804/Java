import java.util.*;
import java.io.*;
public class Year {
public static void main(String[] args){

    Scanner time=new Scanner(System.in);
    long n=time.nextLong();
    System.out.println(n+"分钟");
    int year=(int)(n/525600);
    int day=(int)(n-525600*year)/1440;
    System.out.printf("%d年%d天",year,day);
}


}
