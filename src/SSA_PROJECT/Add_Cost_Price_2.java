package SSA_PROJECT;
//adding cost for  VM2

public class Add_Cost_Price_2 extends Add_Cost_Price{
    @Override
	public void add_cp(DataStore ds) {
		// TODO Auto-generated method stub
		float x=ds.get_cp1();
		x=x+ds.get_temp_v1();
		ds.set_cp(x);
	}

}
