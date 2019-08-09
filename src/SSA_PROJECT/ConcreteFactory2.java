package SSA_PROJECT;

public class ConcreteFactory2 extends AbstractFactory {

    @Override

    public Store_price create_storePrice() {
        // retruns the  object for storeprice for the VM1
        return new StorePrice2();
    }

    @Override

    public Init_Cost_Price create_initCp() {
        // object for initating the cups for VM1
        return new Init_Cost_Price_2();
    }

    @Override
    public ReturnCoin Create_return_coin() {
        //returns the object for calling return function

        return new returnCoin2();
    }

    @Override

    public Add_Cost_Price CreateAddCp() {
        //return the object for adding cups function
        return new Add_Cost_Price_2();
    }

    @Override

    public DisposeWithAdd createDisposeWithAdd() {
        // returns the new object for disposing with additives function
        return new Dispose_with_additive2();
    }

    @Override

    public Initialize_data Create_InitializeData() {
        //this returns the object for initializing the necessary data
        return new InitializeData2();
    }

    @Override

    public DataStore GetData_store() {
        //returns data store object
        if (datastore == null) {
            datastore = new DataStore_2();
        }

        return datastore;
    }

}
