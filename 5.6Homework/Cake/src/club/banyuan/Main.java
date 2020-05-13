package club.banyuan;



public class Main {
    public static void main(String[] args){
        Cake[] cakeArray=new Cake[10];
        for(int i=0;i<5;i++){
            Cake cake =new ReadyMadeCake(i+1,12.5,1);
                    cakeArray[i]=cake;
        }
        for(int i=5;i<10;i++){
            Cake cake=new OrderCake(i+1,12.5,1.2*(i+1));
            cakeArray[i]=cake;
        }
        double overallPrice=0;
        for(int i=0;i<10;i++){
            overallPrice=overallPrice+cakeArray[i].calcPrice();
        }
        System.out.println("所有蛋糕的总价为"+overallPrice);
        double ReadyMadeCakeoverallPrice=0;
        for(int i=0;i<5;i++){
            ReadyMadeCakeoverallPrice=ReadyMadeCakeoverallPrice+cakeArray[i].calcPrice();
        }
        System.out.println("称重类蛋糕总价为"+ReadyMadeCakeoverallPrice+"数量为5个");
        Cake cakeHighPrice=cakeArray[0];
        for(int i=0;i<10;i++){
            if(cakeArray[i].calcPrice()>cakeHighPrice.calcPrice())
                cakeHighPrice=cakeArray[i];

        }
        System.out.println("价格最高的蛋糕编号为"+cakeHighPrice.id);
        System.out.println("价格最高的蛋糕价格为"+cakeHighPrice.calcPrice());


    }
}
