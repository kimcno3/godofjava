# :pushpin: Chapter2
> Hello God Of Java

## ✔ 직접해 봅시다.
### **작성 코드**
```java
public class Profile{
  public static void main(String[] args){
      System.out.println("My name is Kim");
      System.out.print("My age is 27");
  }
}
```
### 실행 결과
```
My name is OOO
My age is OO
```

<br>

## ✔ 정리해 봅시다.
### **1. main() 메소드의 메소드 이름 앞에는 어떤 예약어들이 들어 가나요? (순서대로 쓰세요)**
- `public static void` main(String[] args){}
    - `public` : 어떤 클래스에서도 접근 가능
    - `static` : 객체를 생성하지 않아도 접근 가능한 메소드
    - `void` : 리턴값이 없음

### **2. main() 메소드의 매개변수에는 어떤 값이 들어가나요?**
- public static void main(`String[] args`){}
- String 문자열의 배열이 들어갑니다.

### **3. 만약 여러분들이 만든 클래스에 main() 메소드가 없다면, java 명령어로 그 클래스를 수행할 수 있나요?**
public static void main(String[] args)로 선언되어 있는 메소드가 클래스에 없으면, 해당 클래스를 실행할 수는 없다.

### **4. System.out.println() 메소드는 어떤 용도로 사용하나요?**
System.out.println() 메소드는 자바를 실행한 창에서 문자열을 출력하는데 사용됩니다.

### **5. System.out.print() 메소드는 System.out.println() 메소드와 어떤 차이가 있나요?**
- System.out.print() -> 줄바꿈 X
- System.out.println() -> 줄바꿈 O

### **6. `//` 는 무엇을 하는데 사용하는 기호인가요?**
`//`는 한 줄 주석을 의미한다. 따라서, 해당 코드의 `//` 뒤에 있는 모든 내용은 무시된다.

### **7. `/*` 로 시작하고, `*/`로 끝나는 사이에 있는 소스들을 어떻게 되나요?**
`/*`으로 시작하여 `*/`으로 끝나는 주석은 블록 주석으로, 해당 블록 내의 모든 내용은 컴파일시 무시된다.

### **8. 메소드를 선언할 때 반드시 꼭 있어야 하는 세가지는 무엇인가요?**
메소드에는 반드시 "리턴 타입", "메소드 이름", "메소드 내용"이 있어야만 한다.