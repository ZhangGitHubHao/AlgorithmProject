package testStudy.jdkproxydemo;

import java.lang.reflect.Method;
import java.util.Arrays;

public class MyArrayHander implements ArrayHander {

    @Override
    public int[] sortArray(Object[] args) {
        int[] arr = (int[]) args[0];
        Arrays.sort(arr);
        return arr;
    }
}
