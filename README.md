# test-project1
error I am facing.
---------------------------------------------------------------------

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2022-02-20 00:16:37.994 ERROR 25880 --- [  restartedMain] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'projectingArgumentResolverBeanPostProcessor' defined in class path resource [org/springframework/data/web/config/ProjectingArgumentResolverRegistrar.class]: BeanPostProcessor before instantiation of bean failed; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'metaDataSourceAdvisor': Cannot resolve reference to bean 'methodSecurityMetadataSource' while setting constructor argument; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'methodSecurityMetadataSource' defined in class path resource [org/springframework/security/config/annotation/method/configuration/GlobalMethodSecurityConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.security.access.method.MethodSecurityMetadataSource]: Factory method 'methodSecurityMetadataSource' threw exception; nested exception is java.lang.IllegalStateException: In the composition of all global method configuration, no annotation support was actually activated
	at org.springframework.beans.factory.support.AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.createBean(AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.java:537) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:213) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.context.support.PostProcessorRegistrationDelegate.registerBeanPostProcessors(PostProcessorRegistrationDelegate.java:270) ~[spring-context-5.3.15.jar:5.3.15]
	at org.springframework.context.support.AbstractApplicationContext.registerBeanPostProcessors(AbstractApplicationContext.java:762) ~[spring-context-5.3.15.jar:5.3.15]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:567) ~[spring-context-5.3.15.jar:5.3.15]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:145) ~[spring-boot-2.6.3.jar:2.6.3]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:732) ~[spring-boot-2.6.3.jar:2.6.3]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:414) ~[spring-boot-2.6.3.jar:2.6.3]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:302) ~[spring-boot-2.6.3.jar:2.6.3]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1303) ~[spring-boot-2.6.3.jar:2.6.3]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1292) ~[spring-boot-2.6.3.jar:2.6.3]
	at com.exam.DurgeshExamPortalApplication.main(DurgeshExamPortalApplication.java:23) ~[classes/:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
	at org.springframework.boot.devtools.restart.RestartLauncher.run(RestartLauncher.java:49) ~[spring-boot-devtools-2.6.3.jar:2.6.3]
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'metaDataSourceAdvisor': Cannot resolve reference to bean 'methodSecurityMetadataSource' while setting constructor argument; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'methodSecurityMetadataSource' defined in class path resource [org/springframework/security/config/annotation/method/configuration/GlobalMethodSecurityConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.security.access.method.MethodSecurityMetadataSource]: Factory method 'methodSecurityMetadataSource' threw exception; nested exception is java.lang.IllegalStateException: In the composition of all global method configuration, no annotation support was actually activated
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:342) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:113) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.ConstructorResolver.resolveConstructorArguments(ConstructorResolver.java:693) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor(ConstructorResolver.java:198) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.autowireConstructor(AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.java:1372) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.createBeanInstance(AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.java:1222) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.doCreateBean(AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.java:582) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.createBean(AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.java:542) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:213) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.aop.framework.autoproxy.BeanFactoryAdvisorRetrievalHelper.findAdvisorBeans(BeanFactoryAdvisorRetrievalHelper.java:91) ~[spring-aop-5.3.15.jar:5.3.15]
	at org.springframework.aop.framework.autoproxy.AbstractAdvisorAutoProxyCreator.findCandidateAdvisors(AbstractAdvisorAutoProxyCreator.java:111) ~[spring-aop-5.3.15.jar:5.3.15]
	at org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator.findCandidateAdvisors(AnnotationAwareAspectJAutoProxyCreator.java:92) ~[spring-aop-5.3.15.jar:5.3.15]
	at org.springframework.aop.aspectj.autoproxy.AspectJAwareAdvisorAutoProxyCreator.shouldSkip(AspectJAwareAdvisorAutoProxyCreator.java:101) ~[spring-aop-5.3.15.jar:5.3.15]
	at org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator.postProcessBeforeInstantiation(AbstractAutoProxyCreator.java:253) ~[spring-aop-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.applyBeanPostProcessorsBeforeInstantiation(AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.java:1160) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.resolveBeforeInstantiation(AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.java:1135) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.createBean(AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.java:531) ~[spring-beans-5.3.15.jar:5.3.15]
	... 19 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'methodSecurityMetadataSource' defined in class path resource [org/springframework/security/config/annotation/method/configuration/GlobalMethodSecurityConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.security.access.method.MethodSecurityMetadataSource]: Factory method 'methodSecurityMetadataSource' threw exception; nested exception is java.lang.IllegalStateException: In the composition of all global method configuration, no annotation support was actually activated
	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:658) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:486) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.instantiateUsingFactoryMethod(AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.java:1352) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.createBeanInstance(AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.java:1195) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.doCreateBean(AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.java:582) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.createBean(AH8q3dGK2f2vLZVgbRfLTjQPySe2yRaJHs.java:542) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:330) ~[spring-beans-5.3.15.jar:5.3.15]
	... 38 common frames omitted
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.security.access.method.MethodSecurityMetadataSource]: Factory method 'methodSecurityMetadataSource' threw exception; nested exception is java.lang.IllegalStateException: In the composition of all global method configuration, no annotation support was actually activated
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:185) ~[spring-beans-5.3.15.jar:5.3.15]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:653) ~[spring-beans-5.3.15.jar:5.3.15]
	... 48 common frames omitted
Caused by: java.lang.IllegalStateException: In the composition of all global method configuration, no annotation support was actually activated
	at org.springframework.util.Assert.state(Assert.java:76) ~[spring-core-5.3.15.jar:5.3.15]
	at org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration.methodSecurityMetadataSource(GlobalMethodSecurityConfiguration.java:356) ~[spring-security-config-5.6.1.jar:5.6.1]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:154) ~[spring-beans-5.3.15.jar:5.3.15]
	... 49 common frames omitted
