package testStudy.decorateDemo2;

public class ChickenFoodDecorator extends FoodDecorator {
    public ChickenFoodDecorator(Food foodDecorator) {
        super(foodDecorator);
    }

    @Override
    public float cost() {
        return foodDecorator.cost()+12.0F;
    }

    @Override
    public String description() {
        return foodDecorator.description()+"+鸡腿";
    }
}
