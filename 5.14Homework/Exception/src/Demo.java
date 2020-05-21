public class Demo {

    public static void main(String[] args){
        System.out.println("main 1");
        try {

            throw new IllegalAccessException();
            //testException();
            //System.out.println("main 3");
        }catch (NullPointerException e) {
            System.out.println("catch");
        }catch (IllegalAccessException e){
            System.out.println("catch illegal");
        }
        System.out.println("main 2");


    }
    static  void testException(){
        System.out.println("test 1");
    }
}
