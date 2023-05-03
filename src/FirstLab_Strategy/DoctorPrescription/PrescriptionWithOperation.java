package FirstLab_Strategy.DoctorPrescription;

public class PrescriptionWithOperation implements IAnyPrescription{
        @Override
    public void DoOperationOrEverything(String diagnose) {
        System.out.println("Do operation");
        }

    }
