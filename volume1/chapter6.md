# :pushpin: Chapter6
## ✔️ 직접해봅시다.
### 작성코드
```java
public class InterestManager{
    public static void main(String[] args){
        InterestManager sample = new InterestManager();
        // 1 ~ 365일 for구문
        for (int day=1; day<=365; day++){
            // 해당 일자의 이자율 계산
            double sampleRate = sample.getInterestRate(day);
            // 100만원 기준 일자별 예치금액 계산
            double sampleTotalAmount = sample.calculateAmount(day , 1000000);
            // 10일 단위로 이자율, 예치금액 출력
            if(day%10 == 0){
                System.out.println(day + "일 차, 이자율: " + (sampleRate*100) + "% , 예치금+이자: " + sampleTotalAmount + "원");
            }
        }
    }
    // 이자율 계산 메소드
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
    // 총액 계산 메소드
    public double calculateAmount(int day, long amount){
        double rate = getInterestRate(day);
        double totalAmount = amount + (amount*rate);
        return totalAmount;
    }
}
```
### 실행 결과
```java
10일 차, 이율: 0.5% , 예치금+이자: 1005000.0원

// 생략

90일 차, 이율: 0.5% , 예치금+이자: 1005000.0원
100일 차, 이율: 1.0% , 예치금+이자: 1010000.0원

// 생략

180일 차, 이율: 1.0% , 예치금+이자: 1010000.0원
190일 차, 이율: 2.0% , 예치금+이자: 1020000.0원

// 생략

360일 차, 이율: 2.0% , 예치금+이자: 1020000.0원
```

<br>

## ✔️ 정리해봅시다.
### 1. if 문장의 소괄호 안에는 어떤 타입의 결과가 제공되어야 하나요?
boolean

### 2. if 조건에 맞지 않는 모든 경우를 처리할 때 사용하는 예약어는 뭔가요?
else

### 3. switch를 사용할 수 있는 기본 자료형의 타입에는 어떤 것들이 있나요?
- long을 제외한 정수형(byte, short, int, long, char)
- 추가로 Enum, Character, Byte, Short, Integer도 가능
- Java 7 부터 String도 가능

### 4. switch블록 안에서 비교 대상값 앞에 사용하는 예약어는 무엇인가요?
case

### 5 switch 조건을 빠져나가도록 하는 예약어는 무엇인가요?
break

### 6. switch 조건들에 맞지 않을 때 기본 처리를 하기 위한 예약어는 무엇인가요?
default

### 7. while 문의 소괄호 안에는 어떤 형태의 결과가 제공되어야 하나요?
boolean

### 8. while 문을 무조건 한번은 실행하게 하려면 어떻게 해야 하나요?
```java
do{

    // 무조건 한번 실행

}while(조건식){

    // 조건식이 true일 때까지 실행

}
```
### 9. while문을 마음대로 빠져나가게 하려면 어떤 예약어를 사용하면 되나요?
break

### 10. while문의 중간에 while문의 소괄호 점검 구문으로 건너뛰도록 할 때 사용하는 예약어는 무엇인가요?
continue

### 11. for루프의 소괄호안의 가장 첫 구문(첫 세미 콜론 앞의 문장)은 for루프가 수행되는 동안 몇 번 수행되나요?
1번

### 12. for루프의 소괄호 안의 중간에 있는 구문은 어떤 타입의 결과가 제공되어야 하나요?
boolean(treu면 반복문 실행)

### 13. for루프의 소괄호 안의 마지막에 있는 구문에서는 어떤 작업을 수행하나요?
첫 구문에서 선언한 변수의 값을 증가 혹은 감소
