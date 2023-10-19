package com.srinath.DoctorApp.model.Dto;






import com.srinath.DoctorApp.model.Appointment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleAppointmentDTO {

    AuthenticationInputDto authInfo;
    Appointment appointment;

    public AuthenticationInputDto getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(AuthenticationInputDto authInfo) {
        this.authInfo = authInfo;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
}


