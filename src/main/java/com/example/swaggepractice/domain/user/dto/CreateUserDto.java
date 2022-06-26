package com.example.swaggepractice.domain.user.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateUserDto {
    @ApiModelProperty(notes = "User Name", example = "KimFuchChun", required = false)
    private String name;
    @ApiModelProperty(notes = "User Email", example = "test@test.com", required = false)
    private String email;
}
