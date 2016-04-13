package org.mehrdad;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RequestMonitor {

	@Around("execution(* org.mehrdad.HibernateDemoApplication.TestController(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("Joint Point" + joinPoint);
		
		return joinPoint.proceed();
	}
	
}
