package programmers.test.domain.user.dto.request;

import programmers.test.domain.user.entity.User;

public record UserRequestDto(
        String nickname,
        int age
) {
    public User toEntityUser() {
        return User.builder()
                .nickname(this.nickname)
                .age(this.age)
                .build();
    }
}
