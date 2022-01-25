package c.inheritance;

public class Dog extends Animal {
    String color;
    String breed;
    int weight;
    int height;

    public void move(){
        System.out.println("The Dog is moving");
    }
    public void eatFood(){
        System.out.println("The Dog is eating food");
    }
}
