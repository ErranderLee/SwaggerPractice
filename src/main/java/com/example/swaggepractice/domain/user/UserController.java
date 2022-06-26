package com.example.swaggepractice.domain.user;

import com.example.swaggepractice.domain.user.dto.CreateUserDto;
import com.example.swaggepractice.domain.user.dto.UserResponseDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@ApiOperation("User API")
public class UserController {
    private final UserService userService;

    @ApiOperation(value = "Create User", notes = "사용자를 생성한다.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 500, message = "Server Error")
    })
    @PostMapping("/user")
    public void createUser(@RequestBody CreateUserDto createUserDto) {
        this.userService.createUser(createUserDto);
    }

    @GetMapping("/user/{userId}")
    public UserResponseDto getUser(@PathVariable
                                   @ApiParam(name = "userId", example = "33", value = "Id of an User")
                                   Long userId) {
        return this.userService.getUser(userId);
    }
}
