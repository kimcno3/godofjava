package example;
public class SalaryManager{
    public static void main(String Args[]){
        SalaryManager person = new SalaryManager();
        System.out.println("�� �� �� �� : " + person.getMonthlySalary(20000000) + "��");
    }
    public double getMonthlySalary(int yearlySalary){
        double monthSalary = yearlySalary / 12.0;
        System.out.println("�� �� �� �� : " + monthSalary + "��");

        double MonthTax = calculateTax(monthSalary);
        System.out.println("�ٷ� �ҵ漼 : " + MonthTax + "��");

        double MonthNationalPersion = calculateNationalPersion(monthSalary);
        System.out.println("����   ���� : " + MonthNationalPersion + "��");

        double MonthHealthInsurance = calculateHealthInsurance(monthSalary);
        System.out.println("�߰� ����� : " + MonthHealthInsurance + "��");

        monthSalary -= (MonthTax + MonthNationalPersion + MonthHealthInsurance);
        return monthSalary;
    }
    public double calculateTax(double monthSalary){
        double tax = monthSalary * 0.125;
        return tax;
    }
    public double calculateNationalPersion(double monthSalary){
        double nationalPersion = monthSalary * 0.081;
        return nationalPersion;
    }
    public double calculateHealthInsurance(double monthSalary){
        double healthInsurance = monthSalary * 0.135;
        return healthInsurance;
    }
}
