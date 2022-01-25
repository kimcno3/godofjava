package example;
// 5
public class ManageStudent{
    // 6
    public static void main(String[] args){
        // 8
        Student[] student;
        // 9
        ManageStudent manage = new ManageStudent();
        student = manage.addStudent();
        // 12
        manage.printStudents(student);
    }
    // 7
    public Student[] addStudent(){
        Student[] student = new Student[3];
        student[0] = new Student("Kim");
        student[1] = new Student("Lee");
        student[2] = new Student("Park", "Icheon", "010-xxxx-xxxx", "kimcno3@naver.com");
        return student;
    }
    // 10
    public void printStudents(Student[] student){
        // 11
        for(Student info : student){
            System.out.println(info);
        }
    }
}