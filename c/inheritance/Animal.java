// 1번, Animal 클래스 생성 및 패키지 선언
package c.inheritance;

public class Animal {
    // 2번, 동물의 공통적인 특징
    String name;
    String kind;
    String[] foodType = {"flesh", "plant", "omnivore"}; // 육식(flesh), 초식(plant), 잡식(omnivore)
    int legCount;
    int iq;
    boolean hasWing;
    // 3번, 동물의 공통적인 행위
    public void walk(){

    }
    public void eatFood(){

    }
    public void fly(){
        if(hasWing){

        }
        else {

        }
    }
}
