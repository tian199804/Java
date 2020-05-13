package club.banyuan;

public class Main {
    public static void print(Weekday weekday) {
        if (weekday.isHoliday())
            System.out.println(weekday+"是节假日");

    }





    public static void main(String[] args) {
        Weekday sat = Weekday.SATURDAY;
        for (Weekday weekday : Weekday.values()) {
            print(weekday);
        }
        for(Weekday day : Weekday.values()){
            int temp=day.compareTo(sat);
            if(temp<0)
                System.out.println(day+"序号小于"+sat);
            else if(temp>0)
                System.out.println(day+"序号大于"+sat);
            else
                System.out.println(day+"序号等于"+sat);


        }
    }
}

