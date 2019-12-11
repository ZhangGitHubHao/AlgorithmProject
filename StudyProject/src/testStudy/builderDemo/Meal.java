package testStudy.builderDemo;

import java.util.LinkedList;
import java.util.List;

public class Meal {
    public List<Food> foodList = new LinkedList<>();

    public void addFood(Food food) {
        foodList.add(food);
    }

    public float getCost() {
        float cost = 0.0F;
        for (Food food : foodList) {
            cost+=food.getPrice();
        }
        return cost;
    }

    public void showMeal(){
        for (Food food:foodList) {
            System.out.print("餐品：" + food.getFoodName());
            System.out.print("，包装：" + food.getFoodPackage().getPackage());
            System.out.println("，价格：￥" + food.getPrice());
        }
    }
}
