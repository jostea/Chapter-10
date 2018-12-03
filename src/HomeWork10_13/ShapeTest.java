package HomeWork10_13;

import HomeWork10_13.Shape.*;
import HomeWork10_13.Shape.ThreeDemensional.*;
import HomeWork10_13.Shape.TwoDemensional.*;

public class ShapeTest {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Sphere(5),
                new Circle(8),
                new Square(5),
                new Triangle(4, 5, 6),
                new Cube(5),
                new Tetrahedron(3)
        };


        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println("Area: " + shape.getArea());
            if (shape instanceof ThreeDimensionalShape) {
                System.out.println("Volume: " + ((ThreeDimensionalShape) shape).getVolume());
            }
            System.out.println();
        }


    }

}
