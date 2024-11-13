package programmers.test.domain.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import programmers.test.domain.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
