package com.crio.stayEase.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelBasicDto {
    
    private int id;

    private String name;

    private String location;

    private String description;

}