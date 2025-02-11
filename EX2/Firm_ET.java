package EX2;

public class Firm_ET extends Company{
    private String nameOfFounder;
    private double startCapital;
    private double actualCapital;

    public Firm_ET(String name, String date, String code, String nameOfFounder, double startCapital, double actualCapital){
        super(name, date, code);
        this.nameOfFounder = nameOfFounder;
        this.startCapital = startCapital;
        this.actualCapital = actualCapital;
    }
    public String getNameOfFounder(){
        return  nameOfFounder;
    }
    public double getStartCapital(){
        return startCapital;
    }
    public double getActualCapital(){
        return actualCapital;
    }
    public void setNameOfFounder(String nameOfFounder){
        this.nameOfFounder = nameOfFounder;
    }
    public void setStartCapital(double startCapital){
        this.startCapital = startCapital;
    }
    public void setActualCapital(double actualCapital){
        this.actualCapital = actualCapital;
    }
    double earnings(){
        return this.actualCapital - this.startCapital;
    }
}
