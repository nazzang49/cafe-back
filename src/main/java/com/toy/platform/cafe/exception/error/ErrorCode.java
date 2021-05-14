package com.toy.platform.cafe.exception.error;

import lombok.Getter;

/**
 * 에러 코드 관리
 */
@Getter
public enum ErrorCode {

    /* common */
    ENTITY_NOT_FOUND(404, "P404", "엔티티 없음 : %s"),
    INTERNAL_SERVER_ERROR(500, "500", "내부 시스템 오류"),
    DUPLICATE_ENTITY(409, "409", "엔티티 중복"),
    BAD_REQUEST(400, "400", "유효하지 않은 요청"),
    UNAUTHORIZED(401, "401", "미인증 접근"),
    NOT_FOUND(404, "G404", "해당 데이터 없음"),
    ;

    private final int status;
    private final String message;
    private final String code;

    ErrorCode(int status, String code, String message) {
        this.status = status;
        this.message = message;
        this.code = code;
    }
}
