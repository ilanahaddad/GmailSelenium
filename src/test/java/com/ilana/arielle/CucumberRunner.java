package com.ilana.arielle;

//import cucumber.api.junit.*;
//import org.junit.runner.RunWith;
//import cucumber.api.junit.Cucumber;
//
//
//@RunWith(Cucumber.class)
//@Cucumber.Options(
//        format= {"pretty", "html:target/cucumber"},
//        features="src/test/resources"
//)
//public class CucumberRunner { }


import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        format= {"pretty", "html:target/cucumber"},
        features="src/test/resources"
)
public class CucumberRunner {

}