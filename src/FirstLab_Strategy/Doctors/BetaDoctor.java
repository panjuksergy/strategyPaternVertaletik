package FirstLab_Strategy.Doctors;

import FirstLab_Strategy.DoctorPrescription.IDefaultPrescription;

public class BetaDoctor implements IBetaDoc {
    String diagnose;

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    @Override
    public void Prescript(IDefaultPrescription prescription) {
        prescription.WriteReceipe(diagnose);
    }
}
