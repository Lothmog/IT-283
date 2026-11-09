public class PrintAccount {

    private String studentName;
    private double costPerPage;
    private double balance;
    private double totalSpent;

    public PrintAccount(String studentName, double costPerPage, double balance) {
        this.studentName = studentName;
        this.costPerPage = costPerPage;
        this.balance = balance;
        this.totalSpent = 0.0;
    }

    public void addFunds(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit: amount must be greater than zero.");
            return;
        }
        balance += amount;
        System.out.printf("Deposited %.2f. New balance: %.2f%n", amount, balance);
    }

    public void printPages(int pages) {
        if (pages <= 0) {
            System.out.println("Invalid page count: must be greater than zero.");
            return;
        }

        double cost = pages * costPerPage;
        if (cost > balance) {
            System.out.printf("Insufficient funds: %d page(s) cost %.2f but balance is %.2f%n",
                    pages, cost, balance);
            return;
        }

        balance -= cost;
        totalSpent += cost;
        System.out.printf("Printed %d page(s). Cost: %.2f. Remaining balance: %.2f%n",
                pages, cost, balance);
    }

    public double refundBalance() {
        double refunded = balance;
        balance = 0.0;
        return refunded;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getCostPerPage() {
        return costPerPage;
    }

    public double getBalance() {
        return balance;
    }

    public double getTotalSpent() {
        return totalSpent;
    }
}
