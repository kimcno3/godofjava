
package c.inheritance;

public class Animal {
    String name;
    String kind;
    String foodType;
    int legCount;
    int iq;
    boolean hasWing;
    // refactoring
    String color;
    int weight;
    int height;
    public void move(){
        System.out.println("This is Animal method - move()");
    }
    public void eatFood(){
        System.out.println("This is Animal method - eatFood()");
    }
}
