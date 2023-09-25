package UI;
import domain.model.Square;
import domain.model.Shape;
import domain.model.Rect;
public class Test {
    public static void main(String[]args){
        var square=new Square();
        square.setHeight(65);
        System.out.println("Width: "+square.getWidth());
        System.out.println("Height: "+square.getHeight());
        square.setHeight(21);
        System.out.println("Width: "+square.getWidth());
        System.out.println("Height: "+square.getHeight());
        var rect=new Rect();
        rect.setWidth(65);
        System.out.println("Width: "+rect.getWidth());
        System.out.println("Height: "+rect.getHeight());
        rect.setHeight(21);
        System.out.println("Width: "+rect.getWidth());
        System.out.println("Height: "+rect.getHeight());
        var shape1 =new Shape();
        var shape2 =new Shape();
        shape1.setx(200);
        shape2.setx(13);
        System.out.println(shape1.getx());
    }

}
