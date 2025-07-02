package com.green.practicememoserver;

import com.green.practicememoserver.config.model.ResultResponse;
import com.green.practicememoserver.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("api/memo")
public class MemoController {
    private final MemoService memoService;

    //    메모 등록
    @PostMapping
    public ResultResponse<Integer> postMemo(@RequestBody MemoPostReq req) {
        log.info("req:{}", req);
        int result = memoService.save(req);
        return new ResultResponse<>("삽입 성공", result);
    }

    //    메모 삭제
    @DeleteMapping
    public ResultResponse<Integer> deleteMemo(@RequestParam int id) {
        log.info("id:{}", id);
        int result = memoService.deleteById(id);
        return new ResultResponse<>("삭제성공", result);
    }

    //    메모 리스트
    @GetMapping
    public ResultResponse<List<MemoGetRes>> getMemo(@ModelAttribute MemoGetReq req) {
        log.info("req:{}", req);
        List<MemoGetRes> result = memoService.findAll(req);
        String message = String.format("rows: %d", result.size());
        return new ResultResponse<>(message, result);
    }

    //    메모 조회
    @GetMapping("{id}")
    public ResultResponse<MemoGetOneRes> getMemo(@PathVariable int id) {
        log.info("id:{}", id);
        MemoGetOneRes result = memoService.findById(id);
        return new ResultResponse<>("조회 성공", result);
    }

//    메모 수정
    @PutMapping
    public ResultResponse<Integer> putMemo(@RequestBody MemoPutReq req) {
        log.info("req:{}", req);
        int result = memoService.modify(req);
        return  new ResultResponse<>("수정성공", result);
    }
}
