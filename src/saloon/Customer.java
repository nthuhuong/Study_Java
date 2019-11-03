package saloon;

public class Customer {
    private String name;
    private boolean member;
    private String memberType;

    public Customer(final String name) {
        this.name = name;
        this.member = false;
        this.memberType = "";
    }

    public String getName() {
        return this.name;
    }

    public boolean isMember() {
        return this.member;
    }

    public void setMember(final boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(final String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer [Name = " + this.name + ", Member is " + this.member + ", MemberType" + this.memberType + "]";
    }

    @Override
    public boolean equals(final Object object) {
        if (object == null) return false;

        if (! (object instanceof Customer)) return false;

        final Customer customer = (Customer)object;
        return this.name.equals(customer.name) && this.memberType.equals(customer.memberType) && this.member == customer.member;
    }
}
