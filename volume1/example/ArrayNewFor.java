package example;
public class ArrayNewFor{
    public static void main(String[] args){
        ArrayNewFor array = new ArrayNewFor();
        array.newFor();
    }
    public void newFor(){
        int[][] twoDim = {{1,2,3}, {4,5,6}};
        
        int rowIndex = 0;
        for(int[] rowArray : twoDim){
          int colIndex = 0;
          for(int colNumber : rowArray){
                System.out.println(colNumber);
                // System.out.println(rowIndex + "," + colIndex);
                colIndex++;
          }
          rowIndex++;
        }
    }
}