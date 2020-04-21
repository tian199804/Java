import java.util.*;
import java.io.*;
 public class Chen {
        public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int n1 =sc.nextInt();
        System.out.println("请输入第二个数");
        int n2=sc.nextInt();
        int a=0;
        for(int i=0;i<n1;i++)
         a+=n2;
        System.out.println("相乘后为"+a);

    }
}
