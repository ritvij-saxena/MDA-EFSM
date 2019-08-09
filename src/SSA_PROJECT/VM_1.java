package SSA_PROJECT;
// user actions/ options for the Vending machine 1

public class VM_1 {

    private DataStore d;
    private MDAEFSM m;

    public void Initialize(AbstractFactory af) {
        d = af.GetData_store();
        m = new MDAEFSM();
        m.Initialize(af);
    }

    void create(int p) {
        d.set_temp_v(p);
        m.create();
    }

    void coin(int v) { //inserting coins
        d.set_temp_v(v);
        //System.out.println("The cp value is "+d.get_cp());
        if (d.get_cp() + v >= d.get_price()) {
            m.coin(1);
        } //d.set_cp(d.get_cp()+v);
        else {
            m.coin(0);
        }
        //d.set_cp(d.get_cp()+v);
        System.out.println("The cp value is " + d.get_cp());
    }

    void card(float x) { //inserting card
        if (x >= d.get_price()) {
            m.card();
        }
    }

    void sugar() { //choice of sugar
        m.additive(0);
    }

    void tea() { //tea choice
        d.set_drink_type(1);;
        m.dispose_drink();
    }

    void chocolate() { //choosing chocalate
        d.set_drink_type(2);
        m.dispose_drink();
    }

    void insert_cups(int n) { //insert the number of cups wanted
        m.insertCups(n);
        System.out.println("Number of cups " + m.k);
    }

    void set_price(int p) { //setting price for th drinks needed
        d.set_temp_p(p);
        m.set_price();
    }

    void cancel() { //cancel the transaction
        m.cancel();
    }

}
