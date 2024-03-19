package org.doctorapp.model;

public enum Specialization {
    ORTHO("ORTHOPEDICIAN"),
    PEDIA("PEDIATRICIAN"),
    PHYSICIAN("GENERAL PHYSICIAN"),
    GYNAEC("GYNAECOLOGIST"),
    DERMO("DERMATOLOGIST"),
    PULMO("PULMONOLOGIST"),
    NEURO("NEUROLOGIST");

    private String speciality;
    Specialization(String speciality){
        this.speciality=speciality;
    }

    public String getSpeciality() {
        return speciality;
    }
}

