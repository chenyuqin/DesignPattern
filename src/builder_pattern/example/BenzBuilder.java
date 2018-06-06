package builder_pattern.example;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
    private BenzModel benzModel = new BenzModel();
    @Override
    public void setSequeuce(ArrayList<String> sequeuce) {
        benzModel.setSequeuce(sequeuce);
    }

    @Override
    public CarModel getCarModel() {

        return this.benzModel;
    }
}
