package testStudy.decorateDemo;

public abstract class ShapeDecorator implements Shape{
    protected Shape decorateShape;

    public ShapeDecorator(Shape decorateShape) {
        this.decorateShape = decorateShape;
    }

    @Override
    public void draw(){
        decorateShape.draw();
    }
}
