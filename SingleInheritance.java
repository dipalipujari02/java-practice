public class SingleInheritance {
    static public class Animal{
        int legs;
        int eyes;

        void sound(){
            System.out.println("animal makes sound");
        }

        void walk(){
            System.out.println("animal cam walk");
        }
        Animal(){

        }

        Animal(int legs,int eyes){
            this.legs=legs;
            this.eyes=eyes;
        }
        void show(){
            System.out.println("no of legs ="+legs);
            System.out.println("no of eyes ="+eyes);
             
        }
    }

    static public class Elephant extends Animal{
        int teeth;
         void display(){
            System.out.println("no of theath ="+teeth);
         }
        }

        public static void main(String[] args) {
            Elephant e = new Elephant();
            System.out.println("Elephant information");
            e.eyes=2;
            e.legs=4;
            e.teeth=2;
            e.display();
            e.show();

            System.out.println("Animal class info");
            Animal a1 =new Animal(4, 2);
            a1.show();
            
        }
    
}
