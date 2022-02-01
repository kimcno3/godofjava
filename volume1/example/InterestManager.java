package volume1.example;

public class InterestManager{
    public static void main(String[] args){
        InterestManager sample = new InterestManager();
        
        for (int day=1; day<=365; day++){
            double sampleRate = sample.getInterestRate(day);
            double sampleTotalAmount = sample.calculateAmount(day , 1000000);
            if(day%10 == 0){
                System.out.println(day + "�� ��, ����: " + (sampleRate*100) + "% , ��ġ��+����: " + sampleTotalAmount + "��");
            }
        }
    }
    public double getInterestRate(int day){
        double rate;
        if(day>=1 && day<=90){
            rate = (0.005);
        } else if(day <= 180){
            rate = (0.01);
        } else if(day <= 364){
            rate = (0.02);
        } else {
            rate = (0.056);
        }
        return rate;
    }
    public double calculateAmount(int day, long amount){
        double rate = getInterestRate(day);
        double totalAmount = amount + (amount*rate);
        return totalAmount;
    }
}