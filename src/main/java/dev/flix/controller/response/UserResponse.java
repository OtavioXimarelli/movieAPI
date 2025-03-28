package dev.flix.controller.response;

import lombok.Builder;

@Builder
public record UserResponse(Long id, String username, String email) {
}
