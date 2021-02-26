package com.yerim.service.dto;

import com.yerim.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class UserInfoResponse {

    private Long id;

    private String name;

    private String email;

    public static UserInfoResponse of(User user) {
        return new UserInfoResponse(user.getId(), user.getEmail(), user.getName());
    }
}
