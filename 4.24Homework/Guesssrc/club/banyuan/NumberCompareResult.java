package club.banyuan;
public class NumberCompareResult {
    private int positionrightcount;
    private int valuerightcount;
    public int getpositionrightcount(){
        return positionrightcount;
    }
    public void setpositionrightcount(int positionrightcount){
        this.positionrightcount=positionrightcount;
    }
    public int getvaluerightcount(){
        return valuerightcount;
    }
    public void setvaluerighrcount(){
        this.valuerightcount=valuerightcount;
    }
    public void countonepositionright(){
        positionrightcount++;
        valuerightcount++;
    }
    public void countonevalueright(){
        valuerightcount++;
    }
    boolean isSuccess(){
        return FourNumber.POSTION_TOTAL==positionrightcount;
    }


void printResult(){
    System.out.printf("包含了%d个正确的数字\n",valuerightcount);
    if(positionrightcount==0) {
        System.out.println("但是这些数字位置错误");

    }else{
        System.out.printf("%d个数字的位置正确\n",positionrightcount);
    }
}
}