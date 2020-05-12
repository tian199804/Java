package club.banyuan;

public class Employee extends StaffMember {

    protected String socialSecurityNumber;
    protected double payRate;//小时工资率

    // 用指定的信息设置员工
    public Employee(String eName, String eAddress, String ePhone,
                    String socSecNumber, double rate) {
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    //以字符串形式返回有关员工的信息
    public String toString() {
        String result = super.toString();
        result += "\n社保账号: " + socialSecurityNumber;
        return result;
    }

    // 返回此员工的工资率.相当于getPayRate
    public double pay() {
        return payRate;
    }
}
