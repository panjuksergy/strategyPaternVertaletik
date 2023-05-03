package FirstLab_Strategy.DoctorPrescription;

public class PrescriptionWithProcedures implements IDefaultPrescription {
    @Override
    public void WriteReceipe(String diagnose) {
        if (diagnose.equals("back pain")) {
            System.out.println("Do phisiotherapii");}
        else if (diagnose.equals("eye troubles")) {
            System.out.println("Do eye exercise");
        }else System.out.println("do another procedures");
    }
}
