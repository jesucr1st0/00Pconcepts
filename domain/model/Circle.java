package domain.model;

public class Circle extends Shape{
    public Circle(int newx,int newy,int newRadius){
        super(newx,newy);
        setRadius(newRadius);
    }
    public Circle(int newRadius){
        this(0,0,newRadius);
    }
    private double radius=0;
    public double getRadius(){
        return radius;
    }
    public void setRadius(int newRadius){
        if(newRadius>=0)
        radius=newRadius;
    }
    public double getMajoraxis(){
        return getMajoraxis();
    }
    public void setMajoraxis(int newMajoraxis){
        setMajoraxis(newMajoraxis);
    }
    @Override
    public int getArea() {
        return (int)(Math.pow(getRadius(),2)*Math.PI);
    }
    @Override
    public int getPerimeter() {
        return (int)(2*Math.PI*getRadius());
    }


}
