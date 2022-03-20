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