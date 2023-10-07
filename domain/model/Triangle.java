package domain.model;

public class Triangle extends Shape{
    private int sizeA=0;
    private int sizeB=0;
    private int sizeC=0;
    public int getsizeA(){
        return sizeA;
    }
    public void setsizeA(int newheight){
        if(newheight>=0)
        sizeA=newheight;
    }
    public int getsizeB(){
        return sizeB;
    }
    public void setsizeB(int newBase){
        if(newBase>=0)
        sizeB=newBase;

    }
    public int getsizeC(){
        return sizeC;
    }
    public void setsizeC(int newsize){
        if(newsize>=0)
        sizeC=newsize;
    }
    @Override
    public int getArea() {
        double A =getPerimeter()/2*((getPerimeter()-getsizeA())*(getPerimeter()-getsizeB())*(getPerimeter()-getsizeC()));
        A =Math.sqrt(A);
        return (int)A;
    }
    @Override
    public int getPerimeter() {
        return getsizeA()+getsizeB()+getsizeC();
    }
}
