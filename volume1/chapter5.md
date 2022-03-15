# :pushpin: Chapter5
> 계산을 하고 싶어요

## ✔️ 직접해 봅시다
### 작성코드
```java
public class SalaryManager{
    public static void main(String Args[]){
        SalaryManager person = new SalaryManager();
        // 세후월급 계산 및 결과 출력
        System.out.println("세 후 월 급 : " + person.getMonthlySalary(20000000) + "원");
    }

    // 세후월급 계산 메소드
    public double getMonthlySalary(int yearlySalary){
        // 세전월급 계산
        double monthSalary = yearlySalary / 12.0;
        System.out.println("세 전 월 급 : " + monthSalary + "원");

        // 근로 소득세 계산
        double MonthTax = calculateTax(monthSalary);
        System.out.println("근로 소득세 : " + MonthTax + "원");

        // 국민 연금 계산
        double MonthNationalPersion = calculateNationalPersion(monthSalary);
        System.out.println("국민   연금 : " + MonthNationalPersion + "원");

        // 건강 보험료 계산
        double MonthHealthInsurance = calculateHealthInsurance(monthSalary);
        System.out.println("견강 보험료 : " + MonthHealthInsurance + "원");

        // 세전월급에서 세금 총액 차감
        monthSalary -= (MonthTax + MonthNationalPersion + MonthHealthInsurance);

        // 계산완료된 세후월급 return
        return monthSalary;
    }

    // 근로 소득세 계산 메소드
    public double calculateTax(double monthSalary){
        double tax = monthSalary * 0.125;
        return tax;
    }

    // 국민 연금 계산 메소드
    public double calculateNationalPersion(double monthSalary){
        double nationalPersion = monthSalary * 0.081;
        return nationalPersion;
    }

    // 건강 보험료 계산 메소드
    public double calculateHealthInsurance(double monthSalary){
        double healthInsurance = monthSalary * 0.135;
        return healthInsurance;
    }
}
```

### 출력 결과
```
근로 소득세 : 208333.33333333334원
국민   연금 : 135000.0원
견강 보험료 : 225000.00000000003원
월       급 : 1098333.3333333335원
```

<br>

## ✔️ 정리해 봅시다.
### 1. 값을 할당할 때 사용하는 연산자의 기호는 무엇인가요? *
- `=`
- 우항의 값을 좌항의 변수에 할당한다는 의미

### 2. 기본적인 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지를 계산할 때 사용하는 연산자의 기호는 순서대로 각각 무엇인가요? *
`+`, `-`, `*`, `/`, `%`

### 3. += 는 무엇을 할 때 사용하는 연산자 인가요? *
좌항의 변수에 우항의 값을 더할 때

### 4. 연산의 순서를 모르거나 확실히 하고 싶을 때에는 어떤 기호를 사용해야 하나요? *
소괄호

### 5. ==와 !=의 차이는 무엇인가요? *
- `==` : 좌항과 우항이 같다면 true
- `!=` : 좌항과 우항이 같다면 false

### 6. <와 <=의 차이는 무엇인가요? *
- `<` : 두 값이 같은 경우에는 false
- `<=` : 두 값이 같은 경우에도 true

### 7. ! 연산자는 어떤 타입에 사용 할 수 있나요?
boolean

### 8. `? :` 로 표시하는 삼항 연산자의 `?`와 `:` 뒤에 명시해 주는 값은 무엇을 의미 하나요?
(조건식) `?` true일때값 `:` false일때값

### 9. 자바는 형변환을 한다고 했는데, short의 값을 long에 할당할 때에는 어떤 것을 해 주어야 하나요?
(long) 추가

### 10. 반대로 long값을 short에 할당할 때에는 어떤 것을 해 주어야 하나요?
(short) 추가

### 11. 위의 두 문제에서 어떤 경우가 기존 값이 사라지고, 엉뚱한 값으로 바뀔 수 있나요?
10번 문제의 경우 오버플로우나 언더플로우가 발생할 가능성이 있다.
