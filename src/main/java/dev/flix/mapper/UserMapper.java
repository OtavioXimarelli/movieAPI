package dev.flix.mapper;


import dev.flix.controller.request.UserRequest;
import dev.flix.controller.response.UserResponse;
import dev.flix.entity.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserMapper {

    public static User toUser(UserRequest userRequest) {
        return  User.builder()
                .name(userRequest.userName())
                .email(userRequest.email())
                .build();

    }



    public static UserResponse toUserResponse(User user) {
        return UserResponse.builder()
                .username(user.getUsername())
                .email(user.getEmail())
                .build();
    }
}
