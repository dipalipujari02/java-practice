public class PolyCompiletime {
    static class Student{
        String name;
        int std;
        int age;

        void displayinfo(){
            System.out.println( this.name=name);
         
        }

        void displayinfo(String name,int std){
           System.out.println( this.name=name);
           System.out.println( this.std=std);
        }

        int displayinfo(int age){
            System.out.println(age);
           return this.age=age;
        }

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayinfo("digu", 10);
        s1.displayinfo(16);
    }
    
}
