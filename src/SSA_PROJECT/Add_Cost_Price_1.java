package SSA_PROJECT;
// addding cost price for VM1
public class Add_Cost_Price_1 extends Add_Cost_Price{

	@Override
	public void add_cp(DataStore ds) {
		// TODO Auto-generated method stub
		int x=ds.get_cp();
		x=x+ds.get_temp_v();
		ds.set_cp(x);
	}

}
