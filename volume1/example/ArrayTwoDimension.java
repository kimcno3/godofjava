package volume1.example;

public class ArrayTwoDimension{
    public static void main(String[] args){
        ArrayTwoDimension array = new ArrayTwoDimension();
        array.twoDimensionArray();
    }
    public void twoDimensionArray(){
        int [][] twoDim;

        // twoDim = new int[2][3]; -> 2�� 3��

        twoDim = new int[2][];
        twoDim[0] = new int[3];
        twoDim[1] = new int[2];

        // int [][] twoDim2 = {{1,2,3}, {4,5,6}};
    }
}