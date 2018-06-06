package factory_pattern;

import java.util.HashMap;
import java.util.Map;

//工厂方法模式的扩展应用：延迟初始化
public class ProductFactory {
    private static final Map<String, Product> prMap = new HashMap<>();
    public static synchronized Product createProduct(String type) throws Exception {
        Product product;
        if(prMap.containsKey(type)){
            product = prMap.get(type);
        } else {
            if(type.equals(("Product1"))){
                  product = new Product1();
            } else {
                  product = new Product2();
            }
            prMap.put(type, product);
        }
        return product;
    }
}
