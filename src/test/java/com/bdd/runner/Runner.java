package com.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


@CucumberOptions(features = { "src/test/resources/features" },tags = "@LoginCliente",glue = { "com.bdd" })





public class Runner {
	
	
}