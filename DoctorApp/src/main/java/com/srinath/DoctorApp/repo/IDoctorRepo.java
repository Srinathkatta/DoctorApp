package com.srinath.DoctorApp.repo;

import com.srinath.DoctorApp.model.Doctor;
import com.srinath.DoctorApp.model.Qualification;
import com.srinath.DoctorApp.model.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDoctorRepo extends JpaRepository<Doctor,Integer> {
    List<Doctor> findByDocQualificationOrDocSpecialization(Qualification qual, Specialization spec);
}
