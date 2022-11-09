package com.example.board.domain.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Transactional
    public void insert(User user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userMapper.save(user);
    }
}
