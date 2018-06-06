package builder_pattern.example;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {
    private BMWModel bmwModel = new BMWModel();
    @Override
    public void setSequeuce(ArrayList<String> sequeuce) {
        bmwModel.setSequeuce(sequeuce);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
