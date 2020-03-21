package com.yshen.springcloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 郑悦恺
 * @Classname aa
 * @Description TODO
 * @Date 2020/3/20 15:35
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T date;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;

    }
}