package behavioral_pattern.chain_of_responsibility_pattern.example.general;


public class PurchaseRequestHandler {

    public void sendRequestToDirector(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            // 主任审批5万元以下
            handleByDirector(request);
        } else if (request.getAmount() < 100000) {
            //副董事长审批5万元至10万元
            handleByVicePresident(request);
        } else if (request.getAmount() < 500000) {
            //董事长审批10万元至50万元
            handleByPresident(request);
        } else {
            //50万元及以上董事会讨论决定
            handleByCongress(request);
        }
    }

    private void handleByDirector(PurchaseRequest request){

    }

    private void handleByVicePresident(PurchaseRequest request){

    }

    private void handleByPresident(PurchaseRequest request){

    }

    private void handleByCongress(PurchaseRequest request){

    }

}
