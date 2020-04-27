public class StringBuffer{
    private String buffer;
    public void append(String str){
        buffer=buffer+str;
    }
    public void append(char str){
        buffer=buffer+str;
    }
    public String toString(){
        return buffer;
    }
    public void clear(){
        buffer=" ";
    }
    public String reverse(String str){
        char[] chars=str.toCharArray();
        char[] reverseChars=new char[chars.length];
        for(int i=0;i<chars.length;i++) {
            reverseChars[chars.length-1-i]=chars[i];
        }
        return new String(reverseChars);

    }
    String Sreverse(int from,int to){
        String beforeFrom=buffer.substring(0,from);
        String afterTo=buffer.substring(to);
        return beforeFrom+reverse(buffer.substring(from,to))+afterTo;
    }
       public static void main(String[] args){
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("abcdefg");
        stringBuffer.append('3');
        System.out.println(stringBuffer.toString());
        System.out.println(stringBuffer.reverse("abcdefg"));
        System.out.println(stringBuffer.Sreverse(1,3));

    }
}

    