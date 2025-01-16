package com.green.jwt_practice.config.jwt;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;

class MyFunction implements Function<String, SimpleGrantedAuthority> {
    @Override
    public SimpleGrantedAuthority apply(String str) {
        return new SimpleGrantedAuthority(str);
    }
}

@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public class JwtUser implements UserDetails {
    private final long signedUserId;
    private final List<UserRole> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        GrantedAuthority dddd = new SimpleGrantedAuthority("");
        Function fn2 = new MyFunction();

        Function fn = new Function<String, SimpleGrantedAuthority>() {
            @Override
            public SimpleGrantedAuthority apply(String str) {
                return new SimpleGrantedAuthority(str);
            }
        };

        return roles.stream()
                .map(item -> new SimpleGrantedAuthority(item.name()))
                .toList();
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return "";
    }

}
