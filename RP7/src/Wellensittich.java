public class Wellensittich extends Voegel {
    public String getAbstammung() {
        String result = "";
        result = "Wellensittich" + PFEIL + super.getAbstammung();
        return result;
    }}
