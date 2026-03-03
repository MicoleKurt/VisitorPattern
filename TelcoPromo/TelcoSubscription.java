public interface TelcoSubscription {
    String getTelcoName();
    double getPromoPrice();
    boolean getUnliCallText();
    void accept(UsagePromo visitor);
    void accept(UnliCallOffer visitor);
}