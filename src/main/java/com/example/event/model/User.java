package com.example.event.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Table(name = "users")
public class User implements UserDetails {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique=true, nullable=false)
    private String username;

    @Column(nullable=false)
    private String password;

    @Column(nullable=false, length=50)
    private String role;   // e.g. "ROLE_ADMIN", "ROLE_ORGANIZER", "ROLE_PARTICIPANT"

    // --- UserDetails methods ---

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // single-role setup; if you need multiple roles, convert to a List<String>
        return List.of(new SimpleGrantedAuthority(role));
    }
    @Override public boolean isAccountNonExpired()     { return true; }
    @Override public boolean isAccountNonLocked()      { return true; }
    @Override public boolean isCredentialsNonExpired() { return true; }
    @Override public boolean isEnabled()               { return true; }
}