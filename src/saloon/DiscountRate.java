package saloon;

public final class DiscountRate {
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscount = 0.1;
//    private static double productDiscountPremium = 0.1;
//    private static double productDiscountGold = 0.1;
//    private static double productDiscountSilver = 0.1;

    private DiscountRate() {

    }

    public static double getServiceDiscountRate(String type) {
        if (type == null) return 0.0;

        if (type.equals("Premium")) {
            return DiscountRate.serviceDiscountPremium;
        }

        if (type.equals("Gold")) {
            return DiscountRate.serviceDiscountGold;
        }

        if (type.equals("Silver")) {
            return DiscountRate.serviceDiscountSilver;
        }

        return 0.0;
    }

    public static double getProductDiscountRate(String type) {
        if (type == null) return 0.0;

        if (type.equals("Premium") || type.equals("Gold") || type.equals("Silver")) {
            return DiscountRate.productDiscount;
        }

        return 0.0;
    }
}
