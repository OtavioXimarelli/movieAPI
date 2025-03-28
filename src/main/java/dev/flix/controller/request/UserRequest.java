package dev.flix.controller.request;


import lombok.Builder;

@Builder
public record UserRequest(String userName, String email, String password) {
}
