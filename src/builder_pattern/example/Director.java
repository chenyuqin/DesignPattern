package builder_pattern.example;

import java.util.ArrayList;

public class Director {
    private ArrayList<String> sequeuce = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    //假设需要A类型的奔驰车
    public BenzModel getABenzModel() {
        this.sequeuce.clear();
        //定义执行顺序
        //...
        this.benzBuilder.setSequeuce(sequeuce);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    //假设需要B类型的奔驰车
    public BenzModel getBBenzModel() {
        this.sequeuce.clear();
        //定义执行顺序
        //...
        this.benzBuilder.setSequeuce(sequeuce);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    //假设需要C类型的宝马车


    //假设需要D类型的宝马车



}
