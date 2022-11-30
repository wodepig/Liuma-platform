package com.autotest.LiuMa.common.interceptor;

public class Constant {
    public static final String LOGIN_PATH = "^/autotest/login$";

    public static final String REGISTER_PATH = "^/autotest/register$";

    public static final String REGISTER_CODE_PATH = "^/autotest/register/.+$";

    public static final String ENGINE_TOKEN_PATH = "^/openapi/engine/token/apply$";

    public static final String ENGINE_PATH = "^/openapi/.+$";
    /**
     * 不用登录就能创建任务
     */
    public static final String NO_AUTH_PATH = "^/autotest/noauth/.+$";
    /**
     * 错误请求也需要放行
     */
    public static final String ERROR_PATH = "^/error$";
}
