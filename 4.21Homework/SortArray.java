public class SortArray {
    public static void main(String[] args){
        int[]arr=new int[]{1,35,34,3,28,26,7,19};
        sort(arr,true);
        System.out.println( );
        sort(arr,false);
    }
     

        
        
       
        
    

        static void sort(int arr[],boolean isAsc){
        
        if (isAsc==true) {
            for (int i=0;i<arr.length-1;i++) {
              for (int j=0;j<arr.length-i-1;j++) {
                  if(arr[j]>arr[j+1])
                  {
                      int temp=arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
                  }
              }
            }
           for (int i : arr) {
            System.out.print(i + " ");
           }
        


    }else {
        for(int i = 0; i< arr.length - 1; i++) {
        for(int j = 0;j< arr.length - i -1;j++) {
            if(arr[j] < arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

            }
        }
    }
    for (int i : arr) {
        System.out.print(i + " ");
    }   


    }

        }
    }
