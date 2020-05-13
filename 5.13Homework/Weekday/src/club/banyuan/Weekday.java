package club.banyuan;

public enum Weekday {
    TUESDAY("星期二"), MONDAY("星期一"), WEDNESDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五"),
    SATURDAY("星期六"), SUNDAY("星期日");
    public String name;

    Weekday(String name) {
        this.name = name;
    }

    boolean isWeekDay() {
        if (ordinal() <= 4)
            return true;
        else
            return false;


    }


    boolean isHoliday() {
        if (ordinal() > 4)
            return true;
        else
            return false;


    }

    public String toString() {
        return this.name;
    }
}
