package volume1.example;

public class ManageStudent{
    public static void main(String[] args){
        // Student[] student;
        // ManageStudent manage = new ManageStudent();
        // student = manage.addStudent();
        // manage.printStudents(student);

        Student chapter12 = new Student();
        chapter12.checkEquals();
    }
    public Student[] addStudent(){
        Student[] student = new Student[3];
        student[0] = new Student("Kim");
        student[1] = new Student("Lee");
        student[2] = new Student("Park", "Icheon", "010-xxxx-xxxx", "kimcno3@naver.com");
        return student;
    }
    public void printStudents(Student[] student){
        for(Student info : student){
            System.out.println(info);
        }
    }
}