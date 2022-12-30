package pets;

import pets.cats.Rex;
import static pets.cats.Rex.*;
import pets.dogs.*;
public class Test {
    public static void main(String[] args){
        //Don't have to reference class name here because speak() is a static method
        speak();
        //Instantiated new class object and executed method
        new Yorkie().speak();
        //Don't have to reference class here because type is a static variable
        System.out.println(type);
        //Instantiated class object to use nonstatic variables and methods
        //Rex is a class within pets.cats package, so only had to provide the class name
        Rex toby = new Rex();
        toby.setWeight(8);
        System.out.println(toby.weight);
    }
}
