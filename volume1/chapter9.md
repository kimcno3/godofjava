# :pushpin: Chapter9

## ✔️직접해봅시다.
### 1. godofjava 폴더 아래에 b 폴더 생성
```
C:\godofjava>mkdir b
```

### 2. b 폴더 아래 array, control, operator, variable 폴도 생성
```
// b 폴더로 이동
C:\godofjava>cd b

// 폴더 생성
C:\godofjava\b> mkdir array
C:\godofjava\b> mkdir control
C:\godofjava\b> mkdir operator
C:\godofjava\b> mkdir variable
```

### 3. Array.main.java 파일을 godofjava/b/array 폴더로 이동
```
C:\godofjava> mv ArrayMain.java b/array
```

### 4. ArrayMain.java package 선언
```java
package b.array;

public class ArrayMain{
    public static void main(String[] args){
            for(String arg : args){
                System.out.println(arg);
            }
    }
}
```

### 5. ArrayMain.java 컴파일
```
// 컴파일
C:\godofjava> javac b/array/ArrayMain.java

// 실행
C:\godofjava> java b/array/ArrayMain a b c d
a
b
c
d
```

### 6. ControlIf 파일은 b.control , OperatorConditional 파일은 b.operator , VariableTypes 파일은 b.variable 폴더로 이동 후 컴파일
```
// 파일이동
C:\godofjava> mv ControlIf.java b/control
C:\godofjava> mv OperatorConditional.java b/operator
C:\godofjava> mv VariableTypes.java b/variable

// 컴파일
C:\godofjava> javac b/control/ControlIf.java
C:\godofjava> javac b/operator/OperatorConditional.java
C:\godofjava> javac b/variable/VariableTypes.java

// 실행결과
C:\godofjava> java b/control/ControlIf
It's smaller or equal than 5.
It's smaller than 5.

C:\godofjava> java b/operator/OperatorConditional
80 : true
30 : false

C:\godofjava> java b/variable/VariableTypes
It's VariableTypes Class
```

<br>

## ✔️정리해봅시다.
### 1. 패키지를 선언할 때 사용하는 예약어는 무엇인가요?
package

### 2. 패키지 선언은 클래스 소스 중 어디에 위치해야 하나요?
가장 위에 위치해야 합니다.

package 예약어 위에 주석이나 공백은 상관없지만, 다른 자바 문장 하나라도 포함되어 있으면 안된다.

### 3. 패키지를 선언할 때 가장 상위 패키지의 이름으로 절대 사용하면 안되는 단어는 무엇인가요?
java

java는 Oracle에서 사용하는 패키지 이름이기 때문에 그외 사용자에게는 제한되어 있다.

### 4. 패키지 이름에 예약어가 포함되어도 되나요?
아니오

### 5. import는 클래스 내에 선언해도 되나요?
아니오

#### 예시로 AccessCall.java에서 import 선언을 class 내에 선언해 봤다.
```java
package c.javapackage;

public class AccessCall{

  import c.javapackage.sub.AccessModifier; // 클래스내에 import 선언

    public static void main(String[] args){
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicMethod();
        accessModifier.protectedMEthod();
        accessModifier.packagePrivateMethod();
        accessModifier.privateMethod();
    }
}
```
이후 컴파일 해보니 다음과 같은 에러가 발생했다.
```
$ javac c/javapackage/AccessCall.java
c\javapackage\AccessCall.java:5: error: illegal start of type // 문법적
  import c.javapackage.sub.AccessModifier;
  ^
c\javapackage\AccessCall.java:5: error: ';' expected // 세미콜론 미작성
  import c.javapackage.sub.AccessModifier;
        ^
c\javapackage\AccessCall.java:5: error: illegal start of type
  import c.javapackage.sub.AccessModifier;
          ^
c\javapackage\AccessCall.java:5: error: ';' expected
  import c.javapackage.sub.AccessModifier;
                      ^
c\javapackage\AccessCall.java:5: error: <identifier> expected // 식별자 미작성
  import c.javapackage.sub.AccessModifier;
                                         ^
5 errors
```
간단하게 말해서 문법적으로 허용되지 않아 에러를 발생시킨다.

### 6. 같은 패키지에 있는 클래스를 사용할 때 import를 해야 하나요?
아니오

주의할 점은 상위 패키지에 있는 클래스라도 하위 패키지에서 선언해야 할 때 import 선언을 해야한다. 다시 말해 같은 패키지가 아니라면 무조건 import를 해야한다.

### 7. 특정 패키지에 있는 클래스들을 모두 import할 때 사용하는 기호는 무엇인가요?
`*`

#### 사용 예시
```java
import c.javapackage.sub.*
```
위와 같이 선언하면 해당 패키지의 모든 클래스를 import 할 수 있다.

### 8. 클래스에 선언되어 있는 static한 메소드나 변수를 import하려면 어떻게 선언해야 하나요?
import static

### 9. 접근 제어자 중 가장 접근 권한이 넓은 (어떤 클래스에서도 접근할 수 있는) 것은 무엇인가요?
public

### 10. 접근 제어자 중 가장 접근 권한이 좁은 (다른 클래스에서는 접근할 수 없는) 것은 무엇인가요?
private

### 11. 접근 제어자 중 같은 패키지와 상속관계에 있는 클래스만 접근할 수 있도록 제한하는 것은 무엇인가요?
protected

### 12. Calculate.java라는 자바 소스가 있을 경우, 그 소스 내에는 Calculate라는 클래스외에는 ( )으로 선언된 클래스가 있으면 안된다. 여기서 괄호 안에 들어가야 하는 것은 무엇인가요?
public
