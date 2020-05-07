package com.github.steed777.taskcentrinform;

import com.github.steed777.taskcentrinform.controller.MainController;
import com.github.steed777.taskcentrinform.controller.FileUploadController;
import com.github.steed777.taskcentrinform.controller.RegistrationController;
import com.github.steed777.taskcentrinform.service.storage.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackageClasses=MainController.class)
@ComponentScan(basePackageClasses= RegistrationController.class)
@ComponentScan(basePackageClasses= FileUploadController.class)
@EnableConfigurationProperties(StorageProperties.class)
public class Main {

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Main.class, args);
    }
}