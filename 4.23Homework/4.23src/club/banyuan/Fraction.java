package club.banyuan;
class Fraction{
    int numerator;//分子
    int denominator; //分母
    Fraction (int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
    
    public double toDouble(){
        return (double)(numerator)/denominator;

    }
    public Fraction plus(Fraction r){
        int n=this.numerator;
        int d=this.denominator;
        this.numerator=(n*r.denominator)+(d*r.numerator);
        this.denominator=d*r.denominator;
        return this;


    }
    public Fraction multiply(Fraction r){
        int n=this.numerator;
        int d=this.denominator;
        this.numerator=n*r.numerator;
        this.denominator=d*r.denominator;
        return this;
    }
    public void print(){
        int t=1;
        if(numerator%denominator==0){
            System.out.println(numerator/denominator);
        }else{
            
            for(int i=0;i<denominator;i++){
                if((denominator%i==0)&&(numerator%i==0))
                t=i;
            }

        }
        System.out.println(numerator/t + "/" + denominator/t);
    }

    
}