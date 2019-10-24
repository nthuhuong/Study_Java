package UML;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
       this(id, name, 0);
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int credit (int amount) {
        return this.balance += amount;
    }

    public int debit (int amount) {
        if ( amount <= this.balance ) {
           return this.balance -= amount;
        }

        System.out.println("Amount exceeded balance");
        return this.balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount > this.balance ) {
            System.out.println("Amount exceeded balance");
            return this.balance;
        }

        another.balance += amount;
        return this.balance -= amount;
    }

    public String toString() {
        return "Account [id = " + this.id + ", name = " + this.name + ", balance = " + this.balance + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (! (obj instanceof Account)) return false;

        Account account = (Account) obj;
        return this.balance == account.balance && this.name.equals(account.name) && this.id.equals(account.id);
    }
}
