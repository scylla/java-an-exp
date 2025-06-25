package example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransformAspect {
    @Around("@annotation(upperCase)")
    public Object transform(ProceedingJoinPoint pjp, UpperCase upperCase) throws Throwable {
        Object target = pjp.getTarget();
        if (target instanceof MyService service) {
            Object[] args = pjp.getArgs();
            if (service.isTransformEnabled() && args != null && args.length > 0 && args[0] instanceof String) {
                args[0] = ((String) args[0]).toUpperCase();
            }
            return pjp.proceed(args);
        }
        return pjp.proceed();
    }
}
