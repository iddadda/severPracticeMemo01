package com.green.practicememoserver;

import com.green.practicememoserver.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemoMapper {
    int save(MemoPostReq req);
    int deleteById(int id);
    List<MemoGetRes> findAll(MemoGetReq req);
    MemoGetOneRes findById(int id);
    int modify(MemoPutReq req);
}
