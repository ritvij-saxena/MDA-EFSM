package SSA_PROJECT;

public class returnCoin1 extends ReturnCoin {
// Returns the change or cancelled transaction coins

    @Override
    public void returnCoin(DataStore ds) {
        // TODO Auto-generated method stub
        int x = ds.get_cp();
        ds.set_cp(0);
        System.out.println("Amount returned " + x + " ");
    }

}
