 //object creation


public class Animal {
    int leg;
    int eyes;
    void walk(){
        System.out.println("Animal can walk");
    }

    void eat(){
        System.out.println("animal can eat");
    }

    void display(){
        System.out.println("animal has leg ="+leg);
        System.out.println("Animal has eyes ="+eyes);
    }
    
}

class Oops{
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eyes = 2;
        a1.leg = 4;
        a1.eat();
        a1.display();

    }
}
