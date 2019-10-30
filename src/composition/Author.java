package composition;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(final String name, final String email, final char gender) {
        if (gender != 'm' && gender != 'f') {
            throw new IllegalArgumentException("Gender is not valid!");
        }

        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public char getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return "Author [name = " + this.name + ", email = " + this.email + ", gender = " + this.gender + "]";
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;

        if (! (other instanceof Author)) return false;

        final Author author = (Author) other;
        return this.gender == author.gender && this.email.equals(author.email) && this.name.equals(author.name);
    }

}


