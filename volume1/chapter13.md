# :pushpin: Chapter13


## ✔️직접해봅시다 1
### List 인터페이스
세가지 메소드의 뼈대를 구성
```java
package c.impl.list;

public interface List {
	public void add();
	public void update(int index, Object value);
	public void remove(int index);
}
```

### AbstractList 클래스(Abstract)
List 인터페이스에서 선언한 메소드를 Overriding하고 새로운 메소드 선언
```java
package c.impl.list;

public abstract class AbstractList implements List {
	public abstract void clear();
	@Override
	public void add() {
		System.out.println("Overrided method add()");
	}
	@Override
	public void update(int index, Object value) {
		System.out.println("Overrided method update()");
	}
	@Override
	public void remove(int index) {
		System.out.println("Overrided method remove()");
	}
}
```

## ✔️ 직접해봅시다 2
### HealthInsurance 클래스(enum)
연봉별 건강보험 공제비 비율을 계산하는 enum 클래스 생성
```java
package c.impl.list;

public enum HealthInsurance {
    // 상수 및 생성자 선언(최대연봉, 공제 비율)
	LEVEL_ONE(1000, 1.0),
	LEVEL_TWO(2000, 2.0),
	LEVEL_THREE(3000, 3.2),
	LEVEL_FOUR(4000, 4.5),
	LEVEL_FIVE(5000, 5.6),
	LEVEL_SIX(6000, 7.1);

    // final 변수 선언
	private final int maxSalary; // 최대 연봉
	private final double radio; // 공제비 비율

    // 생성자 선언
	HealthInsurance(int maxSalary, double radio){
		this.maxSalary = maxSalary;
		this.radio = radio;
	}

    // 최대 연봉액 리턴 메소드
	int getMaxSalary() {
		return maxSalary;
	}

    // 공제비 비율 리턴 메소드
	double getRadio(){
		return radio;
	}

    // 연봉에 따른 상수 이름 리턴 메소드
	public static HealthInsurance getHealthInsurance(int salary) {
        // 방법1 , for문과 if문 활용
		HealthInsurance insuranceLevel = LEVEL_SIX;
		HealthInsurance[] allValues = HealthInsurance.values();
		for (HealthInsurance value : allValues) {
			if(value.getMaxSalary() > salary) {
				insuranceLevel = value;
				break;
			}
		}
		return insuranceLevel; // 모든 조건이 false면 자동으로 LEVEL_SIX 리턴

        // 방법2, if & else if 문 활용
		HealthInsurance level = LEVEL_SIX;
		if (salary <= 1000) {
			level = HealthInsurance.LEVEL_ONE;
		} else if (salary <= 2000) {
			level = HealthInsurance.LEVEL_TWO;
		} else if (salary <= 3000) {
			level = HealthInsurance.LEVEL_THREE;
		} else if (salary <= 4000) {
			level = HealthInsurance.LEVEL_FOUR;
		} else if (salary <= 5000) {
			level = HealthInsurance.LEVEL_FIVE;
		}
		return level; // 모든 조건이 false면 자동으로 LEVEL_SIX 리턴
	}
    // main 메소드
	public static void main(String[] args) {
		int[] salaryArray = {1500, 5500, 8000}; // 연봉값을 담은 배열
		HealthInsurance[] insurances = new HealthInsurance[3]; // 연봉에 따른 enum 객체를 담을 배열

        // 연봉과 그에 따른 건강보험 공제비율 출력
		for(int i=0; i<insurances.length; i++) {
			insurances[i] = HealthInsurance.getHealthInsurance(salaryArray[i]);
			System.out.println(salaryArray[i] + " = " + insurances[i] + ", " + insurances[i].getRadio() + "%");
		}
	}
}
```
### 결과
```
연봉(salary) = 상수, 공제비율(radio)

1500 = LEVEL_TWO, 2.0%
5500 = LEVEL_SIX, 7.1%
8000 = LEVEL_SIX, 7.1%
```
<br>

## ✔️정리해봅시다.
### 1. 인터페이스에 선언되어 있는 메소드는 body(몸통)이 있어도 되나요? *
X , 선언만 가능하다.

### 2. 인터페이스를 구현하는 클래스의 선언시 사용하는 예약어는 무엇인가요? *
implements , 여러 인터페이스를 한번에 implements 할 수 있다.
```java
public class Car implements InterfaceCar, InterfaceCar2
```

### 3. 메소드의 일부만 완성되어 있는 클래스를 무엇이라고 하나요? *
abstract 클래스

### 4. 위에 있는 문제의 답에 있는 클래스에 body(몸통)이 없는 메소드를 추가하려면 어떤 예약어를 추가해야 하나요? *
abstract
```java
public abstract class AbstractCar{
    public void method1(){

    }
    public void method2(){

    }
    public abstract void method3();
}
```

### 5. 클래스를 final로 선언하면 어떤 제약이 발생하나요? *
extends가 불가능하다.

### 6. 메소드를 final로 선언하면 어떤 제약이 발생하나요? *
override가 불가능하다.

### 7. 변수를 final로 선언하면 어떤 제약이 발생하나요? *
- 인스턴스 & 클래스 변수 : 초기화를 무조건 지정해줘야 하며 이후 값을 변경할 수 없다.
- 지역 & 매개변수 : 초기화를 꼭 해야하진 않지만 메소드 내에서 변경이 불가능하다.

### 8. enum 클래스 안에 정의하는 여러 개의 상수들을 나열하기 위해서 상수 사이에 사용하는 기호는 무엇인가요? *
`,`
```java
public enum EnumCar{
    NUMBER_ONE,
    NUMBER_TWO,
    NUMBER_THREE;
}
```
### 9. enum 으로 선언한 클래스는 어떤 클래스의 상속을 자동으로 받게 되나요? *
java.lang.Enum 클래스

### 10. Enum 클래스에 선언되어 있지는 않지만 컴파일시 자동으로 추가되는. 상수의 목록을 배열로 리턴하는 메소드는 무엇인가요? *
`values()`

