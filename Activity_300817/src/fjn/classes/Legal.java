package fjn.classes;

public class Legal extends Purchase {
    
    @Override
    public void calculatePA(double value){
        setValue(value - 10);
    }
    @Override
    public void calculatePP(double value, double plots) {
        setValue(value+(plots*5));
        setPlots(plots);
    }
    @Override
    public double portion() {
        return getValue()/getPlots();
    }

}
