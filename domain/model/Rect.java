package domain.model;

public class Rect extends Square {
    private int height=0;
    @Override
    public int getHeight() {
        // TODO Auto-generated method stub
        return height;
    }

    @Override
    public void setHeight(int newHeight) {
        // TODO Auto-generated method stub
        if(newHeight>=0)
        height=newHeight;
    }
    
    public Rect () {
        this(5, 5);
    }
    public Rect(int newx,int newy,int newWidth,int newHeight){
        super(newx,newy,newWidth);
        setHeight(newHeight);
    }
    public Rect(int newHeight,int newWidth){
        this(0,0,newHeight,newWidth);

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
