package SSA_PROJECT;

public class S2 extends State {

    @Override
    public void create() {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S2 state");
    }

    // state change after inserting coin
    @Override
    public void coin(int f) {
        // TODO Auto-generated method stub
        if (f == 0) {
            op.add_cp(); // add cups
        }
        if (f == 1) {
            op.add_cp();
            m.setState(3);//state change to 3
        }
    }

    //state change action after insering card
    @Override
    public void card() {
        // TODO Auto-generated method stub
        op.init_cp();
        m.A[0] = 0;
        m.A[1] = 0;
        m.A[2] = 0;
        m.setState(3); //state change to 3
    }

    @Override
    public void additive(int a) {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S2 state");
    }

    @Override
    public void DisposeDrink() {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S2 state");
    }

    @Override
    public void Insert_Cups(int n) {
        // TODO Auto-generated method stub
        if (n > 0) {
            m.k = m.k + n; // if cups are available then add cups fr the drink

        }

    }

    @Override
    public void SetPrice() {
        // TODO Auto-generated method stub
        op.StorePrice();
    }

    @Override
    public void cancel() {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S2 state");
    }

}
