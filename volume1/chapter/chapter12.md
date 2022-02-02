# :pushpin: Chapter12


## ✔️직접해봅시다.
### Student 클래스
```java
public class Student{
    String name;
    String address;
    String phone;
    String email;

    public Student(){}
    public Student(String name){
        this.name = name;
    }
    public Student(String name, String address, String phone, String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    public void checkEquals(){
        Student a = new Student("Kim" , "Korea", "010-xxxx-xxxx", "kimcno3@xxxx.com");
        Student b = new Student("Kim" , "Korea", "010-xxxx-xxxx", "kimcno3@xxxx.com");
        if (a.equals(b)) System.out.println("Equal"); // a와 b가 같다면 "Equal" 출력
        else System.out.println("Not Equal"); // 아니라면 "Not Equal" 출력
    }
    @Override
    public String toString(){
        return name + " " + address + " " + phone + " " + email;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true; // 두 객체의 참조주소가 같다면 true
        if(obj == null) return false; // obj 객체가 null이라면 비교할 것도 없이 false
        if(this.getClass() != obj.getClass()) return false; // 다른 객체인 경우 false 리턴 후 형변환 코드를 실행시키지 않는다.
        Student other = (Student) obj; // 두 객체는 같은 클래스임으로 형변환

        if(name == null){ // 변수가 null값
            if(other.name != null) return false; // 그리고 비교대상인 변수가 null값이 아니라면 false
        } else if(!name.equals(other.name)) return false; // 두 변수가 같지 않다면 false

        // 위 코드와 같은 구조 반복

        if(address == null){
            if(other.address != null) return false;
        } else if(!address.equals(other.address)) return false;

        if(phone == null){
            if(other.phone != null) return false;
        } else if(!phone.equals(other.phone)) return false;

        if(email == null){
            if(other.email != null) return false;
        } else if(!email.equals(other.email)) return false;

        // 모든 과정을 거쳤는데도 false가 아니라면 true 리턴
        return true;
    }
}
```
### ManageStudent 클래스
```java
public class ManageStudent{
    public static void main(String[] args){
        Student chapter12 = new Student();
        chapter12.checkEquals(); // 결과 : Equal
    }
}
```

<br>

## ✔️정리해봅시다.
