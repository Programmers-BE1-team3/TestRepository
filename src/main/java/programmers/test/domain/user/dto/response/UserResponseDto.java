package programmers.test.domain.user.dto.response;

import programmers.test.domain.user.entity.User;

public record UserResponseDto(
        Long id,
        String nickname,
        int age
) {
    public static UserResponseDto of(User user) {
        return new UserResponseDto(
                user.getId(),
                user.getNickname(),
                user.getAge()
        );
    }
}
