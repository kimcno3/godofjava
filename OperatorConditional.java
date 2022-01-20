package example;
public class OperatorConditional{
    public static void main(String args[]){
        OperatorConditional sample = new OperatorConditional();
        // sample.conditional();
        sample.conditionalTriple(80);
        sample.conditionalTriple(30);
    }
    public void conditional(){
        boolean x = true;
        boolean y = true;
        
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println("=======");
        
        x = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println("=======");
        
        y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println("=======");
    }
    public void conditionalTriple(int point){
        boolean flag = false;
        flag = (point >= 80) ? true : false;
        System.out.println(point + " : " + flag);
    }
}