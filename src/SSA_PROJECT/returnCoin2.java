package SSA_PROJECT;

public class returnCoin2 extends ReturnCoin {
// Returns the change or cancelled transaction coins

    @Override
    public void returnCoin(DataStore ds) {
        // TODO Auto-generated method stub
        float x = ds.get_cp1();
        ds.set_cp(0);
        System.out.println("Amount returned " + x + " ");
    }

}
