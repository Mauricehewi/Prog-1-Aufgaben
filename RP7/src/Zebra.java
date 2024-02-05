public class Zebra extends Saeugetier{
    public void gibLaut() {
        System.out.println(this.getClass().getName() + " : wiehern - aus Klasse Zebra");
    }

    public String getAbstammung() {
        String result = "";
        result = "Zebra" + PFEIL + super.getAbstammung();
        return result;
    }


}
