package builder_pattern.example;

import java.util.ArrayList;

public abstract class CarBuilder {
    public abstract void setSequeuce(ArrayList<String> sequeuce);

    public abstract CarModel getCarModel();
}
