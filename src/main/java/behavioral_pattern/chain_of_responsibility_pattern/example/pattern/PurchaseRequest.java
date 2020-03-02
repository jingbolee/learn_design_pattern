package behavioral_pattern.chain_of_responsibility_pattern.example.pattern;

public class PurchaseRequest {

    private int amount;
    private String purpose;
    private int number;

    public PurchaseRequest(int amount, String purpose, int number) {
        this.amount = amount;
        this.purpose = purpose;
        this.number = number;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
