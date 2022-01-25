public class ArrayInitialize{
    static String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static void main(String[] args){
        ArrayInitialize array = new ArrayInitialize();
        array.otherInit();
        // System.out.println(array.getMonth(3));
    }
    public void otherInit(){
        int [] lottoNumbers = {5,12,23,26,45,3,2};
//        System.out.println(lottoNumbers[0]);
        
        int [][] arrays;
        arrays = new int[5][0];
        
        arrays[0] = new int[] {1,2,3,4,5};
        arrays[1] = new int[] {2,3,4,5,6};
        System.out.println(arrays[1][0]);
    }
    public String getMonth(int monthInt){
        // String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        return months[monthInt+1];
    }
}