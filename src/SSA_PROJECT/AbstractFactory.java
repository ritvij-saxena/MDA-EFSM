package SSA_PROJECT;
// Obect for Datastore class
// Abstract functions for the classes mentioned below  
public abstract class AbstractFactory {
	DataStore datastore;       
	public abstract Store_price create_storePrice();
	public abstract Init_Cost_Price create_initCp();
	public abstract ReturnCoin Create_return_coin();
	public abstract Add_Cost_Price CreateAddCp();
	public abstract DisposeWithAdd createDisposeWithAdd();
        public abstract Initialize_data Create_InitializeData();
	public abstract DataStore GetData_store();
}
