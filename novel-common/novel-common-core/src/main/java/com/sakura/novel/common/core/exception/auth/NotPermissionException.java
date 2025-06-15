package com.sakura.novel.common.core.exception.auth;


import com.sakura.novel.common.core.utils.StringUtils;

/**
 * 未能通过的权限认证异常
 * 
 * @author Sakura
 */
public class NotPermissionException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    public NotPermissionException(String permission)
    {
        super(permission);
    }

    public NotPermissionException(String[] permissions)
    {
        super(StringUtils.join(permissions, ","));
    }
}
