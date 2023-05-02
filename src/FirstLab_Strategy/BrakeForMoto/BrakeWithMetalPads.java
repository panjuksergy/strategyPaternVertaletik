package FirstLab_Strategy.BrakeForMoto;

import FirstLab_Strategy.IBrake;

public class BrakeWithMetalPads implements IBrake {
    @Override
    public void Brake(int currentSpeed, boolean wheelBlockStatus, int BrakePadsTemperature) {
        currentSpeed-=13;
        wheelBlockStatus = true;
        BrakePadsTemperature += 10;
    }
}
