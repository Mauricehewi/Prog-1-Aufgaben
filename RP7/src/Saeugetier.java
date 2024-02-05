public class Saeugetier extends Tier{
    public void saeugen() {
        System.out.println(this.getClass().getName() + " : saeugen - aus Klasse Saeugetier");
    }
    public String getAbstammung() {
        String result = "";
        result = "Saeugetier" + PFEIL + super.getAbstammung();
        return result;
}}
