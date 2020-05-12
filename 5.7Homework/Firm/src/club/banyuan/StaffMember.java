package club.banyuan;

abstract  public class StaffMember  {
    protected String name;
    protected String address;
    protected String phone;
    public StaffMember(String eName,String eAddress,String ePhone){
        name=eName;
        address=eAddress;
        phone=ePhone;
    }
    public String toString(){
        String result="姓名"+name+"\n";
        result+="住址"+address+"\n";
        result+="电话"+phone+"\n";
        return result;
    }
    public abstract double pay();

}
