package com.icolak.dto;

import lombok.Data;

@Data
public class UserResponseDTO {
    public boolean success;
    public String message;
    public int code;
    public UserDTO data;
}
