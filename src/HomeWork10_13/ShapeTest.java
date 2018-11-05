package HomeWork10_13;

import HomeWork10_13.Shape.Shape;
import HomeWork10_13.Shape.ThreeDemensional.Cube;
import HomeWork10_13.Shape.ThreeDemensional.Sphere;
import HomeWork10_13.Shape.ThreeDemensional.Tetrahedron;
import HomeWork10_13.Shape.ThreeDemensional.ThreeDimensionalShape;
import HomeWork10_13.Shape.TwoDemensional.Circle;
import HomeWork10_13.Shape.TwoDemensional.Square;
import HomeWork10_13.Shape.TwoDemensional.Triangle;
import HomeWork10_13.Shape.TwoDemensional.TwoDemensionalShape;

public class ShapeTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[6];
        Shape shape1 = new ThreeDimensionalShape();
        Shape shape2 = new TwoDemensionalShape();


        Shape sphere = new Sphere(5);
        Shape circle = new Circle(8);
        Shape square = new Square(5);
        Shape triangle = new Triangle(4, 5, 6);
        Shape cube = new Cube(5, 5, 5);
        Shape tetrahedron = new Tetrahedron(3);


        shapes[0] = sphere;
        shapes[1] = circle;
        shapes[2] = square;
        shapes[3] = triangle;
        shapes[4] = cube;
        shapes[5] = tetrahedron;


        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            if (shape instanceof ThreeDimensionalShape) {
                System.out.println("Area: " + ((ThreeDimensionalShape) shape).getArea() + "\nVolume: "
                        + ((ThreeDimensionalShape) shape).getVolume());
            }
            if (shape instanceof TwoDemensionalShape) {
                System.out.println("Area " + ((TwoDemensionalShape) shape).getArea());
            }
            System.out.println();
        }


    }

}
