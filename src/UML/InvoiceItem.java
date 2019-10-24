package UML;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getID() {
        return this.id;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return this.unitPrice * this.qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem [id = " + this.id + ", desc = " + this.desc + ", qty = " + this.qty + ", unitPrice = " + this.unitPrice + "]";
    }

    @Override
    public boolean equals (Object other) {
        if (other == null) return false;

        if (! (other instanceof InvoiceItem)) return false;

        final InvoiceItem invoiceItem = (InvoiceItem) other;
        return this.unitPrice == invoiceItem.unitPrice && this.qty == invoiceItem.qty && this.desc == invoiceItem.desc && this.id == invoiceItem.id ;
    }
}
