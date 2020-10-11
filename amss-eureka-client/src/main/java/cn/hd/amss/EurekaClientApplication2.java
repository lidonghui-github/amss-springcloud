package cn.hd.amss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(value = "cn.hd.amss.dao")
public class EurekaClientApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication2.class,args);
    }
}
