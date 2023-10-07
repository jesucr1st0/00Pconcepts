package domain.model;

public abstract class Shape {
    private int x=0;
    public Shape(int newx, int newy){ //constructor
        setx(newx);
        setx(newy);

    }
    public Shape(){
    }
    public void setx(int newx){
        if(newx>=0&&newx<=1000)
        x=newx;
    }
    public int getx(){
        return x;
    }
    public abstract int getArea();
    public abstract int getPerimeter();
}
