package com.crio.stayEase.dto;

import java.time.LocalDate;

import com.crio.stayEase.enums.BookingStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"user", "bookedHotel"})
public class BookingDto {

    private int id;

    private UserDto user;

    private HotelBasicDto bookedHotel;

    private int guests;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private BookingStatus bookingStatus;

    private LocalDate bookingDate;
}