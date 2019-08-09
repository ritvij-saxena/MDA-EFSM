package SSA_PROJECT;

public class S1 extends State {

    @Override
    public void create() {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S1 state");

    }

    @Override
    public void coin(int f) {
        // TODO Auto-generated method stub
        op.returnCoin();
    }

    @Override
    public void card() {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S1 state");
    }

    @Override
    public void additive(int a) {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S1 state");
    }

    @Override
    public void DisposeDrink() {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S1 state");
    }

    // state change after inserting the cups. 
    @Override
    public void Insert_Cups(int n) {
        // TODO Auto-generated method stub
        if (n > 0) {
            m.k = n;
            op.init_cp();
            m.setState(2); //state change to 2
        }
    }

    @Override
    public void SetPrice() {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S1 state");
    }

    @Override
    public void cancel() {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S1 state");
    }

}
