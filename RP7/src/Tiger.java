public class Tiger extends Wildkatze{
    public String getAbstammung() {
        String result = "";
        result = "Tiger" + PFEIL + super.getAbstammung();
        return result;
    }

}
