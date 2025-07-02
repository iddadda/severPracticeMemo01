package com.green.practicememoserver.model;

import lombok.Getter;
import lombok.ToString;
import org.springframework.web.bind.annotation.BindParam;

import java.beans.ConstructorProperties;

@Getter
@ToString
public class MemoGetReq {
    private String searchText;
    private Integer page;

//    쿼리스트링으로 데이터가 넘어올 때 사용하는 코드 2가지
//    쿼리스트링에는 대문자를 안 넣는게 관례
//    search_text 로 데이터가 넘어올 때 searchText 로 매핑시켜주는 용도
//    즉, 키 값과 사용하는 변수명이 다를 때 사용하는것.

//    @BindParam 을 사용하면 키값의 일부만 변경할 수 있다.
//    public MemoGetReq(@BindParam("search_text") String searchText, Integer page) {
//        this.searchText = searchText;
//        this.page = page;
//    }

//    @ConstructorProperties 는 대부분을 바꿔줘야 함.
@ConstructorProperties({"search_text", "page"})
    public MemoGetReq(String searchText, Integer page) {
    this.searchText = searchText;
    this.page = page;
}
}

