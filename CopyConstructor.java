public class CopyConstructor {
    static class Student{
        String name;
        int age;

        public Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
        }

        Student(){

        }

        void show(){
            System.out.println("name is = "+name);
            System.out.println("age is = "+age);
        }
 }

 public static void main(String[] args) {
    Student s1 = new Student();
    s1.name="sanu";
    s1.age=22;
    s1.show();

    Student s2 = new Student(s1);
    s2.show();
 }
    
}
