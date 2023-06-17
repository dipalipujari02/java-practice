public class PolyRuntime {
    static class Notebook{
        int pages;
        String size;

        void seeinfo(){
            System.out.println("pages "+pages);
            System.out.println("size "+size);
        }

        void write(){
            System.out.println("used for write");
        }
    }

    static class Brand extends Notebook{
        int no;
        String brandname ;
        void write(){
            System.out.println("used to make note");
            System.out.println("number of notebook "+no);
            System.out.println("brand name is "+brandname);
        }
    }


    public static void main(String[] args) {
        Notebook n1 = new Notebook();
        n1.pages = 300;
        n1.size="a4";
        n1.seeinfo();

        Brand b = new Brand();
        b.no=12;
        b.brandname="classmate";
        b.write();
        
    }
    
}
