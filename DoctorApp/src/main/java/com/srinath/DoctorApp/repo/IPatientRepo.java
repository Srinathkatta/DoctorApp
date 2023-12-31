package com.srinath.DoctorApp.repo;

import com.srinath.DoctorApp.model.BloodGroup;
import com.srinath.DoctorApp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPatientRepo extends JpaRepository<Patient,Integer> {


    Patient findFirstByPatientEmail(String newEmail);

    List<Patient> findByPatientBloodGroup(BloodGroup bloodGroup);
}
