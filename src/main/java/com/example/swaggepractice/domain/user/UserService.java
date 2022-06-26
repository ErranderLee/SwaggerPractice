package com.example.swaggepractice.domain.user;

import com.example.swaggepractice.domain.user.dto.CreateUserDto;
import com.example.swaggepractice.domain.user.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void createUser(CreateUserDto createUserDto) {
        userRepository.save(User.builder()
                .name(createUserDto.getName())
                .email(createUserDto.getEmail())
                .build());
    }

    public UserResponseDto getUser(Long userId) {
        return new UserResponseDto(userRepository.findById(userId)
                .orElseThrow());
    }
}
