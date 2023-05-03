package FirstLab_Strategy.DoctorPrescription;

public class PrescriptionSomethingElse implements IAnyPrescription{
    String diagnose;

    @Override
    public void DoOperationOrEverything(String diagnose) {
        System.out.println("autonasia");
    }

}
