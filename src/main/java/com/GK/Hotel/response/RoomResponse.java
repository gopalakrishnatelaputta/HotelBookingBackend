package com.GK.Hotel.response;

import java.math.BigDecimal;
import java.util.List;

public class RoomResponse {
    private Long id;
    private String roomType;
    private BigDecimal roomPrice;   
    private boolean isBooked;
    private String photo;
    private List<RoomResponse>bookings;

}
