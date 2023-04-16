package edu.npu.common;

/**
 * @author : [wangminan]
 * @description : [Redis在module中的常量]
 */
public class RedisConstants {

    public static final String SMS_CODE_PREFIX = "code:sms:";

    public static final String MAIL_CODE_PREFIX = "code:mail:";

    public static final Long CODE_EXPIRE_TIME = 60 * 5L;

    public static final String TOKEN_KEY_PREFIX = "token:";

    public static final Long TOKEN_EXPIRE_TTL = 18000000L;

}
