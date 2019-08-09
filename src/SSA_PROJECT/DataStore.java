package SSA_PROJECT;
public abstract class DataStore {
    // Abstract functions for all the getters and setters 
    //these functions are to get necessary details from the users and data stored.
	public abstract int get_drink_type();
	public abstract void set_drink_type(int x);
	
	public abstract int get_temp_p();
	public abstract void set_temp_p(int x);
	public abstract int get_temp_v();
	public abstract void set_temp_v(int x);
	public abstract int get_price();
	public abstract void set_price(int x);
	public abstract int get_cp();
	public abstract void set_cp(int x);
	
	
	public abstract float get_temp_p1();
	public abstract void set_temp_p(float x);
	public abstract float get_price1();
	public abstract void set_price(float x);
	public abstract float get_cp1();
	public abstract void set_cp(float x);
	public abstract float get_temp_v1();
	public abstract void set_temp_v(float x);
}
