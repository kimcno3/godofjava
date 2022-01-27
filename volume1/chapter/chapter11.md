# :pushpin: Chapter10


## ✔️직접해봅시다.
### BigDecimal 클래스의 용도
API 설명문 중 일부 내용을 보면

*The BigDecimal class provides operations for arithmetic, scale manipulation, rounding, comparison, hashing, and format conversion.*

해석 : BigDecimal 클래스는 산술, 지수 조작, 반올림, 비교, 해싱, 형변환을 위한 **연산**들을 제공합니다.

*The BigDecimal class gives its user complete control over rounding behavior.*

해석: BigDecimal 클래스는 사용자에게 좀 더 정확한 소수점 처리를 도와줍니다.

즉, BigDecimal 클래스는 사칙연산자와 같이 숫자를 계산할 때 사용되는데 소수점 처리에 있어 정확도를 높히는 용도로 사용한다.

### BigDecimal 클래스의 생성자 수
총 16개

### BigDecimal 클래스의 abs() 메소드의 용도
`abs()` : 매개변수값의 절대값을 리턴합니다.

### BigDecimal 클래스의 메소드 중 `현재값 - 특정값`을 수행하는 메소드
`subtract()` 메소드가 뺄셈의 역할을 수행합니다.

### BigDecimal 클래스에서 나누기와 관련된 메소드들
- `divide()` : 기본 나누기 역할 수행
- `divideAndRemainder()` : 길이가 2인 배열을 생성
    - `[0]` : `divide()`의 결과값
    - `[1]` : `remainder()`의 결과값
- `divideToInteger()` : 나누기한 값을 정수로 치환하여 리턴

<br>

## ✔️정리해봅시다.