package club.banyuan;
import java.util.Scanner;
public class FourNumber {
    public static final int POSTION_TOTAL = 4;
    private char[] value;
    public FourNumber(char[] value) {
        this.value=value;
    }
    public void setValue(char[] value){
        this.value=value;
    }
    public char[] getValue(){
        return value;

    }
    public NumberCompareResult compare(FourNumber fournumber) {
        NumberCompareResult numbercompareresult=new NumberCompareResult();
        char [] target =fournumber.getValue();
        for(int i=0;i<POSTION_TOTAL;i++) {
            if (value[i]==target[i]) {
                numbercompareresult.countonepositionright();
            }else {
                String source=new String(value);
                if (source.contains(target[i]+"")){
                    numbercompareresult.countonevalueright();
                }
            }
        }
        return numbercompareresult;

    }
    public static FourNumber generateFournumberRandom(){
        char[]digitChars ={'0','1','2','3','4','5','6','7','8','9'};
        FourNumber rlt =new FourNumber(new char[4]);
        for (int i=0;i<POSTION_TOTAL;i++) {
            int index =(int)(Math.random()*(digitChars.length-i));
            rlt.getValue()[i]=digitChars[index];
            digitChars[index]=digitChars[digitChars.length-i-1];

        }
        return rlt;
    }
    public static FourNumber generatefournumberfromuserinput(){
        Scanner sc=new Scanner(System.in);
        if (sc.hasNext()){
            String input=sc.nextLine();
            if(input.length()!=POSTION_TOTAL) {
                System.out.println("输入不合法，请重新输入！");
                return generatefournumberfromuserinput();
            }
            char[]inputChars =input.toCharArray();
            for (int i=0;i<inputChars.length;i++){
                if (inputChars[i]<'0'||inputChars[i]>'9') {
                    System.out.println("输入不合法，请重新输入！");
                    return generatefournumberfromuserinput();
                }

            }
            return new FourNumber(inputChars);
        }
        System.out.println("输入异常");
        return null;
    }
    

}