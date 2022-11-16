package com.example.board.domain.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMapper {

    /**
     * 사용자 역할 조회
     * @param id
     * @return 사용자 역할 정보
     */
    Role findById(String id);


}
