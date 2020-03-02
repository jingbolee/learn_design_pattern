package behavioral_pattern.chain_of_responsibility_pattern.example.pattern;

public class President extends PurchaseRequestHandler {

    public President(String name) {
        super(name);
    }

    @Override
    public void handleRequest(PurchaseRequest request) {
        if (request.getAmount() < 500000) {
            System.out.println("董事长：" + this.name + "审批采购单："
                    + request.getNumber() + "，金额：" + request.getAmount()
                    + "元，采购目的：" + request.getPurpose() + "。");
        } else {
            successor.handleRequest(request);
        }
    }
}
