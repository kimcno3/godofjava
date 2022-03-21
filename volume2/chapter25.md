## :pushpin: 25장

### ✔️ 직접해봅시다.
**Thread 구현 클래스**
```java
package e.thread.practice;

import java.util.Date;

public class TimerThread extends Thread{
    public void run(){
        printCurrentTime();
    }
    public void printCurrentTime(){
        try {
            for(int i=0; i<10; i++){
                Date currentTime = new Date();
                System.out.println(currentTime.toString() + " " + System.currentTimeMillis());
                Thread.sleep(1000);
            }
        } catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
```

**Thread 실행 클래스**
```java
package e.thread.practice;

public class TimeMain {
    public static void main(String[] args) {
        TimerThread thread = new TimerThread();
        try{
            System.out.println("thread is started");
            thread.start();
            thread.join();
            System.out.println("thread is ended");
        } catch(Exception ie){
            ie.printStackTrace();
        }
    }
}
```