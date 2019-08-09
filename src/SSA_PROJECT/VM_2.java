package SSA_PROJECT;
// user actions/ options for the Vending machine 2

public class VM_2 {

    private DataStore d;
    private MDAEFSM m;

    public void Initialize(AbstractFactory af) {
        d = af.GetData_store();
        m = new MDAEFSM();
        m.Initialize(af);
    }

    void CREATE(float p) {
        d.set_temp_p(p);
        m.create();
    }

    void COIN(float v) { //inserting coins for the drinks 
        d.set_temp_v(v);
        if (d.get_cp1() + v >= d.get_price1()) {
            m.coin(1);
        } else {
            m.coin(0);
        }
    }

    void SUGAR() { //chosse sugar
        m.additive(0);
    }

    void CREAM() { //choose addditvie cream
        m.additive(1);
    }

    void COFFEE() { //choose coffee
        d.set_drink_type(3);
        m.dispose_drink();
    }

    void InsertCups(int n) { //insert cups for the drink
        m.insertCups(n);
    }

    void SetPrice(float p) { //setting price for the drink
        d.set_temp_p(p);
        m.set_price();
    }

    void CANCEL() { //cancel the transaction
        m.cancel();
    }

}
