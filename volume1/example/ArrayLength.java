package volume1.example;

public class ArrayLength{
    public static void main(String[] args){
        ArrayLength array = new ArrayLength();
        // array.printArrayLength();
        array.printArray();
    }
    public void printArrayLength(){
        int[] oneDim = new int[2];
        int[][] twoDim = new int[2][3];
        System.out.println(oneDim.length);
        System.out.println(twoDim[1].length);
    }
    public void printArray(){
        int [][] twoDim = {{1,2,3}, {4,5,6}};
        
        for(int i=0; i<twoDim.length; i++){ // length Ȱ��1
            for(int j=0; j<twoDim[i].length; j++){ // length Ȱ��2
                System.out.println(twoDim[i][j]);
            }
        }
    }
}