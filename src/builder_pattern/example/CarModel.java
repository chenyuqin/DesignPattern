package builder_pattern.example;

import java.util.ArrayList;

public abstract class CarModel {
    private ArrayList<String> sequeuce = new ArrayList<>();
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    public final void run(){
        for (int i = 0; i < this.sequeuce.size(); i++) {
            String actionName = this.sequeuce.get(i);
            if(actionName.equalsIgnoreCase("start")){
                this.start();
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop();
            } else if(actionName.equalsIgnoreCase("alarm")){
                this.alarm();
            } else if(actionName.equalsIgnoreCase("engineboom")){
                this.engineBoom();
            }
        }
    }

    public final void setSequeuce(ArrayList sequeuce){
        this.sequeuce = sequeuce;
    }
}
