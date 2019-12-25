package testStudy.singletonDemo;

import java.util.ArrayList;
import java.util.List;

public class FruitList {
    private static List<String> fruits;
    private static FruitList fruitList=new FruitList();

    private FruitList(){}
    public static FruitList getFruitList(){
        if (fruits==null){
            fruits = new ArrayList<>();
        }
        return fruitList;
    }

    public void addFruit(String fruit){
        if (!fruits.contains(fruit)){
            fruits.add(fruit);
        }
    }
    public List<String> getFruits(){
        return fruits;
    }
}
