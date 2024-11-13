package programmers.test.domain.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import programmers.test.domain.user.dto.request.UserRequestDto;
import programmers.test.domain.user.dto.response.UserResponseDto;
import programmers.test.domain.user.entity.User;
import programmers.test.domain.user.repository.UserRepository;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public void saveUser(UserRequestDto userRequestDto) {
        User user = userRequestDto.toEntityUser();
        userRepository.save(user);
    }

    public UserResponseDto getUser(Long userId) {
        User user = userRepository.findById(userId).get();
        return UserResponseDto.of(user);
    }
}
