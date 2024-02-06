public class Mauldascha extends Veschbr implements DesKoMerGinstigerMacha {
    private boolean isReduziert;

    public Mauldascha(String name, double preis) {
        super(preis, name);
        isReduziert = false;
    }

    public void reduzieren(Guadschai guadschai) {
        if (!(this.isReduziert)) {
            this.setPreis(this.getPreis() * (1 - guadschai.getRabatt()));
            this.isReduziert = true;
        }
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", Preis: " + this.getPreis() + ", bereits reduziert: " + this.isReduziert;
    }

}
