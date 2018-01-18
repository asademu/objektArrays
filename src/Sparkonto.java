public class Sparkonto extends Konto{
    private float zinssatz;

    public Sparkonto(){
        super();
        zinssatz = 0;
    }

    public Sparkonto(float kapital, float zinssatz){
        super(kapital);
        setZinssatz(zinssatz);
    }

    public void setZinssatz(float zinssatz) {
        this.zinssatz = zinssatz;
    }

    public float getZinssatz() {
        return zinssatz;
    }

    public void verzinsung(){
        float kontostand = getKapital() + getKapital() * getZinssatz() / 100;
        setKapital(kontostand);
        //System.out.printf("%.2f", getKapital());
    }
}
