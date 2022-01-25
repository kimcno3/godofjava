package c.inheritance;

public class Cat extends Animal {
    String color;
    String breed;
    int weight;
    int height;

    public void move(){
        System.out.println("The Cat is moving");
    }
    public void eatFood(){
        System.out.println("The Cat is eating food");
    }
}
