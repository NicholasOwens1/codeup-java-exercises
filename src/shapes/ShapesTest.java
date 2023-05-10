package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5) {
            @Override
            public void setLength(int num) {
            }

            @Override
            public void setWidth(int num) {

            }
        };
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());


    }
//        Quadrilateral myShape;
////        myShape = new Rectangle(3,10);
//        myShape = new Rectangle.Square(5);
//        System.out.println(myShape.getArea());
//    };
//}
//}
//    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle( 5, 4);
//        Rectangle box2 = new Rectangle.Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());

//}
    }