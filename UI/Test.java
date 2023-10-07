package UI;

import java.io.PrintStream;

import domain.model.Circle;
import domain.model.Ellipse;
import domain.model.Rect;
import domain.model.Shape;
import domain.model.Square;

public class Test {
    public static void main(String[] args) {
        PrintStream screen= System.out;
        var square = new Square(0);

          var shapes=new Shape[]{
          new Rect(10,20),
          new Circle(20),
          new Ellipse(5,10),
          new Square(10)
          };
          var sumArea=0;
          for(Shape s: shapes){
          sumArea=s.getArea();
         }
         var avgArea=sumArea/shapes.length;
          System.out.println("Area promedio : "+ avgArea);
         
        var s = new Square(0);
        s.setWidth(10);
        s.setHeight(20);
        square.setHeight(65);
        screen.println("Width: " + square.getWidth());
        screen.println("Height: " + square.getHeight());
        square.setHeight(20);
        screen.println("Width: " + square.getWidth());
        screen.println("Height: " + square.getHeight());
        screen.println("Area : " + s.getArea());
        screen.println("Perimetro : " + s.getPerimeter());
        var rect = new Rect();
        rect.setWidth(65);
        screen.println("Width: " + rect.getWidth());
        screen.println("Height: " + rect.getHeight());
        rect.setHeight(21);
        screen.println("Width: " + rect.getWidth());
        screen.println("Height: " + rect.getHeight());
        /*
         * var shape1 =new Shape();
         * var shape2 =new Shape();
         * 
         * shape1.setx(200);
         * shape2.setx(13);
         * System.out.println(shape1.getx());
         */
    }

}
