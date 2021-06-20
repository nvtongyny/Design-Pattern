public class StockCommon extends AStockPrice{
    public StockCommon(String code) {
        super(code);
    }

    @Override
    protected void notifyHolder() {
        System.out.println("��ͨ��Ʊ������-" + code + ":" +price);
        for (IStockHolder ish : stockHolderList) {
            ish.update(this);
        }
        price2 = price;
    }
}