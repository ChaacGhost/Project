package fjn.classes;

public class Physical extends Purchase {

    @Override
    public void calculatePA(double value){
        this.value = value-5;
    }

    @Override
    public void calculatePP(double value, double plots) {
        this.value = value+(plots*3);
    }
    public double portion(){
        return this.value/plots;
    }
}
