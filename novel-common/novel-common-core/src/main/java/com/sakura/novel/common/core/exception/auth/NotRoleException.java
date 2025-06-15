package com.sakura.novel.common.core.exception.auth;


import com.sakura.novel.common.core.utils.StringUtils;

/**
 * 未能通过的角色认证异常
 * 
 * @author Sakura
 */
public class NotRoleException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    public NotRoleException(String role)
    {
        super(role);
    }

    public NotRoleException(String[] roles)
    {
        super(StringUtils.join(roles, ","));
    }
}
