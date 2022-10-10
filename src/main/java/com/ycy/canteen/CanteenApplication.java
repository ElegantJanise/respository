package com.ycy.canteen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class CanteenApplication {

    public static void main(String[] args) {
        SpringApplication.run(CanteenApplication.class, args);
    }


    @Bean
    public TomcatServletWebServerFactory servletContainer(){
        return new TomcatServletWebServerFactory(80) ;
    }

    /**
     * 后端返回数据：跨域问题
     */
    @Configuration
    public class GlobalCorsConfig {
        @Bean
        public CorsFilter corsFilter() {
            //1.添加CORS配置信息
            CorsConfiguration config = new CorsConfiguration();
            //放行哪些原始域
            config.addAllowedOrigin("*");
            //是否发送Cookie信息
            config.setAllowCredentials(true);
            //放行哪些原始域(请求方式)
            config.addAllowedMethod("OPTIONS");
            config.addAllowedMethod("HEAD");
            config.addAllowedMethod("GET");     //get
            config.addAllowedMethod("PUT");     //put
            config.addAllowedMethod("POST");    //post
            config.addAllowedMethod("DELETE");  //delete
            config.addAllowedMethod("PATCH");
            config.addAllowedHeader("*");

            //2.添加映射路径
            UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
            configSource.registerCorsConfiguration("/**", config);

            //3.返回新的CorsFilter.
            return new CorsFilter(configSource);
        }

    }
}
