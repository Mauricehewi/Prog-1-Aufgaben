public class Student {
    private String name ; // Name des /der Studierenden
    private int alterInJahren ; // Alter des/der Studierenden in Jahren
    private int matrikelNr ; // Matrikel - Nummer des/der Studierenden

    Student(String name, int alterInJahren, int matrikelNr){
        this.name = name;
        this.alterInJahren = alterInJahren;
        this.matrikelNr = matrikelNr;
        System.out.println("Student " + this.name + " erstellt.");
    }
    public int getAlterInJahren() {
        return alterInJahren;
    }
    public void setAlterInJahren(int alterInJahren){
        this.alterInJahren = alterInJahren;
    }
    public void setName(String name){
        this.name = name ;
    }
    public String getName(){
        return this.name;
    }
    public void setMatrikelNr(int matrikelNr){
        this.matrikelNr = matrikelNr;
    }
    public int getMatrikelNr(){
        return this.matrikelNr;
    }
}
