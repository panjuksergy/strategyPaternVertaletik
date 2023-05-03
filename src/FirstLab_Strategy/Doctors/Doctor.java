package FirstLab_Strategy.Doctors;

import FirstLab_Strategy.DoctorPrescription.IAnyPrescription;
import FirstLab_Strategy.DoctorPrescription.IDefaultPrescription;

public class Doctor implements IDoc {
    String diagnose;

    @Override
    public void Prescript(IDefaultPrescription prescription) {
        prescription.WriteReceipe(diagnose);
    }

    @Override
    public void DoAnyPrescriptions(IAnyPrescription anyPrescription) {
        anyPrescription.DoOperationOrEverything();
    }
}
