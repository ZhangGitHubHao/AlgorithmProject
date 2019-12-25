package testStudy.decorateDemo2;

public abstract class FoodDecorator implements Food {
    protected Food foodDecorator;

    public FoodDecorator(Food foodDecorator) {
        this.foodDecorator = foodDecorator;
    }

    @Override
    public float cost() {
        return foodDecorator.cost();
    }

    @Override
    public String description() {
        return foodDecorator.description();
    }
}
