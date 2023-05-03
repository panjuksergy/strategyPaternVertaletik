package FirstLab_Strategy;

import FirstLab_Strategy.DoctorPrescription.PrescriptionSomethingElse;
import FirstLab_Strategy.DoctorPrescription.PrescriptionWithOperation;
import FirstLab_Strategy.DoctorPrescription.PrescriptionWithPills;
import FirstLab_Strategy.DoctorPrescription.PrescriptionWithProcedures;
import FirstLab_Strategy.Doctors.BetaDoctor;
import FirstLab_Strategy.Doctors.Doctor;

public class Main {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.setDiagnose("sore throat");
        doc.DoAnyPrescriptions( new PrescriptionSomethingElse());
        doc.Prescript(new PrescriptionWithPills());

        BetaDoctor medSister = new BetaDoctor();
        medSister.setDiagnose("sore throat");
        medSister.Prescript( new PrescriptionWithPills());
        medSister.Prescript(new PrescriptionWithProcedures());
    }
}
