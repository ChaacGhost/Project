package fjn.classes;

public class Physical extends Purchase {

    @Override
    public void calculatePA(double value){
        setValue(value-5);
    }
    @Override
    public void calculatePP(double value, double plots) {
        setValue(value+(plots*3));
    }
    @Override
    public double portion(){
        return getValue()/getPlots();
    }
}
