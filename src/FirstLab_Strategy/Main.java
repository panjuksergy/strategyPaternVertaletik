package FirstLab_Strategy;

import FirstLab_Strategy.BrakeForMoto.BrakeWithABS;
import FirstLab_Strategy.BrakeForMoto.BrakeWithCeramicPads;

public class Main {
    public static void main(String[] args) {
        Moto KawasakiNinja300RR = new Moto("ninja300rr-WithABS");

        KawasakiNinja300RR.Brake(new BrakeWithABS());

        Moto KawaskiNinja300 = new Moto("ninja300-WithoutABS-NotRace");

        KawaskiNinja300.Brake(new BrakeWithCeramicPads());
    }
}
