public class Random{

    public static void main(String[] args){
        Random rd = new Random();
        System.out.println(rd.randomInt(-10,5));
        
    }

static int randomInt(int from,int to){
    int i=(int)(Math.random()*(to-from+1)+from);
   return i;
    }


}