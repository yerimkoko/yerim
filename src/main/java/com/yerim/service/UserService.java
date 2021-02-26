package com.yerim.service;

import com.yerim.domain.User;
import com.yerim.domain.UserRepository;
import com.yerim.service.dto.UserInfoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor // final 필드에 대한 생성자를 만들어준다.
@Service // 서비스라고 스프링한테 알려준다.
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void signUp(String email, String name, String password) {
        User user = new User(email, name, password); //TODO 패스워드는 암호화하고 salt를 생성해준다.
        userRepository.save(user);
    }

    @Transactional
    public UserInfoResponse getUser(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("그런사람 없습니다."));

        return UserInfoResponse.of(user);
    }

}
