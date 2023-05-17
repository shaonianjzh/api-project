package com.shaonian.apiclientsdk.aop;

import com.shaonian.apiclientsdk.annotation.CheckIdentity;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 少年
 */
@Aspect
@Component
public class CheckIdentityAop {
    @Around("@annotation(checkIdentity)")
    public Object doCheckAuth(ProceedingJoinPoint joinPoint, CheckIdentity checkIdentity) throws Throwable {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();
        String key = request.getHeader("key");
        if(!"shaonian".equals(key)) {
            throw new RuntimeException("权限不够");
        }
        return joinPoint.proceed();
    }
}
