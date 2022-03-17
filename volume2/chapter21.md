# :pushpin: 21장

## ✔️ 직접해봅시다.
```java
package d.generic.practice;

@SuppressWarnings("all")
public class MaxFinder {
    public static void main(String[] args) {
        MaxFinder sample = new MaxFinder();
        
        // 최대값 계산 메소드 호출
        System.out.println("Result : getMax()");
        sample.testGetMax();

        System.out.println();
        
        // 최소값 계산 메소드 호출
        System.out.println("Result : getMin()");
        sample.testGetMin();
    }

    // 최대값 계산 메소드
    public void testGetMax(){
       System.out.println(getMax(1,2,3));
       System.out.println(getMax(3,2,1));
       System.out.println(getMax(2,3,1));
       System.out.println(getMax("a", "b", "c"));
       System.out.println(getMax("b", "c", "a"));
       System.out.println(getMax("c", "a", "b"));
    }
    public <T extends Comparable<T>> T getMax(T ... a){ // 여려개의 매개변수를 T 타입의 a라는 배열값으로 담는다.(가변인수 활용)
                                                        // T 타입의 객체는 CompareTo() 메소드를 오버라이딩한 객체여야 한다. (Integer, String..)
        T maxT = a[0]; // 최초 최대값은 배열의 0번째 값
        for(T tempT : a){
            if(tempT.compareTo(maxT)>0) maxT = tempT; // n번째 값이 최대값보다 크면 최대값 변경(compareTo()가 양수면 대상이 된 변수가 더 크다.)
        }
        return maxT;
    }
    // 최소값 계산 메소드
    public void testGetMin(){
        System.out.println(getMin(1,2,3));
        System.out.println(getMin(3,2,1));
        System.out.println(getMin(2,3,1));
        System.out.println(getMin("a", "b", "c"));
        System.out.println(getMin("b", "c", "a"));
        System.out.println(getMin("c", "a", "b"));
    }
    public <T extends Comparable<T>> T getMin(T ... a){ // getMax()와 동일(가변인수 활용, Comparable 상속 클래스 한정)
        T minT = a[0];
        for(T tempT : a){
            if(tempT.compareTo(minT)<0) minT = tempT;
        }
        return minT;
    }
}
```

<br>

## ✔️ 정리해봅시다.
### 1. 제네릭이 자바에 추가된 이유는 무엇인가요?
형변환으로 인한 에러를 방지하고 타입에 대한 유연성을 보장하기 위해
> 해설 답변 : 제네릭은 타입 형 병환에서 발생할 수 있는 문제점을 "사전"에 없애기 위해서 만들어졌다.


### 2. 제네릭 타입의 이름은 T나 E 처럼 하나의 캐릭터로만 선언되어야 하나요? *
X, 여러개의 타입을 함께 선언할 수 있습니다.

### 3. 메소드에서 제네릭 타입을 명시적으로 지정하기 애매할 경우에는 < > 안에 어떤 기호를 넣어 주어야 하나요? *
?(물음표)를 추가합니다.
```java
public void method1(<?> obj){

}
```

### 4. 메소드에서 제네릭 타입을 명시적으로 지정하기에는 애매하지만, 어떤 클래스의 상속을 받은 특정 타입만 가능하다는 것은 나타내려면 < > 안에 어떤 기호를 넣어 주어야 하나요? *
`<? extends 상속 클래스명>`

```java
public void method1(<? extends ParentClass> obj){

}
```
### 5. 제네릭 선언시 wildcard라는 것을 선언했을 때 어떤 제약사항이 있나요? *
Object로만 선언해야 한다. 그리고 호출시에만 사용할 수 있고 객체를 생성할 때는 선언할 수 없다.
```java
public void method1(Wildcard<?> wildcard){
    Object obj = wildcard.getWildcard();
}
```

### 6. 메소드를 제네릭하게 선언하려면 리턴타입 앞에 어떤 것을 추가해 주면 되나요? *
제네릭 타입을 선언해주면 됩니다.
```java
public <T> void method1(T variableName){

}
```
