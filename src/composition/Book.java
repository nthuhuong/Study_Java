package composition;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(final String name, final Author[] authors, final double price) {
        this(name, authors, price, 0);
    }

    public  Book(final String name, final Author authors[], final double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(final int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book [name = " + this.name + ", " + this.toStringArrayAuthors() + ", price = " + this.price + ", qty = " + this.qty + "]";
    }

    private String toStringArrayAuthors() {
        if (this.authors.length == 0) {
            return "";
        }

        String author = this.authors[0].toString();
        for (int i = 1; i < this.authors.length; i++) {
            author += ", " + this.authors[i].toString();
        }

        return author;
    }

    private boolean equalsArrayAuthors(final Author[] authors) {
        if (this.authors.length != authors.length) return false;

        for (int i = 0; i < this.authors.length; i++) {
            if (! this.authors[i].equals(authors[i])) return false;
        }

        return true;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;

        if (! (object instanceof Book)) return false;

        final Book book = (Book) object;
        return book.qty == this.qty && book.price == this.price && this.equalsArrayAuthors(book.authors) && book.name.equals(this.name);
    }

    public String getAuthorNames() {
        if (this.authors.length == 0) {
            return "";
        }

        String authorNames = this.authors[0].getName();
        for (int i = 1; i < this.authors.length; i++) {
            authorNames += ", " + this.authors[i].getName();
        }

        return authorNames;
    }
}
