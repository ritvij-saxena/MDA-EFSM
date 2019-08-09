package SSA_PROJECT;

public class Dispose_with_additive1 extends DisposeWithAdd{
// Abstract function from the super class for disposing additives of own choice
    
	@Override
	public void dispose_with_add(DataStore ds, int[] A) {
		// TODO Auto-generated method stub
		int x=ds.get_drink_type();
		if(x==1) {
			System.out.println("Tea is disposed"); 
			ds.set_cp(0);
			if(A[0]==1) {
			System.out.println("Sugar is disposed"); //sugar is the additive here for A=0
		}
		if(A[1]==1)
			System.out.println("Cream is disposed"); //cream is the additive here for A=1
		}
		if(x==2) {
			System.out.println("Chocolate is disposed");
			ds.set_cp(0);
			if(A[0]==1) {
				System.out.println("Sugar is disposed"); //sugar is the additive here for A=0
			}
			if(A[1]==1)
				System.out.println("Cream is disposed"); //cream is the additive here for A=1
		}
	}

}
