package club.banyuan;

public class ReadyMadeCake extends Cake{
    private int quantity;
    public ReadyMadeCake(int id,double price,int quantity){
        super(id,price);
        this.quantity=quantity;
        
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String toString() {
        return "ReadyMadeCake" + super.toString() + "\t"+ quantity;
    }


    public double calcPrice() {
        return price * quantity;
    }
}

