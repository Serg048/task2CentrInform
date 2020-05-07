package com.github.steed777.taskcentrinform.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    User;

    @Override
    public String getAuthority() {
        return name();
    }
}
