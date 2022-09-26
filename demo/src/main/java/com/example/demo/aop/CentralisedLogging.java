package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;



@Aspect
@Component
@Slf4j
public class CentralisedLogging {
    
    Logger log = LoggerFactory.getLogger(CentralisedLogging.class);

	@Before(value = "execution(* com.example.demo.controller.UserRestController.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
        log.info("Hello wolrd");
        System.out.println("before advice");
		System.out.println("Before method:" + joinPoint.getSignature());

	}


	@After(value = "execution(* com.example.demo.controller.UserRestController.*(..))")
	public void afterAdvice(JoinPoint joinPoint) {
        System.out.println("after advice");

	}


	@AfterReturning(pointcut = "execution(* com.example.demo.controller.UserRestController.*(..))",returning = "result")
	public void afterReturning(JoinPoint joinPoint,Object result) {
        System.out.println("afterReturning advice");
        System.out.println("return values is :" + result.toString());

	}



	@AfterThrowing(value = "execution(* com.example.demo.controller.UserRestController.*(..))",throwing = "ex")
    public void afterThrowingAdvice(JoinPoint joinPoint, Exception ex)  
    {  
        System.out.println("After Throwing exception in method:"+joinPoint.getSignature());  
        System.out.println("Exception is:"+ex.getMessage());  
    }  


   /*  @Around(value = "execution(* com.example.demo.controller.*.*(..))")
	public void aroundAdvice(ProceedingJoinPoint pjp) {
        System.out.println("after advice");
        System.out.println("class name is:" +pjp.getClass().getName());
		System.out.println("Before method:" + pjp.getSignature());
        System.out.println("args names are : "+pjp.getArgs().toString());
	}*/


}
