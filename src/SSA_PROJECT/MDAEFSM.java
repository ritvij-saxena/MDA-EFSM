package SSA_PROJECT;

public class MDAEFSM {

    int k = 0;
    int A[] = new int[3];
    private State[] states;  // states for different process
    private State st;
    private int m;

    public void Initialize(AbstractFactory af) {
        OutputProcessor op = new OutputProcessor();
        op.Initialize(af);
        states = new State[4];
        states[0] = new S0();
        states[1] = new S1();
        states[2] = new S2();
        states[3] = new S3();
        st = states[0];
        for (State s : states) {
            s.setMDAEFSM(this);
            s.setOP(op);
        }
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
    //inital phase 

    public void create() {
        st.create();
    }
    // state after the coin insertion

    public void coin(int f) {
        // for coin 
        st.coin(f);
    }
    // function after thecard is inserted

    public void card() {
        st.card();
    }
    //choice of additive

    public void additive(int a) {
        st.additive(a);
    }
    // dispose the required drink 

    public void dispose_drink() {
        st.DisposeDrink();
    }
    //insert cups

    public void insertCups(int n) {
        st.Insert_Cups(n);
    }
    //set the price given

    public void set_price() {
        st.SetPrice();
    }
    //cance transaction

    public void cancel() {
        st.cancel();
    }
    // states are assigned here. 

    public void setState(int s) {
        st = states[s];
    }
}
