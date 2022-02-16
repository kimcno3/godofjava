# :pushpin: 추가 내용 모음
> 자바의 신 공부동안 추가이해를 위해 찾아본 내용 정리

## ✔️ 사용자변수와 시스템변수의 차이
- 사용자 변수
    - 로그인된 계정 내에서 사용하는 변수
    - 사용자 계정별로 설정되어 있는 PATH가 다릅니다.

- 시스템 변수
    - 컴퓨터 내에서 사용하는 변수
    - 한번 PATH를 설정해 두면 어떤 계정이든 사용 가능합니다.
> [참고 사이트](https://wikim.tistory.com/232)

<br>

## ✔️  JVM, JRE, JDK 란?
- JVM(Java Virtual Machine)
    - 컴파일 이후, 바이트코드로 구성된 자바 파일(`.class` 확장자)을 기계어로 해석하여 운영체제에서 실행시키는 역할을 합니다.

- JRE(Java Runtime Environment)
    - **JVM**을 포함하여 자바 프로그램을 실행시키기 위해 필요한 라이브러리 및 기타 파일이 포함된 **패키지**
    - **자바 실행 환경**이라고 이해할 수 있습니다.
    - **java.exe** 파일이 포함되어 있습니다.(JVM을 구동시키기 위한 명령 프로그램)

- JDK(Java Development Kit)
    - 자바 프로그래밍을 위해 필요한 도구
    - 대표적으로 컴파일러(javac.exe)가 JDK에 포함됩니다.
> [참고 사이트1](https://goodgid.github.io/Java-JDK-JRE/)

> [참고 사이트2](https://velog.io/@ggob_2/java-study-1#7-jvm%EC%9D%98-%EA%B5%AC%EC%84%B1-%EC%9A%94%EC%86%8C)

<br>

## ✔️  java파일 실행시 파일명만 필요한 이유
JVM을 구동하기 위해 `java filename` 명령어를 실행하는데, 이는 "JVM이 filename에 해당하는 파일을 실행한다"가 아니라 "filename을 가진 바이트코드에 main메소드가 존재한다" 라는 사실을 전달하는 의미입니다.

그래서 확장자명을 포함하여 java.exe 파일을 실행시키면 확장자명까지 파일명으로 인식하여 main 메소드가 없다 또는 해당 파일명을 찾을 수 없습니다 라는 에러가 발생합니다.
> [참고 사이트](https://8iggy.tistory.com/m/233)

<br>

## ✔️  멤버변수
**멤버변수(Instance Variable)** 는 객체를 생성해야만 사용할 수 있는 변수를 의미하며 **객체 생성시, 해당 객체의 메소드에서 사용가능**합니다.

> [참고 사이트](https://digiconfactory.tistory.com/entry/%EC%9E%90%EB%B0%94-%ED%8A%9C%ED%86%A0%EB%A6%AC%EC%96%BC-5-9-%EB%B3%80%EC%88%98-%EC%9C%A0%ED%9A%A8%EB%B2%94%EC%9C%84-Scope)

<br>

## ✔️  main 함수 실행 순서
자바의 신 Github 저장소에서 찾은 **직접해봅시다** 의 [모범 코드](https://github.com/godofjava/GodOfJava2nd/blob/master/Chapter03/src/Profile.java)와 내가 작성한 코드를 비교해봤을 때, main() 메소드의 위치가 다른 것을 볼 수 있었다.

모범 코드에서는 `main()` 메소드가 가장 먼저 작성되어 있고, 그 이후로 클래스의 필드와 메소드가 선언되어 있었다.

이 부분에서 단순한 생각으로 클래스의 필드와 메소드가 먼저 선언된 다음, main() 메소드가 실행되어야 하는 것이 맞지 않은가 하는 의문이 생겼다.

자바스크립트에서 호이스팅 개념이 있듯이 자바에서도 비슷한 개념이 있나 궁금증이 생겨 찾아본 결과, 간단한 해답을 찾았다.

바로 자바로 구성된 프로그램, 파일을 실행시에는 **main() 메소드가 가장 먼저 실행된다**는 것이다.

즉, `main()` 메소드가 가장 먼저 실행되면서 객체를 생성하고 그 이후로 생성된 객체의 메소드를 호출하는 순서로 코드가 진행되는 것이다.

그렇기 때문에 main 메소드가 클래스 내에서 가장 먼저 작성되어도 문제될 점은 없다.
> [참고사이트](https://codingffler.tistory.com/16)

<br>

## ✔️  가비지 콜렉터(Garbage Collector)
- **가비지(Garbage)** 란 객체나 배열을 가르키는 레퍼런스가 없는 경우를 의미합니다.
- 메모리 확보 위해 가비지를 삭제하는 작업 자체는 **가비지 콜렉션**
- 가비지 콜렉션을 하는 것이 **가비지 콜렉터**라고 합니다.
> [참고 사이트](https://madplay.github.io/post/java-garbage-collection)

<br>

## ✔️  `shortMax+1 === 32768` ?
**4장 89페이지**에서 **shortMax**에서 1을 더하면 최소값이 나와야 하는데 최대값을 넘어선 값이 나와 당황했다. 그 이유를 찾아보니 short 타입의 값에 단순히 1을 더하면 **int 타입으로 타입이 자동 변환된다**고 한다.

**구체적으로 설명하면**

1. 정수 연산시에 int가 기본 타입이다.
2. 게다가 다른 타입을 연산할 때 큰 타입으로 자동 변환된다고 한다.
3. 또한 피연산자는 4byte 단위로 계산되어 4byte보다 작은 byte, short, char은 int로 자동 변환된다.

그렇기 때문에 계산 오류를 막기 위해서는 (byte), (short) 코드를 연산식 앞에 추가해줘야 자동 타입 변환을 방지하여 예제에서 원하는 값을 구할 수 있습니다.

해당 내용은 **4장 87페이지** 에서도 언급되는 부분입니다.
> [참고 사이트1](https://kephilab.tistory.com/27)

> [참고 사이트2](https://stackoverflow.com/questions/42682558/largest-java-short-32767-plus-1-not-turning-negative)

<br>

## ✔️  오버플로우(Intager Overflow)
- 데이터 유형별 범위를 초과한 값을 할당한 경우 발생
- `최대값+1`을 하면 `최소값`이 되는 경우를 의미합니다.
- `최소값-1`을 하면 `최대값`이 되는 경우는 언더플로우라고 합니다.

121 ~ 122페이지에 나오는 예제에서 short의 값으로 할당한 `256`과 `255`를 byte로 캐스팅 하는 경우, 0과 -1값이 나오는데 이런 경우를 오버플로우라고 하고, 두 경우를 자세히 살펴보면 다음과 같습니다.

- (short)256 -> (byte)256
```
0000 0001 0000 0000 -> short일때 256이지만

          0000 0000 -> byte로 형변환을 하면 0이 된다.
```

- (short)255 -> (byte)255
```
0000 0000 1111 1111 -> short일때 255의 모습

          1111 1111 -> byte로 형변환을 했을 때
```
근데 위처럼 `1111 1111`이 `-1`이 되는 이유를 이해하지 못했다.

개인적으로 생각해낸 해답은 최소값인 `-128`을 이진수로 표현하면 `1000 0000`이니까 이 점을 이용해서 `1111 1111`을 다시 표현해보면
```
1111 1111 -> 256
= 1000 0000 + 0111 1111
= -128 + 127
= -1
```
그래서 `(byte)255`가 `-1`이 나오는 것이 아닐까 싶었다.

<br>

하지만 위와같은 계산법이 아니라 처음부터 컴퓨터는 **2진법에서 음수**를 **2의 보수**로 표현하기 때문이였다.

**2의 보수**란 **양수를 표현하는 2진수에서 0과 1을 뒤집은 다음, +1을 해주는 방법**을 뜻하는데

이를 예시로 자세히 살펴보면
```
(byte)1은 2진수로
0000 0001 로 표현한다.

그렇다면 (byte)-1을 2의 보수를 활용한 2진수로 표현할 때

1. 0과 1의 위치를 뒤집는다.
1111 1110

2. +1을 해준다.
1111 1111

즉 8비트에서 1111 1111 은 -1이다.
```

**그렇기 때문에 255(2진수로 1111 1111)를 byte로 표현했을 때 -1값이 나오는 것이다.**

좀 더 자세한 설명은 아레 참고 사이트에 잘 설명되어 있다.
> [참고사이트](https://wikidocs.net/81918)

<br>

## ✔️  toSting()
- `toSting()` 메소드는 객체가 가지고 있는 정보를 문자열로 리턴하는 메소드
- Java의 모든 클래스 중 가장 최상위 클래스인 'Object' 클래스의 메소드로서 사용자가 생성하는 클래스가 기본적으로 상속받게 되는 메소드
- 객체가 가지고 있는 `toSting()` 메소드의 기본값은 '타입이름@고유번호'의 형태
- 이를 재정의(오버라이딩)을 통해 바꿀 수 있다.

> [참고사이트](https://selfdevelope.tistory.com/560)

<br>

## ✔️  DTO 추가 설명
DAO(Data Access Object)
- DTO로 받은 데이터를 데이터베이스에 저장하거나 가져오는 역할을 수행하는 객체

DTO(Data Transfer Object)
- 계층 간 데이터 교환을 하기 위해 사용하는 객체
- 로직을 가지지 않는 순수한 데이터 객체(getter & setter)

VO(Value Object)
- 값을 위해서만 사용되는 값 오브젝트
- ReadOnly 특징을 가지고 있다.

<br>

## ✔️  static 변수 추가 설명
**예제 코드**
```java
public class ReferenceStaticVariable{
    static String name; // 클래스변수 name
    public ReferenceStaticVariable(){}
    public ReferenceStaticVariable(String name){
        this.name = name; // 매개변수를 클래스변수에 할당해라! 라는 의미
    }
    public static void main(String[] args){
        ReferenceStaticVariable sample = new ReferenceStaticVariable();
        sample.checkName();
    }
    public void checkName(){
        ReferenceStaticVariable reference1 = new ReferenceStaticVariable("Kim");
        System.out.println(reference1.name); // Kim
        ReferenceStaticVariable reference2 = new ReferenceStaticVariable("Lee");
        System.out.println(reference1.name); // Lee
    }
}
```
위 예제를 보면 같은 `reference1`객체의 `name`값을 출력했는데 출력값은 다른 것을 확인할 수 있다.(객체의 변수를 출력한 것처럼 보인다.)

이는 매개변수값을 할당하는 변수 `name`이 클래스변수, 즉 **static**변수이기 때문에 위와 같은 결과값을 가지게 된건데, 자세히 설명하면 클래스 변수는 객체에 상관없이 하나의 메모리 주소만을 가지게 된다. 그렇기에 위 예제는 `reference1`만의 **인스턴스 변수**인 `name`에 매개변수값을 할당한 것이 아니라, 클래스 전체에 하나만 존재하는 **클래스변수**인 `name`에 매개변수 값을 할당한 것이다.(객체와는 무관하게 name이라는 변수는 해당 클래스에서 하나라는 뜻!)

그러므로 `name`은 `Kim`으로 한번, `Lee`로 한번씩 값을 할당받은 것이다.

> [참고 사이트](https://wikidocs.net/228)

<br>

## ✔️  super() 상세 내용
p.245 ~ 247에 `super()`에 대한 설명이 나오는데 몇몇 문장들이 이해가 안가서 추가 설명을 찾아봤다.

`super()`가 정확히 어떤 의미를 가지는지 간단하게 설명하자면 **부모 클래스**를 가르킨다고 말할 수 있다. 반대의 개념으로는 `this`가 될 것이다.

**예제 코드**
```java
public class PrintInfo{
    public static void main(String[] args){
        Child child = new Child(); // 자식 클래스 생성

        child.printParentAge(); // 부모클래스의 변수를 출력
        child.printChildAge(); // 자식클래스의 변수를 출력
    }
}
// 부모 클래스
class Parent{
    public Parent(){}
    String name = "Kim";
    int age = 56;
}
// 자식 클래스
class Child extends Parent{
    public Child(){}
    String name = "Lee";
    int age = 27;
    // 자식클래스에서 부모클래스 변수 지정(super)
    public void printParentAge(){
        System.out.println(super.name + "의 나이는" + super.age + "입니다.");
    }
    // 자식클래스에서 자식클래스 변수 지정(this)
    public void printChildAge(){
        System.out.println(this.name + "의 나이는" + this.age + "입니다.");
    }
}
```
**실행결과**
```
Kim의 나이는56입니다.
Lee의 나이는27입니다.
```

위 예시에서 보면 자식 클래스에서 `super.변수명`의 형식으로 코드를 작성하면 **부모클래스의 인스턴스변수를 지정**할 수 있다.

반대로 `this.변수명`은 **해당 클래스의 인스턴스 변수를 지정**하게 된다.

`자식 클래스를 컴파일할 때, 자동으로 super()이란 코드가 추가되어 컴파일한다??`

super에 대한 개념을 간단하게 이해했어도 위 문장은 이해되지 않았는데 천천히 읽어보니 말 그대로 자식클래스를 컴파일할 때 코드 작성자가 적지 않아도 `super()`라는 코드가 추가된다는 말이였다. 이 말을 코드로 표현해보면 아래 예시와 같다.

**예제 코드**
```java
// 위 코드 생략

class Child extends Parent{
    public Child(){
        // super();  -> 이 코드가 자동으로 추가된다.
    }

    // 아래 코드 생략
}
```

그렇다면 부모 클래스의 생성자가 매개변수를 가지고 있다면 당연히 문제가 생기는 구조였다.

자식 클래스에서 자동으로 생성되면서 부모클래스의 생성자를 가르키는 `super()` 코드는 매개변수값이 지정되어있지 않기 때문에 부모 클래스에서 매개변수를 가진 생성자를 선언했다면 자식 클래스에서도 매개변수값을 지정해줘야 하는 것이 맞다.

**예제 코드**
```java
// 위 코드 생략

class Parent{
    // 매개변수를 가진 생성자 선언
    public Parent(String name){
        this.name = name; // 매개변수를 인스턴스 변수로 지정
    }
    String name;
    int age = 56;
}

class Child extends Parent{
    public Child(){
        // 부모클래스의 매개변수값 지정
        super("Kim");
    }

    // 아래 코드 생략

}
```

위 예제처럼 부모 클래스에서 매개변수를 가진 생성자를 선언했다면 자식클래스의 생성자에서 `super()`를 사용해 매개변수값을 동일한 자료형으로 지정해줘야 한다.

> [참고사이트](https://crazykim2.tistory.com/551)

<br>

## ✔️  참조자료형 형변환 & `instanceof` 예약어 활용시 주의사항
**참조자료형 형변환**
- 자식 객체를 부모 객체로 형변환은 가능
- 부모 객체를 자식 객체로 형변환하는 것은 불가능

**`instanceof` 예약어**
- 자식객체 `instanceof` 부모클래스 : 이 객체가 부모클래스를 대신할 수 있는가? -> true
- 부모객체 `instanceof` 자식클래스 : 이 객체가 자식클래스를 대신할 수 있는가? -> false

<br>

## ✔️  참고자료형 형변환 추가 설명

아래 예제에 example() 메소드에는 세가지 경우로 생성한 객체가 존재한다.

**예제 코드**
```java
class Sample{
	public static void main(String[] args){
		Sample sample = new Sample();
        sample.example();
    }
    // 예제 실행 메소드
    public void example(){
        // 1. 부모타입 객체 - 부모 생성자
        Parent parent1 = new Parent();
        parent1.printByParent(); // 결과 : This str is from Parent

        // 2. 부모타입 객체 - 자식 생성자
        Parent parent2 = new Child();
        parent2.printByParent(); // 결과 : This str is from Parent with Overrinding method

        // 3. 자식타입 객체 - 부모생성자(처럼 보이는 자식 생성자)
        Child child1 = (Child)parent2;
        child1.printByChild(); // 결과 : This str is from Child with Only child method
	}
}
// 부모 클래스
class Parent{
    // 변수
    String str = "Parent";

    // 메소드
    public void printByParent(){
        System.out.println("This str is from " + str);
    }
}
// 자식 클래스
class Child extends Parent{
    // 자식 클래스에 새로 선언한 메소드
    String str2 = "Child";

    // 오버라이딩 메소드
    public void printByParent(){
        System.out.println("This str is from " + str + " with Overrinding method");
    }
    // 자식 클래스에 새로 선언한 메소드
    public void printByChild(){
        System.out.println("This str is from " + str2 + " with Only child method");
    }
}
```
**1. 부모 클래스 생성자로 부모타입의 객체를 생성한 경우** <br>
이런 경우는 자식 클래스에 어떠한 영향을 받지 않는다.

<br>

**2. 자식 클래스 생성자로 부모타입 객체를 생선한 경우** <br>
이런 경우에 자식 클래스에서 부모 클래스로부터 상속받은 변수나 메소드만 호출할 수 있다.

즉, 자식 클래스에만 선언된 `str2` 변수나 `printByChild()` 메소드는 호출이 불가능하다.

```java
Parent parent2 = new Child();
parent2.printByChild(); // 에러 발생(결국 부모타입이라)
```

또한 오버라이딩되어 자식 클래스에 재선언된 메소드나 변수는 오버라이딩된 상태로 호출된다.
> 이런 현상을 책에서는 폴리몰피즘(다형성)으로 설명한 것!!(p.259 ~ 261)

<br>

**3. 자식타입 객체 - 부모생성자(처럼 보이는 자식 생성자)** <br>
자식 클래스 타입의 객체를 생성하는데 **그 생성자를 자식생성자로 만든 부모타입의 객체로 만든 경우**이다.

말이 많이 어렵지만 사실상 자식클래스 객체이지만 부모클래스 타입을 보이는 객체로 이해하면 되겠다.

이 경우에 결국 실생성자의 출신이 어디냐를 본다면 **자식클래스**이지만 겉모습은 부모클래스를 타입으로 가지고 있기때문에 형변환을 통해 객체를 생성해줘야 한다.

```java
Child child2 = parent2; // 에러발생(겉보기는 부모타입)
```

하지만 형변환을 통해 객체를 생성했다면 자식클래스의 변수와 메소드를 호출한다.

<br>

**정리하자면**
- 결국 생성자에 따라 호출되는 변수나 메소드가 결정된다.
- 그렇기에 오버라이딩된 변수나 메소드는 그 상태로 호출된다.
- 자식 생성자로 만든 부모 객체는 겉으로는 부모의 형상을 띄기 때문에 이 객체를 이용해 자식 객체를 만들려면 형변환이 필요하다.
- **겉** : 부모클래스 타입의 객체 / **안** : 오버라이딩되었거나 부모객체로부터 상속시킨 변수와 메소드만 호출 가능

<br>

## ✔️  this와 super의 활용법 추가 설명

**부모 클래스**
```java
class Animal {
    String name;
    int legCount;
    boolean hasWing;
    // 매개변수를 지정한 부모 생성자 선언
    public Animal(String name, int legCount, boolean hasWing){
        this.name = name;
        this.legCount = legCount;
        this.hasWing = hasWing;
    }
    public void printInfo(){
        System.out.println("Name : " + name);
        System.out.println("LegCount : " + legCount);
        System.out.println("HasWing : " + hasWing);
    }
}
```
부모 클래스에서는 기본생성자가 아닌 인스턴스 변수에 매개변수로 받아온 값을 할당하는 생성자를 선언합니다.

**자식 클래스**
```java
class Dog extends Animal {
    // 새로운 변수 선언
    String breed;

    // 매개변수를 지정한 자식 생성자 선언
    public Dog(String name, int legCount, boolean hasWing, String breed){
        // 부모 생성자 호출, 상속받은 변수는 super()을 통해 부모 생성자를 호출하여 할당
        super(name, legCount, hasWing);

        // 상속받지 않은 변수는 this로 지정
        this.breed = breed;
    }
    // 오버라이딩
    public void printInfo(){
        System.out.println("Name : " + name);
        System.out.println("LegCount : " + legCount);
        System.out.println("HasWing : " + hasWing);
        // 추가코드
        System.out.println("breed : " + breed);
    }
}
```
자식클래스 또한 매개변수값을 받는 생성자를 선언하고, 그 안에 super()를 활용해 상속받은 인스턴스 변수에 할당할 매개변수는 부모 클래스 생성자로 넘겨줍니다. 그리고 자식 클래스에서 새로 선언한 인스턴스 변수값은 this 예약어로 지정합니다.

**메소드 실행**
```java
public class Sample{
    public static void main(String[] args){
        // 부모타입 객체 생성
        Animal animal = new Animal("heri", 4, false);
        System.out.println("<Animal class>");
        // 매개변수값 출력1
        animal.printInfo();

        System.out.println();

        // 자식타입 객체 생성
        Dog dog = new Dog("coco", 4, false, "cocker");
        System.out.println("<Dog class>");
        // 매개변수값 출력2
        dog.printInfo();
    }
}
```
**출력 결과**
```
<Animal class>
Name : heri
LegCount : 4
HasWing : false

<Dog class>
Name : coco
LegCount : 4
HasWing : false
breed : cocker
```

<br>

## ✔️  BigDecimal 클래스를 사용하는 이유
JAVA에서 기본자료형으로 활용되는 float나 double을 사용하지 않고 BigDecimal 클래스를 사용하는 이유는 BigDecimal 클래스를 활용하면 실수를 계산하는데 더 정확한 계산이 가능하다 한다.

이를 자세히 알아보기 위해 먼저 기본 자료형으로 실수 계산시 발생할 수 있는 문제점을 보자.

```java
double num1 = 3.1254;
double num2 = 2.2376;
System.out.println(num1 + num2); // 5.3629999999999995
```
위 예제에서 두 double 타입의 값을 더했을 때 정확히 기대값이 아닌 기대값의 매우 가까운 근사치가 나오는 것을 볼 수 있다.

매우 작은 차이이기에 가볍게 넘길 수 있다고 생각할 수 있지만 돈계산과 같은 오차가 허용되지 않는 상황일 땐 매우 치명적인 오류를 범할 수 있다.

다음은 BigDecimal 타입으로 같은 값을 계산했을 경우다.
```java
BigDecimal num1 = BigDecimal.valueOf(3.1254);
BigDecimal num2 = BigDecimal.valueOf(2.2376);
System.out.println(num1.add(num2)); // 5.3630
```

`valueOf()` 메소드는 인자로 받은 값을 원하는 클래스로 변경하는 역할을 수행한다.

즉, double타입의 변수를 BigDecimal 타입으로 형변환을 한 이후 두 값을 더했을 때 우리가 기대했던 값이 나온 것을 알 수 있다.

이처럼 자바에서 기본자료형으로 실수를 연산하기보단 BigDecimal 타입을 활용하는 것이 필수적이다.

<br>

## ✔️  equals() 오버라이딩 코드 추가 설명
```java
@Override
public boolean equals(Object obj){
    if(this == obj) return true;
    if(obj == null) return false;
    if(this.getClass() != obj.getClass()) return false;
    Student other = (Student) obj; // ??? 부모객체 생성자로 자식객체를 생성한다?? 에러가 왜 안나지???

    if(name == null){
        if(other.name != null) return false;
    } else if(!name.equals(other.name)) return false;

    if(address == null){
        if(other.address != null) return false;
    } else if(!address.equals(other.address)) return false;

    if(phone == null){
        if(other.phone != null) return false;
    } else if(!phone.equals(other.phone)) return false;

    if(email == null){
        if(other.email != null) return false;
    } else if(!email.equals(other.email)) return false;

    return true;
}
```
주석이 달린 코드를 보면 부모객체인 Object의 생성자를 자식객체로 형변환하여 자식객체를 생성한다. 이러면 에러가 발생할텐데(참조자료형 형변환시 주의점) 에러발생이 안한다.

차근차근 코드를 살펴보니 그 이유를 알았다.

먼저 equals() 에서 매개변수로 받는 객체는 어떤 클래스의 생성자로 만들어진 객체인지 모르기 때문에 가장 최상위 객체인 Object 타입으로 받아야만 한다.

하지만 equals() 메소드가 사용되는 경우는 사실상 받아온 객체가 Object 객체의 하위객체, 즉 상속된 또 다른 클래스이거나 같은 클래스의 객체이다. 그리고 형변환 전에 getClass()를 활용해서 두 객체 타입이 다르다면 false를 리턴하고 메소드를 종료하게 설계되어 있다.

그렇기 때문에 형변환 코드가 실행되는 경우는 **this와 obj 객체가 같은 클래스일 경우**에만 실행된다. 문제가 될 이유가 없게끔 기본 오버라이딩 코드는 설계되어 있었다.

<br>

## ✔️  hashcode()메소드 추가 설명
hashCode() 메소드는 Java에서 Object 객체에 선언된 메소드 중 하나로 객체의 **주소값을 int 타입의 16진수로 리턴**하는 메소드이다.

hashCode() 메소드는 equals()와 함께 Overriding 하여 사용하는 것이 일반적인데 이는 비교하는 두 객체의 값을 equals()로 비교하여 같다는 것을 확인했어도 그 객체들이 할당된 주소값은 다른 것을 방지하기 위함이다.

즉 두 객체가 가진 값이 같다면, 두 객체가 저장된 위치값도 같아야 한다는 것이다.

위와 같은 설정을 위해 대부분의 IDE에서 제공해주는 hashcode()의 오버라이딩 기본코드가 있다.

### hashcode() 오버라이딩 코드
```java
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((variableValue1 == null) ? 0 : variableValue1.hashCode());
    result = prime * result + ((variableValue2 == null) ? 0 : variableValue2.hashCode());
    result = prime * result + ((variableValue3 == null) ? 0 : variableValue3.hashCode());
    return result;
}
```
### 코드 구동 순서 설명
1. hashcode로 전환할 변수의 값을 `variableValue1 ~ 3`으로 정한다.
2. variableValue1의 값이 null 이라면 result에 0을 더한다.
3. 그렇지 않다면 variableValue1의 hashCode()값을 result에 더한다.
4. 모든 변수가 2~3번 과정을 반복한다.
5. 최종 result 값을 리턴한다.

위 코드가 호출되는 상황은 **이미 eqauls()를 통해 비교할 두 객체의 값이 동일하다는 것을 확인한 이후**이다. 그래서 두 객체에 선언된 변수나 메소드의 hashCode값들의 총합을 result로써 리턴하여 두 합계를 같게 만들어 주는 것이다. 그래야 두 객체의 hashcode, 즉 두 객체의 위치값이 같게 만들 수 있다.

### 31을 사용하는 이유
Prime 변수에 31을 할당하고 result에 이 값을 곱하여 합계를 구한다. 그냥 null값이 아니면 해당 hashcode값만 더해서 result를 구해도 무방할 것처럼 보이는데 굳이 31이라는 값을 곱하는 이유는 무엇일까?

이는 result값을 구할 때 생겨날 에러를 방지하기 위해 상수로 곱해주는 것인데 자바의 hashCode()를 오버라이딩할 때는 주로 31을 사용하는 것이다. 31이 에러를 방지할 수 있는 이유는 31이 **홀수**이자 **소수**이기 때문이다.

만약 31과 같은 홀수가 아닌 짝수를 곱한다면 비트를 왼쪽으로 Shift하는 것과 같기 때문에 에러를 발생할 수 있다.

#### 비트 이동 예시
|num1|X|num2|==|result|shift|
|:--:|:--:|:--:|:--:|:--:|:--:|
|0001(1)|X|0010(2)|==|0010(2)|0001(1) -> 0010(2)|
|0010(2)|X|0010(2)|==|0100(4)|0010(2) -> 0100(4)|
|0011(3)|X|0010(2)|==|0110(6)|0011(3) -> 0110(6)|

가장 오른쪽 2진수를 보면 2를 곱했을경우 1의 위치가 왼쪽으로 한칸씩 이동한 것을 볼 수 있다. 이처럼 짝수를 곱할 경우 비트가 이동함과 동시에 오버플로우가 발생하면 값이 사라질 수 있기 때문에 짝수를 선택할 수 없다.

그렇다면 홀수를 사용하는 것은 이해했는데 왜 굳이 소수인 것일까??

소수를 사용하는 이점은 따로 알려진 것이 없지만 통상적으로 그렇게 사용된다고 한다. 약간 미신과 같은 이유라고 생각하면 된다.

소수를 사용하지 않아도 hashCode값 생성에는 큰 문제가 생기지 않지만, 짝수를 피해야하는 것은 명백한 이유가 존재한다는 것을 기억하면 좋을 듯 하다.

> [참고사이트](https://johngrib.github.io/wiki/Object-hashCode/#%EC%9D%B4%EC%83%81%EC%A0%81%EC%9D%B8-%ED%95%B4%EC%8B%9C-%ED%95%A8%EC%88%98%EC%97%90-%EA%B0%80%EA%B9%8C%EC%9A%B4-%ED%95%A8%EC%88%98-%EB%A7%8C%EB%93%A4%EA%B8%B0)

<br>

## ✔️ enum 생성자
enum 클래스는 객체를 생성할 때는 다음과 같이 상수를 지정해줘야만 생성이 된다.

`enum 클래스명.상수명`

### 예제코드
```java
public class Sample{
    public enum EnumName{
        PRIME_ONE,
        PRIME_TWO;
    }
    public static void main(String[] args){
        EnumName primeNumber = EnumName.PRIME_ONE; // PRIME_ONE
        EnumName primeNumber2 = EnumName; // 에러 발생
    }
}
```

또한 각 상수 선언시, 각 상수에 대응하는 매개변수를 지정할 수 있고 해당 매개변수를 활용한 생성자를 private나 package-protect 로 선언할 수 있다.

`상수명(매개변수값)`

### 예제코드2
```java
public class Sample{
    public enum EnumName{
        PRIME_ONE(1), // 상수에 대응하는 매개변수값을 소괄호에 지정
        PRIME_TWO(2);

        private final int number;

        // 생성자 선언
        EnumName(int number){
            this.number = number; // 매개변수값을 인스턴스 변수에 지정
        }
    }
    public static void main(String[] args){
        EnumName primeNumber = EnumName.PRIME_ONE;
        System.out.println(primeNumber.number); // 1
    }
}
```
출력된 값은 상수인 PRIME_ONE의 인스턴스 변수인 number의 값이라고 할 수 있다.

> [참고사이트](https://seeminglyjs.tistory.com/257)

<br>

## ✔️gitignore 파일 활용법
### gitignore 파일이란?
원격 저장소에서 사용되지 않는 파일들을 지정하여 커밋하지 못하게 설정하는 파일로 설정된 확장자 파일은 commit track에 올라오지 않는다.

자바의 경우, `.metadata` 파일들이 commit track에 올라오는 것을 막기 위해 생성하는 파일이다.

### 설정 순서
1. gitignore 파일을 생성한다.
    - 파일 생성시 최상위 디렉토리에 위치해야 한다.
    - [https://www.gitignore.io/](https://www.toptal.com/developers/gitignore)을 이용하면 사용하는 OS, 프로그래밍 언어, IDE에 맞는 gitingore파일을 생성할 수 있다.
2. 생성한 gitignore 파일을 commit 및 원격저장소에 push한다.
3. 이후 커밋할 때 설정한 파일들은 track에 올라오지 않는다.

**windows, java, eclipse 전용 gitignore 파일**
```

# Created by https://www.toptal.com/developers/gitignore/api/eclipse,java,windows
# Edit at https://www.toptal.com/developers/gitignore?templates=eclipse,java,windows

### Eclipse ###
.metadata
bin/
tmp/
*.tmp
*.bak
*.swp
*~.nib
local.properties
.settings/
.loadpath
.recommenders

# External tool builders
.externalToolBuilders/

# Locally stored "Eclipse launch configurations"
*.launch

# PyDev specific (Python IDE for Eclipse)
*.pydevproject

# CDT-specific (C/C++ Development Tooling)
.cproject

# CDT- autotools
.autotools

# Java annotation processor (APT)
.factorypath

# PDT-specific (PHP Development Tools)
.buildpath

# sbteclipse plugin
.target

# Tern plugin
.tern-project

# TeXlipse plugin
.texlipse

# STS (Spring Tool Suite)
.springBeans

# Code Recommenders
.recommenders/

# Annotation Processing
.apt_generated/
.apt_generated_test/

# Scala IDE specific (Scala & Java development for Eclipse)
.cache-main
.scala_dependencies
.worksheet

# Uncomment this line if you wish to ignore the project description file.
# Typically, this file would be tracked if it contains build/dependency configurations:
#.project

### Eclipse Patch ###
# Spring Boot Tooling
.sts4-cache/

### Java ###
# Compiled class file
*.class

# Log file
*.log

# BlueJ files
*.ctxt

# Mobile Tools for Java (J2ME)
.mtj.tmp/

# Package Files #
*.jar
*.war
*.nar
*.ear
*.zip
*.tar.gz
*.rar

# virtual machine crash logs, see http://www.java.com/en/download/help/error_hotspot.xml
hs_err_pid*
replay_pid*

### Windows ###
# Windows thumbnail cache files
Thumbs.db
Thumbs.db:encryptable
ehthumbs.db
ehthumbs_vista.db

# Dump file
*.stackdump

# Folder config file
[Dd]esktop.ini

# Recycle Bin used on file shares
$RECYCLE.BIN/

# Windows Installer files
*.cab
*.msi
*.msix
*.msm
*.msp

# Windows shortcuts
*.lnk

# End of https://www.toptal.com/developers/gitignore/api/eclipse,java,windows
```
> [참고사이트](https://velog.io/@psk84/.gitignore-%EC%A0%81%EC%9A%A9%ED%95%98%EA%B8%B0#gitignore%EC%9D%B4%EB%9E%80)

<br>

## ✔️constant pool
JAVA에서 String 객체를 생성하는 방법은 두가지가 있다.

1. `new` 예약어 사용하는 방법
2. `""`(큰따옴표) 사용하는 방법

두 방법의 차이점은 객체 생성시 **참조하는 메모리 주소**에 있다.

먼저 1번 방법으로 객체를 생성하면 같은 문자열이라도 서로 다른 메모리 주소를 참조하게 된다. 즉 같은 문자열을 가지고 있더라도 서로 다른 곳에 개별적으로 저장된다는 뜻이다.

반대로 2번 방법으로 객체를 생성하게 되면 같은 내용의 문자열을 생성할 때, 기존에 생성되어 있던 객체의 메모리 주소를 그대로 참조한다. 즉 새로운 메모리에 객체를 생성하는 것이 아니라 같은 내용의 문자열이 저장된 메모리 주소를 그대로 사용한다는 뜻이다.

이처럼 큰따옴표로 생성한 String 객체를 생성한 경우, 그 객체가 저장되는 메모리 구역을 **Constant Pool** 이라고 하고 Constant Pool은 해당 공간에 이미 저장된 메모리가 또 다시 생성될 경우에 다른 메모리 주소에 객체를 또 생성하는 것이 아니라 이미 생성된 메모리의 주소만 참조하면서 메모리 공간의 효율성을 높이는 역할을 한다.

> [참고사이트](https://starkying.tistory.com/entry/what-is-java-string-pool)


<br>

## ✔️객체를 비교할 때 `==`는 사용하지 말아야 하는 이유

`==`는 두 객체의 메모리 주소를 비교하여 메모리 주소가 다르다면 false를 결과로 내놓는다. 근데 만약 두 객체에 할당된 값은 같다면 에러를 발생시키는 것이다.

하지만 `eqauls()` 메소드는 객체에 할당된 값을 비교하기 때문에 == 보다 높은 안정성을 가질 수 있는 것이다.

위와 같은 맥락으로 객체 생성시 new 예약어를 활용해 객체를 생성한다면 그 값이 같더라도 Constant Pool을 활용하지 못하고 서로 다른 메모리 주소를 가지기 때문에 똑같은 에러를 발생시킬 수 있다.

이러한 위험요소를 제거하기 위해 대부분
- String 객체 생성시에는 ""를 사용할 것
- 객체를 비교할 땐 equals()를 사용할 것

을 권장하는 것이다.