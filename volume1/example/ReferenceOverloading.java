package volume1.example;

public class ReferenceOverloading{
    public static void main(String[] args){
        ReferenceOverloading reference = new ReferenceOverloading();
        reference.print(1); // 1��
        reference.print("2"); // 2��
        reference.print(1, "2"); // 3��
        reference.print("2", 1); // 4��
    }
    public void print(int data){
        System.out.println(data);
    }
    public void print(String data){
        System.out.println(data);
    }
    public void print(int intData, String stringData){
        System.out.println(intData + ", " + stringData);
    }
    public void print(String stringData, int intData){
        System.out.println(stringData + ", " + intData);
    }
}