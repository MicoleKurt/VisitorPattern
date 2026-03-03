public class TelcoAllowance implements UsagePromo {

    @Override
    public String showAllowance(String telcoName, double promoPrice) {
        return telcoName + " promo price is ₱" + promoPrice + " per month.";
    }

    @Override
    public void visit(Telco telco) {
        System.out.println(showAllowance(telco.getTelcoName(), telco.getPromoPrice()));
    }
}