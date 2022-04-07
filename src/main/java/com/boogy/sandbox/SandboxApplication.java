package com.boogy.sandbox;

import com.boogy.sandbox.domain.House;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SandboxApplication {

    public static void main(String[] args) {
        House bigsbyCt = new House();
        bigsbyCt.setYearBuilt(1978);
        bigsbyCt.setAddress("3045");

        System.out.println(bigsbyCt.getYearBuilt());
        System.out.println(bigsbyCt.getAddress().toLowerCase());

        House klondike = new House(2022, "klondike");

		System.out.println(klondike.getYearBuilt());
		System.out.println(klondike.getAddress().toLowerCase());

//		SpringApplication.run(SandboxApplication.class, args);
    }

}
