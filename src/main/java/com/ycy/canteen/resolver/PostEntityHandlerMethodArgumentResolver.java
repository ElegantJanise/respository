package com.ycy.canteen.resolver;

import com.ycy.canteen.entities.PostEntity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;
import org.springframework.web.servlet.mvc.method.annotation.ServletModelAttributeMethodProcessor;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@AllArgsConstructor
public class PostEntityHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {

    private RequestResponseBodyMethodProcessor requestResponseBodyMethodProcessor;

    private ServletModelAttributeMethodProcessor servletModelAttributeMethodProcessor;

    private static final String APPLICATION_JSON = "application/json";

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        Class<?> parameterType = parameter.getParameterType();
        String parameterName = parameter.getParameterName();
        if (PostEntity.class.isAssignableFrom(parameterType)) {
            log.info("name:{},type:{}", parameterName, parameterType.getName());
            log.info("matched");
            return true;
        }
        return false;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        HttpServletRequest request = webRequest.getNativeRequest(HttpServletRequest.class);
        assert request != null;
        String contentType = request.getContentType();
        String requestType = request.getMethod();
        log.debug("Content-Type:{} requestType:{}", contentType, requestType);
        if (APPLICATION_JSON.equalsIgnoreCase(contentType) && HttpMethod.POST.name().equals(requestType)) {
            return requestResponseBodyMethodProcessor.resolveArgument(parameter, mavContainer, webRequest, binderFactory);
        } else {
            return servletModelAttributeMethodProcessor.resolveArgument(parameter, mavContainer, webRequest, binderFactory);
        }
    }
}
