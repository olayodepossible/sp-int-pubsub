package com.possible.sp.mail;

import com.possible.sp.model.RegistrationEvent;
import org.springframework.stereotype.Component;

@Component
public class ConfirmationMailTransformer {

    public String toMailText(RegistrationEvent event) {
        return "Dear " + event.getAttendeeFirstName() + " " + event.getAttendeeLastName() + ",\n\n" +
                "Thank you for registering for the SpTut Tech Conference. We are looking forward to meeting you!\n\n" +
                "Your ticket code is: " + event.getTicketType() + "-" + event.getTicketCode() + "\n\n" +
                "Sincerely,\n\n" +
                "SpTut Registration Team.";
    }
}
