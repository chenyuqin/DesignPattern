package midiator_pattern;

public class Mediator extends AbstractMediator {
    @Override
    public void execute(String str, Object... objects) {
        if(str.equalsIgnoreCase("purchase.buy")){
            this.buyComputer((Integer)objects[0]);
        } else if(str.equalsIgnoreCase("sale.sell")){
            this.sellComputer((Integer)objects[0]);
        } else if(str.equalsIgnoreCase("sale.offSell")){
            this.offSell();
        } else if(str.equalsIgnoreCase("stock.clear")){
            this.clearStock();
        }
    }

    private void buyComputer(int number){
        int saleStatus = super.sale.getSaleStatus();
        if(saleStatus > 80){
            System.out.println("采购IBM电脑" + number + "台");
            super.stock.increase(number);
        } else {
            int buyNumber = number / 2;
            super.stock.increase(buyNumber);
            System.out.println("采购IBM电脑" + buyNumber + "台");
        }
    }

    private void sellComputer(int number){
        if(super.stock.getStockNumber() < number){
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSell(){
        System.out.println("折价销售IBM电脑" + super.stock.getStockNumber() + "台");
    }

    private void clearStock(){
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}
