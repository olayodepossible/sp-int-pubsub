package com.possible.sp.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RegistrationEvent {

    private String ticketType;

    private BigDecimal ticketPrice;

    private String ticketCode;

    private String attendeeFirstName;

    private String attendeeLastName;

    private String attendeeEmail;
}
