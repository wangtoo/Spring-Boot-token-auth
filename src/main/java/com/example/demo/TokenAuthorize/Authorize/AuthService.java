package com.example.demo.TokenAuthorize.Authorize;

/**
 * \* Created: liuhuichao
 * \* Date: 2017/10/30
 * \* Time: 下午2:31
 * \* Description: 与认证授权有关的服务
 * \
 */
public interface AuthService {
    /**
     * 登陆
     * @param username
     * @param password
     * @return
     */
    String login(String username, String password);

    /**
     * 刷新 token
     * @param oldToken
     * @return
     */
    String refresh(String oldToken);
}
