public class Angora extends Hauskatze {
    public String getAbstammung() {
        String result = "";
        result = "Angora" + PFEIL + super.getAbstammung();
        return result;
    }
}