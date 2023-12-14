package com.GK.Hotel.controller;

import com.GK.Hotel.model.Room;
import com.GK.Hotel.response.RoomResponse;
import com.GK.Hotel.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

@RequiredArgsConstructor
@RestController
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;
    @PostMapping("/addNewRoom")
    public ResponseEntity<RoomResponse> addNewRoom(
            @RequestParam("photo") MultipartFile photo,
            @RequestParam ("roomType") String roomType,
            @RequestParam ("roomPrice")BigDecimal roomPrice) throws SQLException, IOException {
        Room Savedroom=roomService.addNewRoom(photo,roomType,roomPrice);
        RoomResponse response=new RoomResponse(Savedroom.getId(),
                Savedroom.getRoomType(),Savedroom.getRoomPrice()
                );
            return ResponseEntity.ok(response);
    }
}
