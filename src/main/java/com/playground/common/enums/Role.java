package com.playground.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
  ADMIN("ADMIN"),
  USER("USER");

  private final String role;
}