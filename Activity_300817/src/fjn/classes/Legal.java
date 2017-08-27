package fjn.classes;

public class Legal extends Purchase {
    @Override
    public void calculatePA(double value){
        this.value = value - 10;
    }

    @Override
    public void calculatePP(double value, double plots) {
        this.value = value+(plots*5);
    }

    @Override
    public double portion() {
        return this.value/plots;
    }

}
