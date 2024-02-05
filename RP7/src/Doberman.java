public class Doberman extends Hund{
    public String getAbstammung() {
        String result = "";
        result = "Dobermann" + PFEIL + super.getAbstammung();
        return result;
    }
}
