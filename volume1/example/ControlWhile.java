package volume1.example;

public class ControlWhile {
    public static void main(String[] args){
        ControlWhile control = new ControlWhile();
        // control.whileLoop1();
        control.doWhile();
    }
    public void whileLoop1(){
        ControlOfFlow control = new ControlOfFlow();

        int loop = 0;
        while(loop < 12){
          loop++;
          if (loop == 6) continue;
          control.switchCalendar(loop);
          // if (loop == 6) break;
        }
    }
    public void doWhile(){
        ControlOfFlow control = new ControlOfFlow();

        int loop=0;
        do {
            loop++;
            control.switchCalendar(loop);
        } while(loop >= 1 && loop < 12);
    }
}