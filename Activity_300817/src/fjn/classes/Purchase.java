package fjn.classes;

public abstract class Purchase {
    private String kindPerson, typePurchase;
    private double value, plots;

    public void Purchase(){
        kindPerson = "";
        typePurchase = "";
        value = 0;
        plots = 0;
    }
    public abstract void calculatePA(double value);
    public abstract void calculatePP(double value, double plots);
    public abstract double portion();

    public void setKindPerson(String kindPerson){
        this.kindPerson = kindPerson;
    }
    public void setTypePurchase(String typePurchase){
        this.typePurchase = typePurchase;
    }
    public void setValue(double value){
        this.value = value;
    }
    public void setPlots(double plots){
        this.plots = plots;
    }
    public String getKindPerson(){
        return kindPerson;
    }
    public String getTypePurchase(){
        return typePurchase;
    }
    public double getValue(){
        return value;
    }
    public double getPlots(){
        return plots;
    }
}