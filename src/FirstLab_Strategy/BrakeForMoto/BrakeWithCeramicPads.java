package FirstLab_Strategy.BrakeForMoto;

import FirstLab_Strategy.IBrake;

public class BrakeWithCeramicPads implements IBrake {
    @Override
    public void Brake(int currentSpeed, boolean wheelBlockStatus, int brakePadsTemperature) {
        if(brakePadsTemperature<=100){
            wheelBlockStatus = true;
            currentSpeed-=1;
            brakePadsTemperature+=20;
        }else {
            wheelBlockStatus = true;
            currentSpeed-= 40;
            brakePadsTemperature+=20;
        }
    }
}
