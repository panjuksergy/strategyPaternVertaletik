package FirstLab_Strategy;

public class Moto {
    int maxSpeed;
    boolean wheelBlockStatus;
    int brakePodsTemperature;
    int currentSpeed;

    Moto(String model){
        this.model = model;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public void Brake(IBrake _brake){
        if(_brake != null){
            _brake.Brake(currentSpeed, wheelBlockStatus, brakePodsTemperature);
        }
    }

}
