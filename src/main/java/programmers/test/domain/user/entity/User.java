package programmers.test.domain.user.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "user")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long id;

    @Column(name = "nickname", nullable = false, length = 100)
    private String nickname;

    @Column(name = "age", nullable = false)
    private int age;

    @Builder
    public User(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }
}
