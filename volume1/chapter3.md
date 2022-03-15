# :pushpin: Chapter3
> 자바를 제대로 알려면 객체가 무엇인지 알아야 해요

## ✔ 직접해봅시다
### **작성 코드**
```java
public class Profile{
    // main 함수
    public static void main(String[] args){
        Profile profile = new Profile();
        profile.setName("Kim");
        profile.setAge(27);
        profile.printName();
        profile.printAge();
    }

    // 필드
    String name;
    int age;

    //메소드
    public void setName(String str){
        name = str;
    }
    public void setAge(int val){
        age = val;
    }
    public void printName(){
        System.out.println("이름 : " + name);
    }
    public void printAge(){
        System.out.println("나이 : "+ age);
    }
}
```

### **최종 결과**
```java
이름 : KIM
나이 : 27
```

<br>

## ✔ 정리해봅시다
### **1. 클래스와 객체의 차이점을 말해 주세요.**
- 클래스를 통해서 객체를 생성할 수 있다. 즉, 하나의 클래스를 만들면 그 클래스의 모습을 갖는 여러 객체들을 생성 할 수 있다.

- 클래스 범주 안에 객체가 포함되어 있고, 클래스의 복제품 격에 객체라고 할 수 있다.

### **2. 객체를 생성하기 위해서 꼭 사용해야 하는 예약어는 뭐라고 했죠?**
**new 키워드**를 사용하여 클래스의 객체를 생성한다.

### **3. 객체를 생성하기 위해서 사용하는 메소드 같이 생긴 클래스 이름에 소괄호가 있는 것을 뭐라고 하나요?**
**생성자(Constructor)** 를 통하여 클래스의 객체를 생성한다.

### **4. 객체의 메소드를 사용하려면 어떤 기호를 객체이름과 메소드 이름 사이에 넣어주어야 하나요?**
- **마침표(.)** 를 사용합니다.
- 클래스의 변수나 메소드를 호출하려면 "객체이름.변수", "객체이름.메소드이름()"와 같이 사용하면 된다.

### **5. 여러분들이 메소드를 사용하기 위해서는 어떤 것을 만들어야 하나요?**
클래스의 **객체**를 생성해야만 메소드를 사용할 수 있다.

### **6. 위의 문제에서 만들어야 하는 것은 어떤 예약어를 사용하고, 클래스의 무엇을 사용해야 하나요?**
**new 키워드**를 사용하여 **생성자**를 호출해야만 된다.
