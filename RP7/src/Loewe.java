public class Loewe extends Wildkatze {
    public void gibLaut() {
        System.out.println("Loewe: bruellen - aus Klasse Loewe");
    }

    public String getAbstammung() {
        String result = "";
        result = "Loewe" + PFEIL + super.getAbstammung();
        return result;
    }
}