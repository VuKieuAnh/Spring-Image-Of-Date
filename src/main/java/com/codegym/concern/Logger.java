package com.codegym.concern;

import com.codegym.model.Comment;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Logger {

    public void badWordNotify() {
        System.out.println("badword");
    }

    @AfterThrowing(pointcut = "execution(public * com.codegym.service.CommentService.checkBadWord(..))", throwing = "e")
    public void log(JoinPoint joinPoint, Exception e) {
//        String className = joinPoint.getTarget().getClass().getSimpleName();
//        String method = joinPoint.getSignature().getName();
//        String args = Arrays.toString(joinPoint.getArgs());
//        System.out.println(String.format("badword : %s.%s  %s: %s", className, method, args, e.getMessage()));


        Object[] signatureArgs = joinPoint.getArgs();
        for (Object signatureArg : signatureArgs) {
            Comment comment = (Comment) signatureArg;
            String time = java.time.LocalTime.now().toString();
            System.out.println("Feedback:" + comment.getFeedback()
                    + ". Author: " + comment.getAuthor()
                    + ". Date: " + comment.getDate()
                    +". Time: "+ time);
        }
    }
}
