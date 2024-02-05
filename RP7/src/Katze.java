public class Katze extends Saeugetier{
    public void gibLaut() {
        System.out.println(this.getClass().getName() + " : miauen - aus Klasse Katze");
    }

    public String getAbstammung() {
        String result = "";
        result = "Katze" + PFEIL + super.getAbstammung();
        return result;
    }
}
