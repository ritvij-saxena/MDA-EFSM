package SSA_PROJECT;

public class InitializeData1 extends Initialize_data{
// this sets prices and the drink types for vending machine 1 
	@Override
	public void InitializeData(DataStore ds) {
		// TODO Auto-generated method stub
		ds.set_price(0);
		ds.set_drink_type(0);
	}

}
