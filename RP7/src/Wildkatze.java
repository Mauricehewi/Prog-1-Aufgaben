public class Wildkatze extends Katze {
    public void gibLaut() {
        System.out.println(this.getClass().getName() + " : fauchen - aus Klasse Wildkatze");
    }

    public String getAbstammung() {
        String result = "";
        result = "Wildkatze" + PFEIL + super.getAbstammung();
        return result;
    }
}
