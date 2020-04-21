class Practice{
    public static void main(String[] args){
        int a = 7*24*60*60*1000;
        long b = 30*24*60*60*1000L;
        //float c = 3.14159;  错误: 不兼容的类型: 从double转换到float可能会有损失
        double c = 3.14159;
        int [] arr=new int [3];
         //arr.length=5;   错误: 无法为最终变量length分配值
        String[][] arry=new String[3][];
        arry[0]=new String[]{"你","我","他"};
        arry[1]=new String[]{"金","木","水","火","土"};
        arry[2]=new String[]{"天","地"};
        int i,j;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        for(i=0;i<arry.length;i++){
            System.out.print("{");
            for(j=0;j<arry[i].length;j++)
            System.out.print(arry[i][j]);
            System.out.print("}");
           
        }
       
    }
}
