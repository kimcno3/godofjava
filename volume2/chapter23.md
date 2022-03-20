# :pushpin: 23장

## ✔️ 직접해봅시다.
```java
package d.collection.practice;

import java.util.Random;
import java.util.HashSet;

public class RandomNumberMaker {
    public static void main(String[] args) {
        RandomNumberMaker maker = new RandomNumberMaker();
        
        // 6자리 랜덤 수가 담긴 HashSet을 10번 생성
        for(int i=0; i < 10; i++) {
            System.out.println((i+1) + "번 째 : " + maker.getSixNumber());
        }
    }
    // 6자리 랜덤 수 생성 메소드
    public HashSet<Integer> getSixNumber(){
        HashSet<Integer> sixNumber = new HashSet<Integer>();
        Random random = new Random();
        int tempNumber;

        while (true){
            tempNumber = random.nextInt(45);
            sixNumber.add(tempNumber);
            if(sixNumber.size() >= 6) return sixNumber; // 중복값은 자동 삭제되기 때문에 길이가 6이 될 때까지 loop!
        }
    }
}
```

## ✔️ 직접해봅시다.

