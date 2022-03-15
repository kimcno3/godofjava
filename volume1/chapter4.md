# :pushpin: Chapter4
> 정보를 어디에 넣고 싶은데
## ✔️ 직접해 봅시다
### **작성 코드**
```java
public class ProfilePrint{
    public static void main(String args[]){
        ProfilePrint profile = new ProfilePrint();

        profile.setAge((byte)27);
        profile.setName((String)"김선호");
        profile.setMarried((boolean)false);

        System.out.println("나이: " + profile.getAge());
        System.out.println("이름: " + profile.getName());
        System.out.println("결혼여부: " + profile.getMarried());
    }
    byte age;
    String name;
    boolean isMarried;

    public void setAge(byte age2){
        age = age2;
    }
    public void setName(String name2){
        name = name2;
    }
    public void setMarried(boolean flag){
        isMarried = flag;
    }
    public byte getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public boolean getMarried(){
        return isMarried;
    }
}
```
### **출력 결과**
```java
나이: 27
이름: 김선호
결혼여부: false
```
<br>

## ✔️ 정리해 봅시다.
### 1. 네가지 종류 변수는 어떻게 구분할 수 있나요?
- 변수의 유효범위(생명주기)에 따라서 구분할 수 있습니다.
- 지역변수, 매개변수, 인스턴스변수, 클래스변수

### 2. 일반 변수의 이름을 지을 때 대문자로 시작하는 것은 일반적인 명명규칙이다.
아니오

### 3. 자료형에는 기본 자료형과 어떤 자료형이 있나요? *
참조 자료형

### 4. 기본 자료형에는 몇가지가 있나요? *
8가지

### 5. 기본 자료형 중 정수형에는 어떤 것들이 있나요? *
byte, short, int, long, char

### 6. byte는 몇 비트(bit)로 되어 있나요? *
8비트

### 7. byte 타입은 왜 만들었을까요? *
저장공간의 활용을 극대화 하기 위해서
작은 단위의 데이터를 저장할 때, 불필요한 데이터 공간 차지를 방지하기 위해 byte로 저장합니다.

### 8. int와 long중 어떤 타입이 더 큰 숫자를 처리할 수 있나요? *
long

### 9. 소수점을 처리하는 타입은 어떤 것이 있나요? *
float, double

### 10. char는 정수형인가요? *
예

### 11. a라는 값을 char로 정의할 때 어떤 기호로 감싸주어야 하나요? *
`''`(홀따옴표)

### 12. true와 false 두개의 값만을 가지는 타입은 어떤 것인가요? *
boolean
