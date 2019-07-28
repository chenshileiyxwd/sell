package com.imooc.enums;

import lombok.Getter;

@Getter
public enum ProductStatusEunms {
    //注释
    UP(0,"在架"),DOWN(1,"下架");
    private Integer code;
    private String message;

    ProductStatusEunms(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
