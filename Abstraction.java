public class Abstraction {
    static public abstract class AquaticAnimal{
        abstract void swim();
        abstract void leave();
        void eyes(){
            System.out.println("no of eyes = "+2);
        }
    }
     static public class Fish extends AquaticAnimal{
        void swim(){
            System.out.println("fish can swim");
        }

        void leave(){
            System.out.println("they leave in water");
        }
    
     }
     public static void main(String[] args) {
        Fish f = new Fish();
        AquaticAnimal aq = new Fish();
        System.out.println("Fish ===");
        f.swim();
        f.leave();
        f.eyes();

        System.out.println("AquaticAniaml");
        aq.swim();
        aq.leave();
        aq.eyes();

     }
    
}
