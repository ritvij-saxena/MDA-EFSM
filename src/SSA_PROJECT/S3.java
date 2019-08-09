package SSA_PROJECT;

public class S3 extends State {

    @Override
    public void create() {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S3 state");
    }

    @Override
    public void coin(int f) {
        // TODO Auto-generated method stub
        op.returnCoin(); // returns the coin change/cancelled transaction
    }

    @Override
    public void card() {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S3 state");
    }

     //adding extras for the drinks... 
    @Override
   
    public void additive(int a) {
        // TODO Auto-generated method stub
        if (m.A[a] == 0) {
            m.A[a] = 1;

        } else {
            m.A[a] = 0;
        }
        System.out.println(m.A[a]);
    }

     //state changes after disposing the drink with or without additvies
    @Override
   
    public void DisposeDrink() {
        // TODO Auto-generated method stub
        if (m.k > 1) {
            op.dispose_with_add(m.A);
            m.k = m.k - 1;
            m.setState(2);  //state changed to 2
        } else {
            op.dispose_with_add(m.A);
            m.k = m.k - 1;
            m.setState(1); //state changed to 1
        }
    }

    @Override
    public void Insert_Cups(int n) {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S3 state");
    }

    @Override
    public void SetPrice() {
        // TODO Auto-generated method stub
        System.out.println("Cannot perform the operation in S3 state");
    }

     //cancelling the transaction/drinks 
    @Override
   
    public void cancel() {
        // TODO Auto-generated method stub
        op.returnCoin();
        op.init_cp();
        m.setState(2);
    }

}
