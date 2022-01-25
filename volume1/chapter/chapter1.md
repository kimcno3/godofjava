# :pushpin: Chapter1
> 프로그래밍이란 무엇인가?

## ✔ 직접해 봅시다.
### **작성 코드**
```java
public class Calculator {
    // add(), addAll() 생략

    public int subtract(int num1, int num2) {
        int sub;
        sub = num1 - num2;
        return sub;
    }

    public int multiply(int num1, int num2) {
        int mul;
        mul = num1 * num2;
        return mul;
    }

    public int divide(int num1, int num2) {
        int div;
        div = num1 / num2;
        return div;
    }
}
```

<br>

## ✔ 정리해 봅시다.
### **1. 클래스가 뭔가요?**
자바에서 가장 작은 단위로 상태와 행동을 가집니다. 여기서 상태는 변수, 행동은 메소드를 통해 구현할 수 있습니다. 현실의 사물이나 추상적인 개념을 클래스로 표현할 수 있습니다. 이러한 방식의 프로그래밍을 객체 지향 프로그래밍이라고 합니다.

#### 클래스 선언 방법
```java
public class ClassName {
    // 메소드 or 변수 선언;
}
```
- public : 접근 제어자(Access Modifier)
- class : 클래스 선언시 반드시 붙혀야 한다.
- ClassName : 클래스명

### **2. 메소드가 뭔가요?**
- 클래스에서 "행동"의 역할을 의미하며 일련의 과정을 통해 새로운 값을 생산, 계산 및 반환합니다.

#### 메소드 선언 방법
```java
public class ClassName {
    public void methodName(parameterName) {
        // 생략;

        return OOO; // 리턴값 설정
    }
}
```
- public : 접근 제어자(Access Modifier)
- void : 리턴타입, 리턴할 값의 자료형을 표현합니다. (`void`는 리턴값이 없을 경우)
- methodName : 메소드 이름
- parameterName : 매개변수 이름, 매개변수는 몇개가 들어가도 상관없습니다.

### **3. 메소드의 매개변수는 어디에 적어두나요?**
매개변수는 메소드명 뒤에 오는 소괄호 안에 적습니다.

### **4. 메소드 이름 앞에 꼭 적어 줘야 하는 건 뭐죠?**
접근 제어자와 리턴타입입니다.

### **5. 클래스가 갖고 있어야 한다고 한 두 가지는 뭐죠?**
상태와 행동, 구체적으로 변수와 메소드입니다.

### **6. 메소드에서 결과를 돌려주면 어떤 예약어를 사용해야 하나요?**
`return`을 사용합니다.
