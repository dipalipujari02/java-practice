public class Encapsulation {
    static class BankAccount{
        private int accNo;
        private int pass;
        private String name;

        public int getAccNo() {
            return accNo;
        }
        public void setAccNo(int accNo) {
            this.accNo = accNo;
        }
        public int getPass() {
            return pass;
        }
        public void setPass(int pass) {
            this.pass = pass;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        BankAccount acc =new BankAccount();
        System.out.println("Bank details");
        acc.setName("aishu");
        acc.setAccNo(365281782);
        acc.setPass(12344321);

        System.out.println("name is ="+acc.getName());
        System.out.println("Account no is ="+acc.getAccNo());
        System.out.println("password is = "+acc.getPass());
    }
    
}
