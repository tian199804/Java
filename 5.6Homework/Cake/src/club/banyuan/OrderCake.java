package club.banyuan;

public class OrderCake extends Cake{
    private double weightInKG;
    public OrderCake(int id,double price,double weightInKG){
        super(id,price);
        this.weightInKG=weightInKG;

    }

    public double getWeightInKG() {
        return weightInKG;
    }

    public void setWeightInKG(double weightInKG) {
        this.weightInKG = weightInKG;
    }
    public String toString(){
        return "OderCake"+super.toString()+ "\t"+ weightInKG;
    }
    public double calcPrice() {
        return price * weightInKG;
    }
}
