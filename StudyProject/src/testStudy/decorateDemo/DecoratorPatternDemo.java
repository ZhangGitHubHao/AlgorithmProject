package testStudy.decorateDemo;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        redCircle.draw();
    }
}
