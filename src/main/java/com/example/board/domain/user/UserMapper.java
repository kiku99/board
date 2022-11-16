package com.example.board.domain.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    /**
     * 유저 정보 저장
     * @param params
     */
    void save(User params);

    /**
     * 유저 정보 조회
     * @param id
     * @return 유저 정보
     */
    User findById(String id);



}
