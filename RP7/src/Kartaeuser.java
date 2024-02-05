public class Kartaeuser extends Hauskatze{
    public String getAbstammung() {
        String result = "";
        result = "Kartaeuser" + PFEIL + super.getAbstammung();
        return result;
    }

}
