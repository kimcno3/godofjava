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
