package com.GK.Hotel.response;

import com.GK.Hotel.model.Room;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookedRoomResponse {

    private Long bookingId;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private String guestFullName;

    private String guestEmail;

    private int noOfAdults;

    private int noOfChildren;

    private int totalNumOfGuests;

    private String bookingConfirmationCode;

    private Room room;

    public BookedRoomResponse(Long bookingId, LocalDate checkInDate,
                              LocalDate checkOutDate, String bookingConfirmationCode) {
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookingConfirmationCode = bookingConfirmationCode;
    }
}
