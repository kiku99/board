package com.example.board.domain.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.SecondaryTable;
import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final RoleMapper roleMapper;

    // 유저 생성
    @Transactional
    public void insert(User user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roleSet = new HashSet<Role>();
        roleSet.add(roleMapper.findById(String.valueOf(2)));
        userMapper.save(user);
    }
}
