package SSA_PROJECT;

public class StorePrice1 extends Store_price {
// price sotred for VM1 

    @Override
    public void StorePrice(DataStore ds) {
        // TODO Auto-generated method stub
        ds.set_price(ds.get_temp_v());
        System.out.println("Price Stored");
    }

}
