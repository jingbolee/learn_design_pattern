package behavioral_pattern.chain_of_responsibility_pattern.example.pattern;

/**
 * 主任
 */
public class DirectHandler extends PurchaseRequestHandler {

    public DirectHandler(String name) {
        super(name);
    }

    @Override
    public void handleRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            System.out.println("主任：" + this.name + "审批采购单："
                    + request.getNumber() + "，金额：" + request.getAmount()
                    + "元，采购目的：" + request.getPurpose() + "。");
        } else {
            successor.handleRequest(request);
        }
    }
}
