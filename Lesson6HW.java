/**
 * Java1. Homework 6
 *
 * @author Yury Fesechka
 * @version 01 .02.2022
 */

public class Lesson6HW {

    public static void  main (String[] args) {
        Cat cat = new Cat (200);
        Dog dog = new Dog (500, 10);

        IAnimal[] animals ={cat, dog};
        for(IAnimal animal : animals) {
            System.out.println(animal.run(150));
            System.out.println("///////////");
            System.out.println(animal.run(500));
            System.out.println("///////////");
            System.out.println(animal.run(550));
            System.out.println("///////////");
            System.out.println(animal.swim(5));
            System.out.println("///////////");
            System.out.println(animal.swim(15));
            System.out.println("///////////");
        }
    }
}

class Dog extends Animal {
    Dog(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
}

class Cat extends Animal {
    Cat(int runLimit){
        super(runLimit, -1);
    }
}


interface IAnimal{
    String run (int distance);
    String swim (int distance);
}
abstract class Animal implements IAnimal{
    protected int runLimit;
    protected int swimLimit;
    protected String className;
    Animal (int runLimit, int swimLimit){
        this.runLimit =runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
    }
public String getClassName(){
    return className;
}

@Override
public String run (int distance){
    if(distance > runLimit){
        return className +"|" + "Was unable to run" + distance;}
    else
        return className +"|" + "Was able to run" + distance;}

@Override
public String swim (int distance){
    if(distance > swimLimit){
        return className + "|" + "Was unable to swim" + distance;}
    else
        return className + "|" + "Was able to swim" + distance;}

@Override
public String toString(){
        return className + "|RunLimit:" + runLimit + "|" + "SwimLimit:" +swimLimit;
    }
}


