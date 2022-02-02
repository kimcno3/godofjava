package volume1.example;

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
        if (a.equals(b)) System.out.println("Equal");
        else System.out.println("Not Equal");
    }
    @Override
    public String toString(){
        return name + " " + address + " " + phone + " " + email;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false; // 다른 객체인 경우 false 리턴 후 형변환 코드를 실행시키지 않는다. 에러날 이유가 없다.
        Student other = (Student) obj;

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

}