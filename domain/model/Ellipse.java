package domain.model;

public class Ellipse extends Circle{
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
