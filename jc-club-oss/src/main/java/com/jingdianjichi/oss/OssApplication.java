package com.jingdianjichi.oss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * oss服务启动器
 * 
 * @author: ChickenWing
 * @date: 2023/10/11
 */
@SpringBootApplication
@ComponentScan("com.jingdianjichi")
public class OssApplication {

    public static void main(String[] args) {
        SpringApplication.run(OssApplication.class);
    }
/*short

    Select * from Stu_name left join Stu_score on Stu_name.name = Stu_score where socre is null;

    s*/
}
