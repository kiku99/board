package com.example.board.domain.user;

import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserMapper userMapper;
    private final RoleMapper roleMapper;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String id){

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

        User user = userMapper.findById(id);
        Role role = roleMapper.findById(String.valueOf(user.getRole()));

        if (user != null){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
            return new org.springframework.security.core.userdetails.User(user.getId(), user.getPassword(), grantedAuthorities) {
            };
        }
        else {
            throw new UsernameNotFoundException("can not find User : " + id);
        }
    }
}
