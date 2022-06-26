package com.example.swaggepractice.domain.user.dto;

import com.example.swaggepractice.domain.user.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

@Getter
public class UserResponseDto {
    @ApiModelProperty(notes = "UserId", example = "1")
    private Long id;
    @ApiModelProperty(notes = "UserName", example = "Park")
    private String name;
    @ApiModelProperty(notes = "UserEmail", example = "test@test.com")
    private String email;

    public UserResponseDto(User entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
    }
}
