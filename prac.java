class prac{
    public static void main(String []args) {
        float a=2200000000F;
        int b=(int) a;
        System.out.println(b);
        int num1=5;
        int num2=4;
      //  System.out.println(num1 || num2);错误: 二元运算符 '||' 的操作数类型错误
        System.out.println(false || num1>8);//正确，输出false
        System.out.println(num1 | num2);//正确，输出5
        System.out.println(true | num1>8);//正确，输出true
        



    }
}
//强制转换后输出int 型最大数 2147483647

