public class PrintAccountDemo {

    public static void main(String[] args) {
        PrintAccount alice = new PrintAccount("Alice Smith", 0.75, 10.00);
        PrintAccount brian = new PrintAccount("Brian Jones", 1.20, 3.00);

        alice.printPages(6);
        brian.printPages(5);
        brian.printPages(2);

        alice.addFunds(20.00);
        brian.addFunds(10.00);
        alice.addFunds(-5.00);
        brian.addFunds(0.00);

        alice.printPages(0);
        brian.printPages(-3);

        System.out.println(alice.getStudentName() + " - cost per page: " + alice.getCostPerPage()
                + ", balance: " + alice.getBalance() + ", total spent: " + alice.getTotalSpent());
        System.out.println(brian.getStudentName() + " - cost per page: " + brian.getCostPerPage()
                + ", balance: " + brian.getBalance() + ", total spent: " + brian.getTotalSpent());

        System.out.println("Refunded to " + alice.getStudentName() + ": " + alice.refundBalance());
        System.out.println("Refunded to " + brian.getStudentName() + ": " + brian.refundBalance());
    }
}
