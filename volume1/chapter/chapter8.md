# :pushpin: Chapter8

## ✔️직접해봅시다.
### Student 클래스
```java
public class Student{
    // 1번, 인스턴스 변수 선언
    String name;
    String address;
    String phone;
    String email;

    // 2번, 생성자 선언(name만)
    public Student(String name){
        this.name = name;
    }
    // 3번, 생성자 선언(모든 변수)
    public Student(String name, String address, String phone, String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    // 4번, toString 메소드 오버라이딩(재정의)
    public String toString(){
        return name + " " + address + " " + phone + " " + email;
    }
}
```
4번에서 선언한 toString() 메소드는 선언이 아닌 오버라이딩이다. toString은 상위 객체에서 이미 생성되어 있는 메소드고 Student 객체에서 메소드 실행 결과를 다르게 하기 위해 재정의한 것으로 이해해야 한다.

### ManageStudent 클래스
```java
// 5번, 클래스 선언
public class ManageStudent{
    // 6번, main 메소드 생성
    public static void main(String[] args){
        // 8번, 객체 생성(초기화X, 기본값 null)
        Student[] student;
        // 9번, 7번 메소드 호출
        ManageStudent manage = new ManageStudent();
        student = manage.addStudent();
        // 12번, 10번 메소드 호출
        manage.printStudents(student);
    }
    // 7번, 메소드 생성(배열에 객체 생성)
    public Student[] addStudent(){
        Student[] student = new Student[3];
        student[0] = new Student("Kim");
        student[1] = new Student("Lee");
        student[2] = new Student("Park", "Icheon", "010-xxxx-xxxx", "kimcno3@naver.com");
        return student;
    }
    // 10번, 메소드 생성(배열값 출력)
    public void printStudents(Student[] student){
        // 11번, for문으로 배열내 값을 순서대로 출력
        for(int i=0; i< student.length; i++){
            System.out.println(student[i]);
        }
    }
}
```
8번에서 배열만 생성하고 초기화하지 않았다. 이렇게 초기화하지 않으면 배열의 기본값은 null로 설정된다.

11번에서 for문의 조건식은 아래와 같이 `:`(콜론)을 이용해서 설정할 수도 있다.
```java
    public void printStudents(Student[] student){
        for(Student info : student){
            System.out.println(student[i]);
        }
    }
```

### 결과값
```
Kim null null null
Lee null null null
Park Icheon 010-xxxx-xxxx kimcno3@naver.com
```

<br>

## ✔️정리해봅시다.
### 1. 생성자는 반드시 만들어야 하나요?
X, 생성자 선언은 필수가 아닙니다. 필요에 따라 매개변수를 설정한 생성자를 선언하고 그렇지 않다면 매개변수가 없는 생성자가 자동으로 선언됩니다.

### 2. 만약 매개변수가 있는 생성자를 만들고, 매개변수가 없는 기본 생성자를 호출하면 어떻게 될까요?
에러가 발생합니다. 기본생성자가 자동으로 생성되는 경우는 선언된 생성자가 없을 경우만 해당하기 때문에 매개변수가 있는 생성자를 선언했다면 매개변수를 설정해야 합니다.

### 3. 생성자의 개수는 제한이 있나요?
X, 같은 이름의 생성자를 선언할 수 있고 각 생성자에 매개변수를 다르게 선언할 수 있습니다. 이와 같은 방식을 **오버로딩**이라고 합니다.

### 4. 인스턴스의 변수와 매개변수나 메소드 내에서 생성한 변수와 구분하기 위해서 사용하는 키워드는 무엇인가요?
`this` 키워드를 활용할 수 있습니다.

#### 예제
```java
public class ClassName{
    int var; // 인스턴스 변수
    public void methodName(int var){ // 매개변수
        this.var = var;
        // 인스턴스변수 = 매개변수
    }
}
```
위 예제처럼 this뒤에 나온 변수는 인스턴스변수를 가르키며 같은 변수명의 매개변수와 구분할 수 있습니다.

### 5. 메소드 선언시 리턴 타입으로 지정한 데이터를 넘겨줄 때 사용하는 키워드는 무엇인가요?
`return`

### 6. 메소드 선언시 아무 데이터도 리턴 타입으로 넘겨주지 않겠다는 것을 지정하는 키워드는 무엇인가요?
`void` , 메소드명 앞에 void를 추가하면 해당 메소드는 리턴값없이 메소드가 종료된다는 의미를 가집니다.

### 7. 메소드 선언에 static 이 있는 것과 없는 것의 차이는 무엇인가요?
`static`이 있는 메소드는 객체를 생성하지 않아도 메소드를 호출할 수 있습니다.

또한! static 메소드는 static이 추가된 **클래스변수만을 사용**할 수 있습니다.

### 8. 필자가 엄청나게 중요하다고 한 것 중 메소드의 이름은 같으나 매개변수를 다르게 하는 것의 명칭은 무엇인가요?
오버로딩(Overloading)

### 9. 기본 자료형을 매개변수로 넘겨 줄 때 Pass by value인가요? 아니면 Pass by reference인가요?
Pass by value , 값 자체를 넘겨주는 것

### 10. 참조 자료형을 매개변수로 넘겨 줄 때 Pass by value인가요? 아니면 Pass by reference인가요?
Pass by reference , 값이 저장된 메모리 주소를 넘겨주는 것

### 11. 매개변수의 수가 가변적일 때 메소드 선언시 타입과 변수 이름 사이에 어떤 것을 적어줘야 하나요?
(변수타입...변수명)(마침표 3개를 공백없이!)
#### 예시
```java
public class ClassName{
    public static void main(String[] args){
        ClassName sample = new ClassName();
        numbers.methodName(1,2,3,4,5); // 매개변수값들이 배열의 값으로 할당
    }
    public void methodName(int...numbers){ // 호출시 numbers를 배열로 인식
    }
}
```