package example;
public class ArrayLotto{
    public static void main(String[] args){
        ArrayLotto sample = new ArrayLotto();
        sample.init();
    }
    public void init(){
        int[] lottoNumbers = new int[7];
        
        lottoNumbers[0] = 5;
        lottoNumbers[1] = 12;
        lottoNumbers[2] = 15;
        lottoNumbers[3] = 64;
        lottoNumbers[4] = 76;
        lottoNumbers[5] = 11;
        lottoNumbers[6] = 45;
        System.out.println(lottoNumbers[6]);
    }
}