package domain.model;

public class Rect extends Square {
    private int height=0;
    @Override
    public int getHeight(){
        return height;
    }
    @Override
    public void setHeight(int newHeight){
        if(newHeight>=0)
        height =newHeight;
    }
    @Override
    public int getArea() {
        return getWidth()*getHeight();
    }
    @Override
    public int getPerimeter() {
        return 2*(getWidth()+getHeight());
    }
}
