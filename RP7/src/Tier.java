public class Tier {
    public final String PFEIL = " --> ";
    public void fressen() {
        System.out.println(this.getClass().getName() + " : fressen - aus Klasse Tier.");
    }
    public void gibLaut() {
        System.out.println(this.getClass().getName() + " : gibLaut - aus Klasse Tier.");
    }

    public String getAbstammung() {
        String result = "";
        result = "Tier" + PFEIL + "Object";
        return result;
}}
