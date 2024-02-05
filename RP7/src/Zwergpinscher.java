public class Zwergpinscher extends Hund{
    public void gibLaut() {
        System.out.println(this.getClass().getName() + " : klaeffen - aus Klasse Hund");
    }

    public String getAbstammung() {
        String result = "";
        result = "Zwergpinscher" + PFEIL + super.getAbstammung();
        return result;
}}
