package FirstLab_Strategy.BrakeForMoto;

import FirstLab_Strategy.IBrake;

public class BrakeWithABS implements IBrake {

    @Override
    public void Brake(int currentSpeed, boolean wheelBlockStatus, int brakepadsTemperature) {
        if (wheelBlockStatus && currentSpeed>0){
            wheelBlockStatus=false;
            currentSpeed-=2;
            brakepadsTemperature-=5;
            Brake(currentSpeed, wheelBlockStatus, brakepadsTemperature);
        }
        else if (currentSpeed>=0){
            return;
        }
        else{
            wheelBlockStatus=true;
            currentSpeed-=10;
            brakepadsTemperature+=10;
            Brake(currentSpeed, wheelBlockStatus, brakepadsTemperature);
        }
    }
    }
