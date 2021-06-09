package mutaz.code.springcode;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

//@Component
// The main characteristic of a bean post-processor is that it processes all
//the bean instances in the IoC container, not just a single bean instance.
// Typically, bean post-processors are used to check the validity of bean properties,
// alter bean properties according to particular criteria, or apply
//certain tasks to all bean instances.
public class PrintBeanNamePostProcesser implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName);
        return bean;
    }
}
