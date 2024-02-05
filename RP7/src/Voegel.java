public class Voegel extends Tier{

    public void brueten() {
        System.out.println(this.getClass().getName() + " : brueten - aus Klasse Vogel.");
    }

    public void gibLaut() {
        System.out.println(this.getClass().getName() + " : singen - aus Klasse Vogel.");
    }

    public String getAbstammung() {
        String result = "";
        result = "Vogel" + PFEIL + super.getAbstammung();
        return result;
    }
}
