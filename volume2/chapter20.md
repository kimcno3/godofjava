# :pushpin: Chapter20

## ✔️ 직접해봅시다.
### 작성 코드
```java
package d.lang.practice;

public class NumberObjects {
    public static void main(String[] args){
        NumberObjects sample = new NumberObjects();
        
        // 1번 메소드 호출 : String -> long으로 변환
        sample.parseLong("512423523");
        sample.parseLong("r1023");

        System.out.println();
    
        // 2번 메소드 호출 : long 타입 정수를 2,16,8진수로 변환
        sample.printOtherBase((long) 1024);
    }
    // 1번 문제
    public long parseLong(String data) {
        long longNumber = 0; // long 타입 변수 선언 및 초기화
        try{
            longNumber = Long.parseLong(data); // 매개변수를 long 타입으로 변환, Long 클래스 활용
        } catch(NumberFormatException e){
            System.out.println(data + " is not a number"); // 매개변수가 정수형이 아닐 경우, 에러 메시지 출력
            return -1; // -1 리턴
        } catch(Exception e){ // 안정성 보장을 위한 Exception 클래스 catch문 추가
            e.printStackTrace();
        }
        System.out.println(longNumber); // 형변환된 long 타입 변수 출력
        return longNumber; // 해당 정수값 리턴
    }
    // 2번 문제
    public void printOtherBase(long value){
        System.out.println("Original : " + value); // 10진수
        System.out.println("Binary : " + Long.toBinaryString(value)); // 2진수
        System.out.println("Hex : " + Long.toHexString(value)); // 16진수
        System.out.println("Octal : " + Long.toOctalString(value)); // 8진수
    }
}
```

### 출력 결과
```
512423523
r1023 is not a number

Original : 1024
Binary : 10000000000
Hex : 400
Octal : 2000
```

<br>

## ✔️ 정리해봅시다.
### 1. 같은 패키지에 있는 클래스를 제외하고, 별도로 import 하지 않아도 되는 패키지는 무엇인가요?
`java.lang`

### 2. 자바의 메모리가 부족해서 발생하는 에러는 무엇인가요?
`OutOfMemoryError`

### 3. 메소드 호출관계가 너무 많아서 발생하는 에러는 무엇인가요?
`StackOverflowError`

### 4. java.lang 패키지에 선언되어 있는 3개의 어노테이션에는 어떤 것들이 있고, 각각의 역할은?
- `@Override` : 해당 메소드는 오버라이딩된 메소드라는 것을 표시
- `@Deprecated` : 해당 메소드나 클래스는 더 이상 사용하지 않는 것이란 것을 표시하고 경고 메세지 출력
- `@SuppressWarnings` : 해당 클래스나 메소드에서 생성되는 특정 경고 메세지를 무시

### 5. Double과 Integer 같은 숫자 타입에서 처리할 수 있는 최대, 최소값을 알 수 있는 상수의 이름은?
`클래스명.MAX_VALUE` , `클래스명.MIN_VALUE`

### 6. Integer값을 2진법으로 표현하려면 어떤 메소드를 사용해야 하나요?
`Integer.toBinaryString()`
### 7. Integer값을 16진법으로 표현하려면 어떤 메소드를 사용해야 하나요?
`Integer.toHexString()`

### 8. 속성(Properties)과 환경(Environment) 값의 차이는 무엇인가요?
속성값은 읽기와 수정이 가능하고 환경값은 읽기만 가능하다.

### 9. System.out과 System.err 에서 사용할 수 있는 메소드들은 어떤 클래스의 API를 봐야 하나요?
PrintStream 클래스

### 10. System 클래스에서 현재 시간을 조회하는 용도로 사용하는 메소드 이름은 무엇인가요?
`System.currentTimeMillis()`

### 11. System 클래스에서 시간 측정 용도로 사용하는 메소드 이름은 무엇인가요?
`System.nanoTime()`

### 12. System.out.print() 메소드와 System.out.println() 메소드의 차이는 무엇인가요?
줄바꿈 여부

### 13. System.out.println() 메소드에 객체가 매개변수로 넘어 왔을 때 String의 어떤 메소드가 호출되어 결과를 출력하나요? 그리고, 그 메소드를 사용하는 이유는 무엇인가요?
`String.valueOf()` 메소드가 실행됩니다. 

null값이 할당된 객체인 경우, `toString()` 메소드를 실행하게 되면 예외가 발생하기 때문에 예외가 발생하지 않고 할당된 값 자체를 리턴하는 `vallueOf()` 메소드가 더 안정성을 보장받을 수 있기 때문입니다.
