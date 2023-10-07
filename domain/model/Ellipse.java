package domain.model;

public class Ellipse extends Circle{
    public Ellipse () {
        this(5, 5);
    }
    public Ellipse(int newx,int newy,int newRadius,int newMajoraxis){
        super(newx,newy,newRadius);
        setMajoraxis(newMajoraxis);
    }
    public Ellipse(int newRadius,int newMajoraxis){
        this(0,0,newRadius,newMajoraxis);

    }
    private double Majoraxis =0;
    public double Majoraxis(){
        return Majoraxis;
    }
    @Override
    public double getMajoraxis(){
        return Majoraxis;
    }
    @Override
    public void setMajoraxis(int newMajoraxis){
        if(newMajoraxis>=0)
        Majoraxis =newMajoraxis;
    }
    @Override
    public int getArea() {
        return (int)(getRadius()*Math.PI*getMajoraxis());
    }
    @Override
    public int getPerimeter() {
        return (int)(Math.PI*(getRadius()+getMajoraxis()));
    }
}
