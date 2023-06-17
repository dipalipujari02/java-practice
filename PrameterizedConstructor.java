public class PrameterizedConstructor {
    static class Car{
        String name;
        String color;

        public Car(String name,String color){
            this.name=name;
            this.color=color;
        }

        void printinfo(){
            System.out.println("name is "+name);
            System.out.println("color is "+color);
        }
    }



    public static void main(String[] args) {
        Car c1 = new Car ("Mahindra", "Red");
        c1.printinfo();

    
}
}