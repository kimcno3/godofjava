# :pushpin: Chapter14

## ✔️직접해봅시다.
### 작성 코드
```java
package c.string.practice;

public class UseStringMethods {
	public static void main(String[] args) {
		UseStringMethods sample = new UseStringMethods();

        // 필요한 변수 생성 
		String str = "The String class represents character strings.";
		String findStr = "string";
		char c = 's';

		sample.printWords(str); // split
		System.out.println();

		sample.findString(str, findStr); // indexOf
		System.out.println();

		sample.findAnyCaseString(str, findStr); // toLowerCase , indexOf
		System.out.println();

		sample.countChar(str, c); // toCharArray
		System.out.println();

		findStr = "ss";
		sample.printContainWords(str, findStr); // split(X), contains
	}
	public void printWords(String str) {
		String[] words = str.split(" "); // 공백을 기준으로 String 배열 생성
		for (String word : words) {
			System.out.println(word); // 순서대로 문자열 출력
		}
	}
	public void findString(String str, String findStr) {
		int index = str.indexOf(findStr); // findStr의 인덱스값 생성
		System.out.println(findStr + " is appeared at " + index); // 출력
	}
	public void findAnyCaseString(String str, String findStr) {
		String lowerCaseStr = str.toLowerCase(); // 문장을 모두 소문자로 변환
		int index = lowerCaseStr.indexOf(findStr); // 원하는 문자열이 있는 인덱스값 생성
		System.out.println(findStr + " is appeared at " + index); // 출력

	}
	public void countChar(String str, char c) {
		char[] charArray = str.toCharArray(); // 문자열을 char 배열로 변환
		int count = 0; // 개수를 위한 int 변수 생성
		for (char temp : charArray) {
			if (temp == c) count++; // 변환했던 char값이 찾고자 하는 char값과 같다면 count 증가
		}
		System.out.println("char '" + c + "' count is " + count); // 출력
	}
	public void printContainWords(String str, String findStr) {
		if (str.contains(findStr)) System.out.println("class contains " + findStr); // 원하는 문자열이 str에 포함되어 있다
		else System.out.println("class doesn't contain " + findStr); // 포함되어 있지 않다.
	}
}
```

### 출력 결과
```
The
String
class
represents
character
strings.

string is appeared at 38

string is appeared at 4

char 's' count is 6

class contains ss
```

<br>

## ✔️정리해봅시다.
### 1. String 클래스는 final 클래스인가요? 만약 그렇다면, 그 이유는 무엇인가요?
클래스를 확장할 수 없게 하기 위해서입니다.

### 2. String 클래스가 구현한 인터페이스에는 어떤 것들이 있나요?
- Serializable : 구현한다고 선언하면 객체를 파일로 저장하거나 다른 서버에 전송 가능한 상태가 되는 인터페이스
- Comparable : compareTo()만 정의되어 있는 인터페이스
- CharSequence : 문자열을 다루기 위한 메소드가 정의되어 있는 인터페이스

### 3. String 클래스의 생성자 중에서 가장 의미없는 (사용할 필요가 없는) 생성자는 무엇인가요?
`String()`

### 4. String 문자열을 byte 배열로 만드는 메소드의 이름은 무엇인가요?
`getBytes()`

### 5. String 문자열의 메소드를 호출하기 전에 반드시 점검해야 하는 사항은 무엇인가요?
생성한 문자열이 null이 아닌지 확인해야 합니다. (= null check)

### 6. String 문자열의 길이를 알아내는 메소드는 무엇인가요?
`length()`

### 7. String 클래스의 equals() 메소드와 compareTo() 메소드의 공통점과 차이점은 무엇인가요?
- 공통점
    - 두 객체가 동일한 지 확인할 수 있다.
- 차이점
    - 리턴값이 다르다. (`equals()` : boolean / `compareTo()` : int)

### 8. 문자열이 "서울시"로 시작하는지를 확인하려면 String의 어떤 메소드를 사용해야 하나요?
`startsWith("서울시")`

### 9. 문자열에 "한국"이라는 단어의 위치를 찾아내려고 할 때에는 String의 어떤 메소드를 사용해야 하나요?
`indexOf("한국")`

### 10. 위의 문제의 답에서 "한국"이 문자열에 없을 때 결과값은 무엇인가요?
-1

### 11. 문자열의 1번째부터 10번째 위치까지의 내용을 String으로 추출하려고 합니다. 어떤 메소드를 사용해야 하나요?
`substring(0,9)`

### 12. 문자열의 모든 공백을 표시로 변환하려고 합니다. 어떤 메소드를 사용하는 것이 좋을까요?
`replace(" ", "*")`

### 13. String의 단점을 보완하기 위한 두개의 클래스는 무엇인가요?
StringBuffer, StringBuilder

### 14. 문제의 답에서 문자열을 더하기 위한 메소드의 이름은 무엇인가요?
`append()`
