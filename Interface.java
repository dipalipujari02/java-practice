public class Interface {
     interface Bird{
        void fly();
        void eat();
    }
    
    static public class crow implements Bird{
        public void fly(){
            System.out.println("crow can fly");
        }
        public void eat(){
            System.out.println("crow can eat");
        }
        void see(){
            System.out.println("commanly see in india");
        }
    }
   
    public static void main(String[] args) {
        crow c = new crow();
        c.fly();
        c.eat();
        c.see();
    }
    
}
