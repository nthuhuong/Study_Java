package saloon;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("BoBo");
        customer.setMember(true);
        customer.setMemberType("Gold");

        final Visit visit = new Visit(customer.getName(), new Date());
        visit.setServiceExpense(100000);
        visit.setProductExpense(200000);

        final Visit visit1 = new Visit(customer.getName(), new Date());
        visit1.setServiceExpense(100000);
        visit1.setProductExpense(200000);

        if (! customer.isMember()) {
            System.out.println("Total expense must pay: " + visit.getTotalExpense());
            return;
        }

        final double totalPriceProduct = visit.getProductExpense() - visit.getProductExpense() * DiscountRate.getProductDiscountRate(customer.getMemberType());
        final double totalPriceService = visit.getServiceExpense() - visit.getServiceExpense() * DiscountRate.getServiceDiscountRate(customer.getMemberType());

        System.out.println("Total expense must pay: " + (totalPriceProduct + totalPriceService));
        System.out.println(visit.equals(visit1));
    }
}
