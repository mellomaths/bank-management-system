package com.mellomaths.bank.core;

import org.springframework.boot.SpringApplication;

public class TestBankCoreApplication {

	public static void main(String[] args) {
		SpringApplication.from(BankCoreApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
