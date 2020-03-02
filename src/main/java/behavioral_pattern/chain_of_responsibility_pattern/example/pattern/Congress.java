package behavioral_pattern.chain_of_responsibility_pattern.example.pattern;

public class Congress extends PurchaseRequestHandler {
    public Congress(String name) {
        super(name);
    }

    @Override
    public void handleRequest(PurchaseRequest request) {
        System.out.println("董事会：" + this.name + "审批采购单："
                + request.getNumber() + "，金额：" + request.getAmount()
                + "元，采购目的：" + request.getPurpose() + "。");
    }
}
