public class Konto {
    private float kapital;

    public Konto(){
        kapital = 0;
    }

    public Konto(float kapital){
        setKapital(kapital);
    }

    public void setKapital(float kapital) {
        if (kapital >= 0){
            this.kapital = kapital;
        }
        else {
            System.out.println("Kein Dispo vorhanden");
        }
    }

    public float getKapital() {
        return kapital;
    }

    public void transaktion(float geld){
        setKapital(getKapital() + geld);
    }
}
