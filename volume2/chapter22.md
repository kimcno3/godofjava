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
