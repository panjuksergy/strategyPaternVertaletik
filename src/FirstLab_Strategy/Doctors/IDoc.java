package FirstLab_Strategy.Doctors;

import FirstLab_Strategy.DoctorPrescription.IAnyPrescription;

public interface IDoc extends IBetaDoc{
    void DoAnyPrescriptions(IAnyPrescription anyPrescription);
}
