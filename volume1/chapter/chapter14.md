# :pushpin: Chapter14


## ✔️직접해봅시다.
```java
package c.exception.practice;

public class Calculator {
	public static void main(String[] args) {
		Calculator sample = new Calculator();
		try {
			sample.printDivide(1,2);
			sample.printDivide(1,0); // 에러 발생 코드
		} catch(RuntimeException e) {
			System.out.println(e.getMessage()); // 생성한 새로운 예외 객체 내용 출력
		}
	}
	public void printDivide(double d1, double d2) throws RuntimeException { // 예외처리 throws
		if(d2 == 0) { // 나누는 수가 0이면 예외 throw
			throw new RuntimeException("Second Value cannot be Zero");
		} else { // 그 외 경우는 계산 실시
			double result = d1 / d2;
			System.out.println(result);
		}
	}
}
```
예외 처리는 `RuntimeException`말고 `Exception`클래스도 처리 가능하다.

<br>

## ✔️정리해봅시다.
### 1. 예외를 처리하기 위한 세가지 블록에는 어떤 것이 있나요?
`try` , `catch` , `finally`

### 2. 1의 답 중에서 "여기에서 예외가 발생할 것이니 조심하세요"라고 선언하는 블록은 어떤 블록인가요?
`try`

### 3. 1의 답 중에서 "예외가 발생하든 안하는 얘는 반드시 실행되어야 됩니다."라는 블록은 어떤 블록인가요?
`finally`

### 4. 예외의 종류 세 가지는 각각 무엇인가요?
Error, RuntimeException, Checked Exception

### 5. 프로세스에 치명적인 영향을 주는 문제가 발생한 것을 무엇이라고 하나요?
Error

### 6. try나 catch 블록 내에서 예외를 발생시키는 키워드는 무엇인가요?
`throw`

### 7. 메소드 선언시 어떤 예외를 던질 수도 있다고 선언할 때 사용하는 키워드는 무엇인가요?
`throws`

### 8. 직접 예외를 만들 때 어떤 클래스의 상속을 받아서 만들어야만 하나요?
Exception 클래스