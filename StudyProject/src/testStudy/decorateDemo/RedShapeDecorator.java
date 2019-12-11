package testStudy.decorateDemo;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decorateShape) {
        super(decorateShape);
    }

    @Override
    public void draw() {
        decorateShape.draw();
        setRedBorder(decorateShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
