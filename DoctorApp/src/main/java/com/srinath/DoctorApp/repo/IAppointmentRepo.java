package com.srinath.DoctorApp.repo;

import com.srinath.DoctorApp.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepo extends JpaRepository<Appointment,Integer> {
}
