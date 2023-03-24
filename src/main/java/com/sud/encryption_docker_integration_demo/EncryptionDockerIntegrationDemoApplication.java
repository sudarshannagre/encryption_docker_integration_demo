package com.sud.encryption_docker_integration_demo;

import javax.crypto.Mac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sud.encryption_docker_integration_demo.util.BouncyCastleEncryption;

@SpringBootApplication
public class EncryptionDockerIntegrationDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ct = SpringApplication.run(EncryptionDockerIntegrationDemoApplication.class, args);
		BouncyCastleEncryption bce = ct.getBean(BouncyCastleEncryption.class);
		
		Mac mac =bce.getMac("cHJvamVjdA==");//Base64 encode of "project"
		
		String result = bce.getEncryption("MyNames", mac);//Original String is MyNames
		
		System.out.println("Result : "+result);
	}

}
//Actual Result : for MyNames
//6f6f646f15559bd31b6fdd36331e2e9b0113326aed28a0df4d87c564c5112e5c
