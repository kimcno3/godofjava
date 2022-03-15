# :pushpin: Chapter16

## ✔️직접해봅시다.
### MyPage 클래스
```java
package c.inner.practice;

public class MyPage {
	public static void main(String[] args) {
		MyPage page = new MyPage();
		page.setUI();
		page.pressKey();
	}
	// InputBox 객체 생성
	InputBox input;

	// InputBox에 KeyEventListener 객체를 지정하는 메소드
	public void setUI() {
		// InputBox 객체 생성
		input = new InputBox();
		// 익명 클래스로 KeyEventListener 객체 구현
		KeyEventListener listener = new KeyEventListener() {
			public void onKeyDown() {
				System.out.println("Key Down");
			}
			public void onKeyUp() {
				System.out.println("Key Up");
			}
		};
		// InputBox 객체에 KeyEventListener 객체 지정
		input.setListener(listener);
	}
	// Event 발생
	public void pressKey() {
		// InputBox 객체의 KeyEventListener 객체를 불러와서 매개변수에 해당하는 메소드 실행
		input.listenerCalled(2);
		input.listenerCalled(4);
	}
}
```

### InputBox 클래스
```java
package c.inner.practice;

public class InputBox {
	// 기본 생성자
	public InputBox() {
	}
	// KeyEventListener 타입 변수 선언
	KeyEventListener listener;
	// InputBox 클래스의 KeyEventListener 변수에 외부에서 생성한 리스너를 할당
	public void setListener(KeyEventListener listener) {
		this.listener = listener;
	}
	// 상수 선언(발생한 이벤트 타입과 대응한 상수 설정)
	public static final int KEY_DOWN = 2;
	public static final int KEY_UP = 4;
	// KeyEventListener의 메소드 불러오기(이벤트 타입과 대응한 리스너 메소드 실행)
	public void listenerCalled(int eventType) {
		if(KEY_DOWN == eventType) {
			listener.onKeyDown();
		}
		else if(KEY_UP == eventType) {
			listener.onKeyUp();
		}
	}
}
```

### KeyEventListener 인터페이스
```java
package c.inner.practice;

public interface KeyEventListener {
	public void onKeyUp();
	public void onKeyDown();
}
```

<br>

## ✔️정리해봅시다.
### 1. Nested 클래스에 속하는 3가지 클래스에는 어떤 것들이 있나요? *
Static nested 클래스, 로컬 내부 클래스, 익명 내부 클래스

### 2. Nested 클래스를 컴파일하면 Nested클래스 파일의 이름은 어떻게 되나요? *
`외부클래스명$Nested클래스명.class`로 생성됩니다.

### 3. Static Nested 클래스는 다른 Nested 클래스와 어떤 차이가 있나요? *
- 객체 생성 방법이 다르다.(구체적인 생성 방법은 3,4번 참고)
- 외부 클래스의 변수 중 static이 선언되어 있는 변수를 제외하고 접근할 수 없다.

### 4. StaticNested 클래스의 객체 생성은 어떻게 하나요? *
`외부클래스명.StaticNested클래스명 객체명 = new 외부클래스명.StaticNested클래스명();`

### 5. 일반적인 내부 클래스의 객체 생성은 어떻게 하나요? *
```java
OuterClass outer = new OuterClass();
OuterClass.InnerClass inner = outer.new InnerClass();`
```
### 6. Nested 클래스를 만드는 이유는 무엇인가요? *
**캡슐화**를 위해서 사용합니다. 노출되면 안되는 클래스를 생성해야 하는 경우 사용합니다.

또한 하나의 클래스에서 어떤 공통적인 작업을 수행하는 클래스가 필요한데 다른 클래스에서는 전혀 필요없는 경우, 내부 클래스를 생성합니다.

### 7. Nested 클래스에서 감싸고 있는 클래스의 private 로 선언된 변수에 접근할 수 있나요? *
O, 모든 종류의 변수를 접근할 수 있다.

### 8. 감싸고 있는 클래스에서 Nested 클래스에 선언된 private 로 선언된 변수에 접근할 수 있나요? *
O, 반대의 경우에도 접근이 가능하다.