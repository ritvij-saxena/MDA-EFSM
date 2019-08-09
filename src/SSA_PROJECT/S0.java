package SSA_PROJECT;
// State change to 1 

public class S0 extends State {

    @Override
    public void create() {
        // TODO Auto-generated method stub
        op.StorePrice();// obtains the price for the chosen options
        System.out.println("In SO");
        //m.k=0;
        //m.setM(1);
        m.setState(1); // State change to 1 

    }

    @Override
    public void coin(int f) {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S0 state");
    }

    @Override
    public void card() {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S0 state");
    }

    @Override
    public void additive(int a) {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S0 state");
    }

    @Override
    public void DisposeDrink() {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S0 state");
    }

    @Override
    public void Insert_Cups(int n) {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S0 state");
    }

    @Override
    public void SetPrice() {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S0 state");
    }

    @Override
    public void cancel() {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S0 state");
    }

}
