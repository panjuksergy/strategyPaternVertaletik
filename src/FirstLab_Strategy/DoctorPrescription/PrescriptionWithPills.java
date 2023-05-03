package FirstLab_Strategy.DoctorPrescription;

public class PrescriptionWithPills implements IDefaultPrescription {
    @Override
    public void WriteReceipe(String diagnose) {
        if (diagnose.equals("sore throat")){
            System.out.println("Sell pills Dekatelen");
        } else if (diagnose.equals("abdominal pain")) {
            System.out.println("Make smekta be drunked");
        } else System.out.println("another pills");;
    }
}

