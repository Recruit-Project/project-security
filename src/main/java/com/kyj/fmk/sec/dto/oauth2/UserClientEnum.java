package com.kyj.fmk.sec.dto.oauth2;

import lombok.Getter;

@Getter
public enum UserClientEnum {

    NAVER("naver"),
    GOOGLE("google"),
    KAKAO("kakao"),
    NORMAL("normal");

    private final String value;

    UserClientEnum(String value) {
        this.value = value;
    }
}
