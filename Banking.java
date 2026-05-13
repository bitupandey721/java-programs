/******************************************************************************

class bank, inside bank method - intrest rate. which prints - intrest.
2nd class - SBI bank override intrest- and print sbi interst rate is 10%
3rd class - HDFC bank - override same method and print hdfc intrest rate is 12%
another class ICIC bank - override same method - and print 14% intrest.

create object of ll 3 metode, thenm print all thee class.


*******************************************************************************/
class Bank {

    // Parent class method
    void interestRate() {
        System.out.println("Interest Rate");
    }
}
class SBI extends Bank {

    // Overriding method
    void interestRate() {
        System.out.println("SBI interest rate is 10%");
    }
}

class HDFC extends Bank {

    // Overriding method
    void interestRate() {
        System.out.println("HDFC interest rate is 12%");
    }
}

class ICICI extends Bank {

    // Overriding method
    void interestRate() {
        System.out.println("ICICI interest rate is 14%");
    }
}

public class Banking {
    public static void main(String[] args) {

        // Creating objects
        SBI s1 = new SBI();
        HDFC h1 = new HDFC();
        ICICI i1 = new ICICI();

        s1.interestRate();
        h1.interestRate();
        i1.interestRate();
    }
}
