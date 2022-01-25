# :pushpin: Chapter3
> 자바를 제대로 알려면 객체가 무엇인지 알아야 해요

## ✔ 직접해봅시다
### **1. `Profile` 클래스에 변수 추가(`name`, `age`)**
```java
public class Profile{
  String name; // 이름
  int age; // 나이
  public static void main(String[] args){
  }
}
```

### **2. `setName()` 메소드 생성**
`setName()` 메소드는 `str`을 매개변수로 받아 `name`으로 지정해 주는 기능

```java
public void setName(String str){
    name = str;
}
```

### **3. `setAge()` 메소드 생성**
2와 같은 방법으로 `val`을 매개변수로 받아 `age`에 할당
```java
public void setAnge(int val){
    age = val;
}
```

### **4. `printName()` 메소드 생성**
`name`을 출력해주는 기능

```java
public void printName(){ // 매개변수 불필요
    System.out.println("이름 : " + name);
}
```

### **5. `printAge()` 메소드 생성**
`age`을 출력해주는 기능

```java
public void printAge(){ // 매개변수 불필요
    System.out.println("나이 : "+ age);
}
```

4, 5번 메소드 생성시 매개변수로 name이나 age를 가져오지 않아도 사용할 수 있습니다. (name은 **멤버변수**이기 때문!!)

> [멤버변수 상세 설명](https://github.com/kimcno3/godofjava/blob/main/volume1/chapter/plusDescription.md#%EB%A9%A4%EB%B2%84%EB%B3%80%EC%88%98)

### **6.` main()` 메소드에서 profile 이름으로 객체 생성**
```java
public static void main(String args[]){
    Profile profile = new Profile();
}
```

### **7. `setName()`, `setAge()` 메소드를 사용하여 이름과 나이값을 할당**
```java
public static void main(String args[]){
    Profile profile = new Profile();

    profile.setName("Kim"); // 이름 할당
    profile.setAge(27); // 나이 할당
}
```

### **8. `printName()` , `printAge()` 메소드를 사용하여 이름과 나이 출력**
```java
public static void main(String args[]){
    Profile profile = new Profile();

    profile.setName("Kim"); // 이름 할당
    profile.setAge(27); // 나이 할당

    profile.printName(); // 이름 출력
    profile.printAge(); // 나이 출력
}
```

### **전체 코드**
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
