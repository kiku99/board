package com.example.board.common.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchDTO {

    private int page;
    private int recordSize;
    private int pageSize;
    private String keyword;
    private String searchType;

    public SearchDTO(){
        this.page = 1;
        this.recordSize = 10;
        this.pageSize = 10;
    }

    public int getOffset(){
        return (page - 1) * recordSize;
    }
}
