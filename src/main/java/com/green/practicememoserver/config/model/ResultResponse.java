package com.green.practicememoserver.config.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResultResponse<T> {
    private String resultMessage;
    private T resultData;

}
