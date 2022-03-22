# :pushpin: 22장

## ✔️ 직접해봅시다.
```java
package d.collection.practice;

import java.util.ArrayList;

public class ManageHeight {
    ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
        ManageHeight manager = new ManageHeight();
        // 반별 학생 키 set
        manager.setData();
        // 반별 학생 키 print
        for (int i=1; i<=5; i++) manager.printHeight(i);
        // 반별 평균키 print
        for (int i=1; i<=5; i++) manager.printAverage(i);
    }
    // 학생 키 데이터 입력
    public void setData(){
        ArrayList<Integer> grade;
        Integer[][] heights = {
                            {170, 180, 173, 175, 177}, 
                            {160, 165, 167, 186}, 
                            {158, 177, 187, 176}, 
                            {173, 182, 181}, 
                            {170, 180, 165, 177, 172}};
        
        for(Integer[] tempGrade : heights){
            grade = new ArrayList<>();
            for(Integer height : tempGrade){
                grade.add(height);
            }
            gradeHeights.add(grade);
        }
    }
    // 반별 키 출력
    public void printHeight(int classNo){
        ArrayList<Integer> grade = gradeHeights.get(classNo-1);

        System.out.println("Class No." + classNo);
        for(Integer height : grade) System.out.println(height);
    }
    // 반별 평균키 출력
    public void printAverage(int classNo){
        ArrayList<Integer> grade = gradeHeights.get(classNo-1);

        double sum = 0;
        for(Integer height : grade) sum += height;
        double average = sum/grade.size();

        System.out.println("Class No." + classNo);
        System.out.println("Height average: " + average);
    }
}
```

## ✔️ 정리해봅시다.
### Collection 인터페이스를 구현하는 대표적인 3개의 자료구조에는 어떤 것들이 있나요? *
List, Set, Map

### 배열과 같이 순서가 있는 목록형을 나타내는 대표 인터페이스는 무엇인가요? *
List

### ArrayList라는 클래스의 생성자 중 매개변수가 없는 기본 생성자를 사용하면 기본적으로 몇 개의 저장공간을 가지나요? *
10개

### 만약 ArrayList 클래스의 저장 공간 개수를 처음부터 지정하려면 어떤 생성자를 사용하면 되나요? *
ArrayList(int initialCapacity);

### ArrayList 객체를 생성할 때 제네릭을 사용하는 이유는 무엇인가요? *
특정 타입의 데이터만 담는 다는 것을 명시하기 위해

### ArrayList에 데이터를 담는 메소드 두가지의 이름은 무엇인가요? *
add() , addAll()

### Collection 인터페이스를 구현한 클래스의 객체에서 사용할 수 있는 for 루프의 구조는 어떻게 되나요? 코드를 작성하세요. *
for(<T> 변수명 : 객체명)

### Collection 인터페이스를 구현한 클래스의 객체에 저장된 데이터의 갯수를 확인하는 메소드 이름은 무엇인가요? *
size()

### ArrayList에서 특정 위치에 있는 데이터를 확인하는 메소드는 무엇인가요? *
get(int index)

### ArrayList에서 특정 위치에 있는 데이터를 삭제하는 메소드는 무엇인가요? *
remove(int index)

### ArrayList에서 특정 위치에 있는 데이터를 수정하는 메소드는 무엇인가요? *
set()

### java.util 패키지에 있는 Stack 이라는 클래스는 어떤 클래스를 확장한 것인가요? *
java.util.Vector

### Stack 클래스에서 데이터를 담는 메소드는 무엇인가요? *
push()

### Stack 클래스에서 가장 위에 있는 데이터를 확인만 하는 메소드는 무엇인가요? *
peek()

### Stack 클래스에서 가장 위에 있는 데이터를 삭제하고 리턴하는 메소드는 무엇인가요? *
pop()