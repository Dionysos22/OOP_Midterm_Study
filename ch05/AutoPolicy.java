package ch05;

/**
 * Case study fikri: AutoPolicy (String verisiyle çalışma + switch).
 *
 * Bu, "nesne durumunu" (policyNumber, state) tutan basit bir sınıf.
 */
public class AutoPolicy {
    private final int accountNumber;
    private final String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        setState(state);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        // örnek basit doğrulama: null olmasın, büyük harfe çevir.
        if (state == null) {
            this.state = "";
        } else {
            this.state = state.toUpperCase();
        }
    }

    public boolean isNoFaultState() {
        /*
         * String ile switch:
         * "no-fault" (örnek) eyalet listesi. (Slaytlardaki örnek fikrine uygun.)
         */
        switch (state) {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                return true;
            default:
                return false;
        }
    }
}

