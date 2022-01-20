package example;
public class ControlElseIf{
    public static void main(String args[]){
        ControlElseIf control = new ControlElseIf();
        control.elseIf(91);
        System.out.println("--");
        control.elseIf2(85);
    }
    public void elseIf(int point){
        if(point > 90){
            System.out.println("A");
        } else if(point > 80){
            System.out.println("B");
        } else if(point > 70){
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
    public void elseIf2(int point){
        String result = point>90 ? "A" : point>80 ? "B" : point>70 ? "C" : "D";
        System.out.println(result);
    }
}