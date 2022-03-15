# :pushpin: Chapter7

## ✔️직접해봅시다.
### 작성 코드
```java
public class ManageHeight{
    // 인스턴스 변수 선언 : 반은 5개, 학생수는 미정
    int[][] gradeHeights = new int[5][];

    // main 함수
    public static void main(String[] args){
        // 객체 생성
        ManageHeight sample = new ManageHeight();
        // 2번 메소드 실행 : 반별 학생들의 키 데이터 지정
        sample.setData();
        // Loop를 위한 반번호 변수 생성
        int classNo=1;
        // 3~4번 메소드 실(for문) : 반별 학생들의 키 출력
        for (classNo=1; classNo<=sample.gradeHeights.length; classNo++){
            sample.printHeight(classNo);
        }
        // 반번호 초기화
        classNo = 1;
        // 5~6번 메소드 실행(while문) : 반별 학생들의 키 평균 출력
        while (classNo<=5){
            sample.printAverage(classNo);
            classNo++;
        }
    }
    // 2번 메소드 : 반별 학생의 키값 지정
    public void setData(){
        int [][] allHeights =  {{170,180,173,175,177},
                                {160,165,167,186},
                                {158,177,187,176},
                                {173,182,181},
                                {170,180,165,177,172}};

        for (int i=0; i<allHeights.length; i++){
            // 1차원 배열 선언(인스턴스 변수의 i번째 배열을 allHeights의 i번쨰 배열의 길이만큼 선언)
            gradeHeights[i] = new int[allHeights[i].length];
            for (int j=0; j<allHeights[i].length; j++){
                // 값 지정(두 변수의 i번째 배열의 j번쨰 위치에 값을 할당)
                gradeHeights[i][j] = allHeights[i][j];
            }
        }
    }
    // 3~4번 메소드  : 반별 학생들의 키를 출력
    public void printHeight(int classNo){
        // 해당 반에 해당하는 인덱스값 계산
        int classIdx = classNo-1;
        System.out.println("Class No." + classNo);
        // 계산한 인덱스에 해당하는 배열을 loop하면서 데이터 출력
        for(int StudentHeight : gradeHeights[classIdx]){
            System.out.println(StudentHeight);
        }
        System.out.println();
    }
    // 5~6번 메소드 : 반별 학생들의 키평균값 출력
    public void printAverage(int classNo){
        // 필요한 변수 생성(배열의 인덱스, 합계, 평균)
        int classIdx = classNo-1;
        double sum = 0.0;
        double average = 0.0;

        System.out.println("Class No." + classNo);
        // 계산한 인덱스에 해당하는 배열을 Loop하면서 합계 계산
        for(int studentHeight : gradeHeights[classIdx]){
          sum += studentHeight;
        }
        // 합계와 배열의 길이를 나눠 평균 계산
        average = (double)(sum/gradeHeights[classIdx].length);
        // 평균값 출력
        System.out.println("Height Average : " + average);
    }
}
```

### 실행 결과
```
Class No.1
170
180
173
175
177

Class No.2
160
165
167
186

Class No.3
158
177
187
176

Class No.4
173
182
181

Class No.5
170
180
165
177
172

Class No.1
Height Average : 175.0
Class No.2
Height Average : 169.5
Class No.3
Height Average : 174.5
Class No.4
Height Average : 178.66666666666666
Class No.5
Height Average : 172.8
```
### 아쉬운점
2차원 배열에 값을 지정하는 과정에서 배열을 초기화하는데 많이 미숙했다.(`setData()`메소드)

해설코드에서 값을 지정한 방법은 아래와 같다.
```java
//인스턴트 변수 선언
int gradeHeights[][];

public void setData() {
    // 2차원 배열 초기화
    gradeHeights = new int[5][];
    // 각 배열 초기화 및 값 지정(중괄호 활용)
    gradeHeights[0] = new int[] { 170, 180, 173, 175, 177 };
    gradeHeights[1] = new int[] { 160, 165, 167, 186 };
    gradeHeights[2] = new int[] { 158, 177, 187, 176 };
    gradeHeights[3] = new int[] { 173, 182, 181 };
    gradeHeights[4] = new int[] { 170, 180, 165, 177, 172 };
}
```
책을 다시 보면서 위 해설코드처럼 배열 선언을 중괄호를 활용해서 해보려했지만 계속 에러가 나와서 결국 반복문을 통해 값을 지정하는 방법을 선택했는데, 원했던 방법을 해설코드를 보고서 찾았다는 점이 아쉽다.

<br>

## ✔️정리해봅시다.
### 1. 배열을 선언할 때 어떤 기호를 변수명의 앞이나 뒤에 사용해야 하나요?
[], 대괄호

### 2. 배열의 첫번째 위치는 0인가요? 1인가요?
배열의 위치는 0부터 시작합니다.

### 3. 배열을 선언할 때 boolean 배열의 크기만 지정했다면 boolean 배열의 [0] 위치에 있는 값은 무엇인가요?
false값이 기본값으로 설정됩니다.

### 4. ArrayIndexOutOfBoundsException 이라는 것은 언제 발생하나요?
배열의 범위를 벗어난 위치값이 발견되었을 때 발생하는 에러메세지 입니다.

> 더 정확하게는 배열의 범위를 벗어난 위치를 참조하려 할 때 발생하는 에러 메세지입니다.

### 5. 중괄호를 이용하여 배열을 초기화 할 때 중괄호 끝에 반드시 어떤 것을 입력해 주어야 하나요?
세미콜론(;) , 보통 중괄호 뒤에 세미콜론을 붙이는 일이 없기 때문에 빼먹지 않도록 주의해야 합니다.

### 6. 2차원 배열을 정의할 때에는 대괄호를 몇 개 지정해야 하나요?
두개 지정합니다.

#### 예시
```java
int [][] arr = new int[5][5];
```

### 7. 배열을 쉽게 처리해주는 for 문의 문법은 어떻게 되나요?
`for(자료형 변수 이름 : 배열 이름){}`

배열의 값들을 선언한 변수 이름에 하나씩 **순서대로 할당**하고 loop합니다.

#### 예시
```java
int [] array = {0, 1, 2, 3, 4, 5};

for(int index : array){
    System.out.println(index);
}
```
#### 실행결과
```
0
1
2
3
4
5
```

### 8. 자바 프로그램에 데이터를 전달해 주려면 클래스 이름 뒤에 어떻게 구분하여 나열하면 되나요?
문자열 사이사이에 공백을 주면 이 공백을 기준으로 데이터를 나눠 전달합니다.

#### 예시
```java
public class className{
    public static void main(String[] args){
        for (String arg : args){
            System.out.println(arg);
        }
    }
}
```

#### 실행결과
```
$ java className a b c d e
a
b
c
d
e
$
```

### 9. 자바 프로그램이 시작할 때 전달 받는 내용은 어떤 타입의 배열인가요?
String 배열입니다.
