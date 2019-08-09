package SSA_PROJECT;
// Process the output for all the actions by the user
public class OutputProcessor {
private DataStore ds;
int A[]=new int[3];
private Store_price sp;
private Init_Cost_Price ic;
private ReturnCoin rc;
private Add_Cost_Price ac;
private DisposeWithAdd da;
private Initialize_data initializeData;
// creats object necesssary for all the classes
public void Initialize(AbstractFactory af){
    ds = af.GetData_store();

    sp = af.create_storePrice();
    ic=af.create_initCp();
    rc=af.Create_return_coin();
    ac=af.CreateAddCp();
    da=af.createDisposeWithAdd();
    initializeData = af.Create_InitializeData();
  }


public void StorePrice() { //stores the price for given data
	sp.StorePrice(ds);	
}
public void init_cp() { //initializes the cups 
	ic.init_cp(ds);
}
public void returnCoin() { //returns the coin amount mentioned
	rc.returnCoin(ds);
}
public void add_cp() { //add number of cups given
	ac.add_cp(ds);
}
public void dispose_with_add(int A[]) { //disposes the additives for drink based on the choice
	da.dispose_with_add(ds,A);
}
}
