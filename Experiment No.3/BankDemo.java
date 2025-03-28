// Parent class: BankAccount
class BankDemo {
    double balance = 0; 

    
    void deposit(double amount) {
        balance += amount;
class BankAccount {
    double balance = 0;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class SavingsAccount extends BankAccount {
    // Overriding withdraw method
    @Override
    void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawn: Rs " + amount);
        } else {
            System.out.println("Cannot withdraw! Minimum balance of Rs 100 required.");
        }
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();

        acc.deposit(500);   // Depositing Rs 500
        acc.withdraw(450);  // Should work (Remaining: Rs 50, ERROR)
        acc.withdraw(300);  // Should fail (Rs 50 < Rs 100 minimum)
    }
}

        System.out.println("Deposited: rs " + amount);
    }


    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: rs " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class SavingsAccount extends BankAccount {
    void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawn: rs" + amount);
        } else {
            System.out.println("Cannot withdraw! Minimum balance of rs 100 required.");
        }
    }
};

public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();
        acc.deposit(500);
        acc.withdraw(450); 
        acc.withdraw(300); 
    }
}
