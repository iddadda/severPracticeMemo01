package com.green.practicememoserver;

import com.green.practicememoserver.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemoService {
    private final MemoMapper memoMapper;

    public int save(MemoPostReq req) {
        return memoMapper.save(req);
    }

    public int deleteById(int id) {
        return memoMapper.deleteById(id);
    }

    public List<MemoGetRes> findAll(MemoGetReq req) {
        return memoMapper.findAll(req);
    }

    public MemoGetOneRes findById(int id) {
        return memoMapper.findById(id);
    }

    public int modify(MemoPutReq req) {
        return memoMapper.modify(req);
    }
}
