public class Square extends Rectangle implements Colorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
    @Override
    public void resize(double percent) {
        setSide(getSide() + getSide() *percent);;
        
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(3.0,4.0);
        Shape shape1 = shapes[0];
        if(shape1 instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape1;
            System.out.println(rectangle.getArea());
        }
        shapes[1] = new Circle(5.0);
        Shape shape2 = shapes[1];
        if(shape2 instanceof Circle){
            Circle  circle = (Circle) shape2;
            System.out.println(circle.getArea());
        }
        shapes[2] = new Square(6.0);
        Shape shape3 = shapes[2];
        if(shape3 instanceof Square){
            Square square = (Square) shape3;
            System.out.println(square.getArea());
            square.howToColor();
        }

        

    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
        
    }

}
