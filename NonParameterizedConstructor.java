public class NonParameterizedConstructor {

    static class Pen{
    String color;
    int number;
    String type;

    void write(){
         System.out.println("we can use to write");
    }

    Pen(){
         System.out.println("non parametarized constructor");
    }
    
    void display(){
        System.out.println("color is = "+ this.color +"  number of pen = "+this.number+"   type is = " +this.type);
    }
}




    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color="blue";
        p1.number=4;
        p1.type="boll point";
        p1.write();
        p1.display();


        Pen p2 = new Pen();
        p2.color="red";
        p2.number=2;
        p2.type="ink";
        p2.write();
        p2.display();


    }
}