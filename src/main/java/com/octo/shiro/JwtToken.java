package com.octo.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author zms
 */
public class JwtToken implements AuthenticationToken {
    private String jwt;

    public JwtToken(String jwt) {
        this.jwt = jwt;
    }

    @Override
    public Object getPrincipal() {
        return jwt;
    }

    @Override
    public Object getCredentials() {
        return jwt;
    }
}
