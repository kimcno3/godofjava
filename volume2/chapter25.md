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

### ✔️ 직접해봅시다.
#### 쓰레드와 프로세스의 차이를 이야기 해 보세요. *
하나의 프로세스에서 기능을 효울적으로 수행하기 위해 독립적인 메모리로 나눠 처리하는데 이 각각의 메모리를 쓰레드라고 말합니다.

#### 쓰레드 클래스를 만들기 위해서는 어떤 인터페이스를 구현하면 될까요? *
Runnable

#### 위의 문제에서 이야기한 인터페이스에 선언되어 있는 유일한 메소드는 무엇인가요? *
run()

#### 쓰레드 클래스를 만들기 위해서 어떤 클래스를 확장하면 되나요? *
Thread

#### 쓰레드가 시작되는 메소드의 이름은 무엇인가요? *
run()

#### 쓰레드를 시작하는 메소드의 이름은 무엇인가요? *
start()

#### 쓰레드에 선언되어 있는 sleep() 메소드의 역할은 무엇인가요? *
매개변수로 넘어온 시간만큼 쓰레드를 대기시킨다.

#### sleep() 메소드를 사용할 때 try-catch 로 감싸 주어야 하는 이유는 무엇인가요? *
sleep() 메소드는InterruptedException 예외를 던질 수 있다고 선언 되어 있기 때문이다.

#### 데몬(Daemon) 쓰레드와 일반 쓰레드의 차이는 무엇인가요? *
데몬 쓰레드는 해당 쓰레드가 종료된 여부와 상관없이 JVM이 종료될 수 있다.

#### synchronized 구문은 왜 써 주며, 어디에 사용해야 하나요? *
하나의 인스턴스를 두개 이상의 쓰레드가 접근할 경우, 접근한 순서에 따라 권한을 지정하여 수행결과에 대한 오류를 막기 위해서

#### synchronized 를 사용하는 두 가지 방법은 어떤 것 인가요? *
synchronized(lock), synchronized(lock){}

#### 쓰레드의 상태에는 어떤 것들이 있나요? *
NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED

#### 쓰레드에 선언되어 있는 join() 메소드의 용도는 무엇인가요? *
해당 쓰레드가 종료될 때까지 현재 쓰레드의 작업을 대기한다.

#### 쓰레드에 선언되어 있는 interrupt() 메소드의 용도는 무엇인가요? *
특정 쓰레드의 종료 요청을 한다.

#### interrupt() 메소드를 호출하면 해당 쓰레드는 어떤 상태에 있을 때 interrupt() 메소드가 호출된 효과가 발생 되나요? *
sleep(), join(), wait()

#### Object 클래스에 선언된 wait() 메소드의 용도는 무엇인가요? *
notify() 메소드가 호출될 때까지 해당 쓰레드를 대기시킨다.

#### Object 클래스에 선언된 notify() 메소드의 용도는 무엇인가요? *
wait() 메소드가 호출되어 대기중인 쓰레드를 다시 작동시킨다.

#### ThreadGroup 클래스에 선언된 enumerate() 메소드의 용도는 무엇인가요? *
매개변수로 넘어온 배열을 ThreadGroup 타입으로 넘긴다.