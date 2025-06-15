package com.sakura.novel.common.core.exception;

/**
 * 验证码错误异常类
 * 
 * @author Sakura
 */
public class CaptchaException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    public CaptchaException(String msg)
    {
        super(msg);
    }
}
