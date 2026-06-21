package chapter_13;

/**
 *
 * @author Mohammad Asif
 */
public class rectangle extends geometric_object {
double h;
double  w;

    public rectangle(double w, double h) {
        this.h = h;
        this.w = w;
    }



    @Override
    public double getArea() {
        return  w*h;
    }

    @Override
    public double getPerimeter() {
        
                return 2*w+2*h;
    }
    
    
}
