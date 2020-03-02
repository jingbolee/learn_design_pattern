package behavioral_pattern.chain_of_responsibility_pattern.example.pattern;

public class Client {

    public static void main(String[] args) {
        PurchaseRequestHandler zhangwj = new DirectHandler("张无忌");
        PurchaseRequestHandler yangg = new VicePresident("杨过");
        PurchaseRequestHandler guoj = new President("郭靖");
        PurchaseRequestHandler meets= new Congress("董事会");


        zhangwj.setSuccessor(yangg);
        yangg.setSuccessor(guoj);
        guoj.setSuccessor(meets);


        PurchaseRequest request = new PurchaseRequest(1000,"购买倚天剑",1);
        PurchaseRequest request1 = new PurchaseRequest(12000,"购买《葵花宝典》",1);
        PurchaseRequest request2 = new PurchaseRequest(50000,"购买《金刚经》",1);
        PurchaseRequest request3 = new PurchaseRequest(1101000,"购买乔峰",1);
        PurchaseRequest request4 = new PurchaseRequest(100009,"购买桃花岛",1);

        zhangwj.handleRequest(request);
        zhangwj.handleRequest(request1);
        zhangwj.handleRequest(request2);
        zhangwj.handleRequest(request4);
        zhangwj.handleRequest(request3);
    }
}
