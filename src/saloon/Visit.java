package saloon;


import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(final String name, final Date date) {
        customer = new Customer(name);
        this.date = (Date) date.clone();
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getName() {
        return this.customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(final double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(final double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense(){
        return this.productExpense + this.serviceExpense;
    }

    @Override
    public String toString(){
        return "Visit [Customer = " + this.customer.getName() + ", Date = " + this.date + ", Service = " + this.serviceExpense + ", Product = " + this.productExpense;
    }

    @Override
    public boolean equals(final Object another) {
        if (another == null) return false;

        if (! (another instanceof Visit)) return false;

        final Visit visit = (Visit) another;
        return this.customer.equals(visit.customer) && this.date == visit.date && this.serviceExpense == visit.serviceExpense && this.productExpense == visit.productExpense;
    }
}
