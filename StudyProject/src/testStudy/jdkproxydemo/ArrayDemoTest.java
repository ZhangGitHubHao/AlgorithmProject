package testStudy.jdkproxydemo;

import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ArrayDemoTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5,9};
        test(arr);
    }
    static void test(int[] arr){
        Sort sort = new SortImpl();
        int[] res1 = sort.sortArr(arr);
        System.out.println(Arrays.toString(res1));

        Sort proxy = (Sort)ArrayHanderJdkProxy.bind(new SortImpl(),"testStudy.jdkproxydemo.MyArrayHander");
        int[] res = proxy.sortArr(arr);
        System.out.println(Arrays.toString(res));
    }
}
