package SSA_PROJECT;

public class StorePrice2 extends Store_price {
// price sotred for VM1

    @Override
    public void StorePrice(DataStore ds) {
        // TODO Auto-generated method stub
        ds.set_price(ds.get_temp_p1());
        System.out.println("Price Stored");
    }

}
