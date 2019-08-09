package SSA_PROJECT;

public class ConcreteFactory1 extends AbstractFactory{

	@Override
	public Store_price create_storePrice() {
		// returns the  object for storeprice for the VM1
		return new StorePrice1();
	}

	@Override
        
	public Init_Cost_Price create_initCp() {
		// object for initating the cups for VM1
		return new Init_Cost_Price_1();
	}

	@Override
        
	public ReturnCoin Create_return_coin() {
		//returns the object for coin return function
		return new returnCoin1();
	}

	@Override
    
	public Add_Cost_Price CreateAddCp() {
		//return the object for adding cups function
		return new Add_Cost_Price_1();
	}

	@Override
       
	public DisposeWithAdd createDisposeWithAdd() {
		 // returns the new object for disposing with additives function
		return new Dispose_with_additive1();
	}

	@Override
        
	public Initialize_data Create_InitializeData() {
		//this returns the object for initializing the necessary data
		return new InitializeData1();
	}

	@Override
       
	public DataStore GetData_store() {
		 //returns data store object
		if(datastore == null){
		      datastore = new Datastore_1();
		    }

		    return datastore;
		  }
	}


