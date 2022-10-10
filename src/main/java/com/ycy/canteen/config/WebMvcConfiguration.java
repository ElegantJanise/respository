package com.ycy.canteen.config;


import com.ycy.canteen.resolver.PostEntityHandlerMethodArgumentResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;
import org.springframework.web.servlet.mvc.method.annotation.ServletModelAttributeMethodProcessor;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Slf4j
@Configuration
public class WebMvcConfiguration {

    @Autowired
    private RequestMappingHandlerAdapter ha;

    private ServletModelAttributeMethodProcessor servletModelAttributeMethodProcessor = null;

    private RequestResponseBodyMethodProcessor requestResponseBodyMethodProcessor = null;

    @PostConstruct
    private void init() {
        List<HandlerMethodArgumentResolver> argumentResolvers = ha.getArgumentResolvers();
        for (HandlerMethodArgumentResolver argumentResolver : argumentResolvers) {
            if (argumentResolver instanceof ServletModelAttributeMethodProcessor) {
                servletModelAttributeMethodProcessor = (ServletModelAttributeMethodProcessor) argumentResolver;
            } else if (argumentResolver instanceof RequestResponseBodyMethodProcessor) {
                requestResponseBodyMethodProcessor = (RequestResponseBodyMethodProcessor) argumentResolver;
            }
            if (servletModelAttributeMethodProcessor != null && requestResponseBodyMethodProcessor != null) {
                break;
            }
        }
        PostEntityHandlerMethodArgumentResolver postEntityHandlerMethodArgumentResolver = new PostEntityHandlerMethodArgumentResolver(requestResponseBodyMethodProcessor, servletModelAttributeMethodProcessor);
        List<HandlerMethodArgumentResolver> newList = new ArrayList<>(argumentResolvers.size() + 1);
        newList.add(postEntityHandlerMethodArgumentResolver);
        newList.addAll(argumentResolvers);
        ha.setArgumentResolvers(newList);
    }
}
