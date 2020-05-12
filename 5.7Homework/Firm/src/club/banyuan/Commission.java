package club.banyuan;

public class Commission extends Hourly{
    private double salesVolume;//该雇员的总销售额
    private double commissionRate;//该雇员的佣金率

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = commRate;
    }

    public void addSales(double totalSales){
        salesVolume += totalSales;
    }

    public double pay() {
        double payment = super.pay() + commissionRate * salesVolume;
        salesVolume = 0;
        return payment;
    }

    public String toString() {
        String result = super.toString();
        result += "\n销售额: " + salesVolume;
        return result;
    }
}


