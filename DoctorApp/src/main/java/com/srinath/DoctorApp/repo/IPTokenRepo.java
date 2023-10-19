package com.srinath.DoctorApp.repo;

import com.srinath.DoctorApp.model.PatientAuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPTokenRepo extends JpaRepository<PatientAuthenticationToken,Integer> {
    PatientAuthenticationToken findFirstByTokenValue(String tokenValue);
}
