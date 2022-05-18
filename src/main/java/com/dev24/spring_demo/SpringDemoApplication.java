package com.dev24.spring_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

//	@Scheduled(fixedRate = 1000L)
//	public void startRate(){
//		System.out.println("New rate " + new Date());
//	}
//	@Scheduled(fixedDelay = 1000L)
//	public void starDelay(){
//		System.out.println("New startDelay " + new Date());
//	}
//	@Scheduled(cron = "* * * * * *") // * * * * * * -> ss mm hh dd month weekday
//	public void startCron(){
//		System.out.println("New startCron " + new Date());
//	}
//Ma'lum bir funksiyani ma'lum bir vaqt intervali bilan ishga tushirish uchun qo'llaniladi

}
