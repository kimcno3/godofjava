# :pushpin: Chapter10


## ✔️직접해봅시다.
### 작성 코드
#### Animal.java
```java
package c.inheritance;

public class Animal {
    // 변수 선언
    String name;
    String kind;
    String foodType;
    int legCount;
    int iq;
    boolean hasWing;
    // Refactorting한 변수
    String color;
    int weight;
    int height;
    // 메소드 선언
    public void move(){
        System.out.println("This is Animal method - move()");
    }
    public void eatFood(){
        System.out.println("This is Animal method - eatFood()");
    }
}
```
#### Dog.java
```java
package c.inheritance;

public class Dog extends Animal {
    String breed;
    // Overriding
    public void move(){
        System.out.println("The Dog is moving");
    }
    public void eatFood(){
        System.out.println("The Dog is eating food");
    }
}

```
#### Cat.java
```java
package c.inheritance;

public class Cat extends Animal {
    String breed;
    // Overriding
    public void move(){
        System.out.println("The Cat is moving");
    }
    public void eatFood(){
        System.out.println("The Cat is eating food");
    }
}
```

<br>

## ✔️정리해봅시다.
### 1. 상속을 받는 클래스의 선언문에 사용하는 예약어는 무엇인가요?
`public 자식 클래스명 extends 부모 클래스명{}`

### 2. 상속을 받은 클래스의 생성자를 수행하면 부모의 생성자도 자동으로 수행된다.
O

### 3. 부모 클래스의 생성자를 자식 클래스에서 직접 선택하려고 할 때 사용하는 예약어는 무엇인가요?
`super()`

### 4. 메소드 Overriding과 Overloading을 정확하게 설명해 보세요.
- **Overriding** : 부모 클래스로부터 상속받은 메소드를 자식클래스에서 재정의하는 것
- **Overloading** : 하나의 클래스의 생성자를 매개변수의 타입이나 수를 다르게 여러번 선언하는 것

### 5. A가 부모, B가 자식 클래스라면 A a=new B(); 의 형태로 객체 생성이 가능한가요?
O , 가능합니다.

부모클래스의 객체를 자식 클래스의 생성자로 선언할 수 있습니다.

### 6. 명시적으로 형변환을 하기 전에 타입을 확인하려면 어떤 예약어를 사용해야 하나요?
`instanceof`

### 7. 위의 문제에서 사용한 예약어의 좌측에는 어떤 값이, 우측에는 어떤 값이 들어가나요?
좌측에는 **클래스나 변수의 이름**을, 우측에는 **형변환을 하고자 하는 자료형이나 타입**을 작성합니다.

### 8. instanceof 예약어의 수행 결과는 어떤 타입으로 제공되나요?
boolean

### 9. Polymorphism이라는 것은 뭔가요?
폴리몰피즘은 자바에서 **다형성**을 의미합니다. 같은 이름의 메소드여도 상속과 오버라이딩을 통해 다른 결과값을 나타낼 수 있는 것들을 의미합니다.

더 자세히 말하면 **같은 클래스를 타입으로 선언한 객체라도 호출되는 변수나 메소드는 생성자 클래스에서 가져오는 것**을 뜻합니다.

#### 추가 해설
자식 클래스는 자신만의 "행위"를 가질 수 있지만, 부모 클래스에 선언된 메소드들도 공유 가능하다는 것을 의미한다.

다시 말해, 부모 클래스의 타입으로 변수를 선언하고, 자식 클래스의 생성자를 사용할 경우 overriding된 메소드를 호출하면 자식 클래스에 선언된 메소드가 호출되고, 부모 클래스의 메소드도 공유 가능하다는 것을 의미한다.
