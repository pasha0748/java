public class lab_8_6 {
    public static void main(String[] args) {
        SavingAccountClass saver1 = new SavingAccountClass(4, 2000);
        SavingAccountClass saver2 = new SavingAccountClass(4, 3000);

        System.out.println("Saver 1 monthly interest: " + saver1.getSavingBalance());
        System.out.println("Saver 2 monthly interest: " + saver2.getSavingBalance());

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Saver 1 monthly interest: " + saver1.getSavingBalance());
        System.out.println("Saver 2 monthly interest: " + saver2.getSavingBalance());

        SavingAccountClass.modifyInterestRate(5);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Saver 1 monthly interest: " + saver1.getSavingBalance());
        System.out.println("Saver 2 monthly interest: " + saver2.getSavingBalance());
    }

}

class SavingAccountClass {

    static double annualInterestRate;
    private double savingBalance;

    SavingAccountClass(double annualInterestRate, double savingBalance) {
        if (annualInterestRate > 0 && savingBalance > 0) {
            SavingAccountClass.annualInterestRate = annualInterestRate;
            this.savingBalance = savingBalance;
        }
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        if (savingBalance > 0) {
            this.savingBalance = savingBalance;
        } else {
            System.out.println("Wrong saving balance");
        }
    }

    public void calculateMonthlyInterest() {
        savingBalance += (savingBalance * annualInterestRate) / 12;
    }

    static void modifyInterestRate(double value) {
        SavingAccountClass.annualInterestRate = value;
    }
}
