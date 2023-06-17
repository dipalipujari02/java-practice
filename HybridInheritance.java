import javax.sound.sampled.SourceDataLine;

public class HybridInheritance {
    static class Animal{
        void walk(){
            System.out.println("Aniaml can walk");
        }
    }
    
    static class Dog extends Animal{
        void sound (){
            System.out.println("dog makes sound");
        }
    }

    static class Cat extends Animal{
        void  eat(){
            System.out.println("cat eat mouse");
        }
    }

    static class Tiger extends Cat{
        void eat (){
            System.out.println("Tiger can eat other animals");
        }
    }
    public static void main(String[] args) {
        Animal a = new Animal();
        a.walk();

        Dog d =new Dog();
        d.sound();

        Cat c =new Cat();
        c.eat();

        Tiger t = new Tiger();
        t.eat();
    }
}
