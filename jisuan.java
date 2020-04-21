//题目：有1分，2分，5分硬币，需要每种硬币都有，一共一百枚，总和为150分，有多少种组合
class jisuan {
    public static void main(String[] args){
        int x;
        int y;
        int z;
        int count=0;
        for (x=1;x<99;x++) { 
        for (y=1;y<75;y++) {
            for (z=1;z<30;z++){
                if((x+2*y+5*z==150)&&(x+y+z==100))
                System.out.printf("%d %d %d\n",x,y,z);
                ++count;
               
            }
        }
        }
        
        System.out.printf("%d",count);


    }
   

}
