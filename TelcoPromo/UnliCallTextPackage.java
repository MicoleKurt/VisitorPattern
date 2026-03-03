public class UnliCallTextPackage implements UnliCallOffer {

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (unliCallText) {
            return telcoName + " offers unlimited calls and texts.";
        } else {
            return telcoName + " does NOT offer unlimited calls and texts. Charges apply per use.";
        }
    }

    @Override
    public void visit(Telco telco) {
        System.out.println(showUnliCallsTextOffer(telco.getTelcoName(), telco.getUnliCallText()));
    }
}