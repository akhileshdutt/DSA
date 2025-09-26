public class newBox extends Inheritance{
    double weight;

    public newBox() {
        this.weight = -1;
    }

    public newBox(double l, double b, double h, double weight){
        super(l,b,h);    
        this.weight=weight;
    }
} 
