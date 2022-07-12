package GroupProject02;

public interface Shape {

    void calculateArea();

    void calculateParameter();
}

class Circle implements Shape{

    @Override
    public void calculateArea() {
        final  double pi = 3.141592;
        int radius=5;
        System.out.println(pi*Math.pow(radius,2));
    }

    @Override
    public void calculateParameter() {
        final  double pi = 3.141592;
        int radius=10;
        System.out.println(2*pi*radius);
    }
}

class Square implements Shape{

    @Override
    public void calculateArea() {
        int side=5;
        System.out.println(Math.pow(side,2));
    }

    @Override
    public void calculateParameter() {
        int side=10;
        System.out.println(4*side);
    }
}

class ShapeTester extends Square{
    public static void main(String[] args) {

        Circle circle=new Circle();
        circle.calculateArea();
        circle.calculateParameter();

        Square square=new Square();
        square.calculateArea();
        square.calculateParameter();

    }
}

