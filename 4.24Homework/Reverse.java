public class Reverse {

    private static String reverse(String str) {
      char[] chars = str.toCharArray();
      char[] reversedChars = new char[chars.length];
      for (int i = 0; i < chars.length; i++) {
        reversedChars[chars.length - 1 - i] = chars[i];
      }
      return new String(reversedChars);
    }
  
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        String target="To be or not to be";
        String[]words=target.split(" ");
        for (int i=0;i<words.length;i++) {
            stringBuffer.append(reverse(words[i]));
            stringBuffer.append(" ");

        }
        System.out.println(stringBuffer.toString());
    }
}