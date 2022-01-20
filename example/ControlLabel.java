package example;
public class ControlLabel{
    public static void main(String[] args){
        ControlLabel control = new ControlLabel();
        control.printTimesTable();
    }
    public void printTimesTable(){
        // startLabel:
        for (int i=2; i<=9; i++){
            for(int j=1; j<=9; j++){
                // if(j == 4) continue startLabel;
                System.out.print(i + "x" + j + "=" + (i*j) + " ");
            }
            System.out.println();
        }
    }
}