public class Hund extends Saeugetier{
    public void gibLaut() {
        System.out.println(this.getClass().getName() + " : bellen - aus Klasse Hund");
    }

    public String getAbstammung() {
        String result = "";
        result = "Hund" + PFEIL + super.getAbstammung();
        return result;
    }
}
