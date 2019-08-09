package SSA_PROJECT;
// this is responsible for state change based on te user input actions

public abstract class State {

    OutputProcessor op;
    MDAEFSM m;

    public abstract void create();

    public abstract void coin(int f);

    public abstract void card();

    public abstract void additive(int a);

    public abstract void DisposeDrink();

    public abstract void Insert_Cups(int n);

    public abstract void SetPrice();

    public abstract void cancel();

    public void setOP(OutputProcessor op) {
        this.op = op;
    }

    public void setMDAEFSM(MDAEFSM m) {
        this.m = m;
    }

}
