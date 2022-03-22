## :pushpin: 24장

### ✔️ 직접해봅시다.
```java
package d.collection.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
    private final int DATA_BOUNDARY = 50;
    Hashtable<Integer, Integer> hashtable =  new Hashtable<Integer, Integer>();
    public static void main(String[] args) {
        RandomNumberStatistics sample = new RandomNumberStatistics();
        sample.getRandomStatistics();
    }
    public void getRandomStatistics(){
        Random random = new Random();
        int tempNumber;
        for(int i=0; i<50; i++){
            tempNumber = random.nextInt(DATA_BOUNDARY);
            putCurrentNumber(tempNumber);
        }
        printStatistics();
    }
    public void putCurrentNumber(int tempNumber){
        if(!hashtable.containsKey(tempNumber)) {
            hashtable.put(tempNumber, 1);
        } else {
            hashtable.put(tempNumber, hashtable.get(tempNumber)+1); // 값에 +1
        }
    }
    public void printStatistics(){
        Set<Integer> keys = hashtable.keySet();
        for(Integer key : keys){
            if(key%10 == 1) {
                System.out.println();
            } else {
                System.out.print(key + " = " + hashtable.get(key) + " ");
            }
        }
    }
}
```

## ✔️ 직접해봅시다.
### Map 형태의 자료구조는 무엇과 무엇으로 구성되어 있나요? *
키와 값

### Map에서 데이터를 저장하는 메소드는 무엇인가요? *
put()

### Map에서 특정 키에 할당된 값을 가져오는 메소드는 무엇인가요? *
get()

### Map에서 특정 키와 관련된 키와 데이터를 지우는 메소드는 무엇인가요? *
remove()

### Map에서 키의 목록을 가져오는 메소드는 무엇인가요? *
keySet()

### Map에 저장되어 있는 데이터의 크기를 가져오는 메소드는 무엇인가요? *
size()

### HashMap과 Hashtable 중에서 키나 값에 null을 저장할 수 있는 것은 무엇인가요? *
Hashtable

### HashMap과 Hashtable 중에서 여러 쓰레드에서 동시에 접근해도 문제가 없는 것은 무엇인가요? *
HashMap

### HashMap에서 특정 키가 존재하는지 확인하는 메소드는 무엇인가요? *
containsKey

### 이 장에서 살펴본 클래스 중, 키가 저장되면서 정렬되는 Map에는 어떤 것이 있나요? *
TreeMap

### Properties 클래스는 어떤 클래스를 확장한 것인가요? *
Hashtable

### Properties 클래스의 객체에 있는 데이터를 파일로 저장할 때에는 어떤 메소드들을 사용하면 되나요? *
store()
