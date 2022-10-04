package com.example.board.domain.post;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostResponse {

    private Long id;                       // PK
    private String title;                  //
    private String content;                //
    private String writer;                 //
    private int viewCnt;                   //
    private Boolean noticeYn;              //
    private Boolean deleteYn;              //
    private LocalDateTime createdDate;     //
    private LocalDateTime modifiedDate;    //

}
