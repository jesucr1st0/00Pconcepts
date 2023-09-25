package domain.model;

public class Triangle extends Shape{
    private int height=0;
    private int Base=0;
    public int getheight(){
        return height;
    }
    public void setHeight(int newHeight){
        if(newHeight>=0)
        height=newHeight;
    }
    public int getBase(){
        return Base;
    }
    public void setBase(int newBase){
        if(newBase>=0)
        Base=newBase;

    }
    @Override
    public int getArea() {
        return (getheight()*getBase())/2;
    }
    @Override
    public int getPerimeter() {
        return 4*getWidth();
    }
}
