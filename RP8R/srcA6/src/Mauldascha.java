public class Mauldascha extends Veschbr implements DesKoMerGinstigerMacha {
    private boolean isReduziert;

    public Mauldascha(){
    }
    public void reduzieren(Guadschai guadschai){
        if (this.isReduziert == false) {
            this.setPreis(this.getPreis() * (1 - guadschai.rabatt));
            this.isReduziert = true;
        }
    }
@Override
    public String toString() {
    return "Name: " + this.getName() + ", Preis: " + this.getPreis() + ", bereits reduziert: " + this.isReduziert;
    }

}
