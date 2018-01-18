public class Konto {
    private float kapital;

    public Konto(){
        kapital = 0;
    }

    public Konto(float kapital){
        setKapital(kapital);
    }

    public void setKapital(float kapital) {
        this.kapital = kapital;
    }

    public float getKapital() {
        return kapital;
    }

    public void transaktion(float geld){
        setKapital(getKapital() + geld);
    }
}
