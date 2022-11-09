package com.example.sso.server.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 常量资源池
 * 1.存储有效的token
 * 2.存储已登录的系统信息
 */
public class SSOConstantPool {

    /**
     * 存储已经登录有效-token
     */
    public static Set<String> TOKEN_POOL = new HashSet<>();

    /**
     * 存储已经登录的系统
     * 注销时候用
     */
    public static Map<String, List<ClientRegisterModel>> CLIENT_REGISTER_POOL = new HashMap<>();
}
