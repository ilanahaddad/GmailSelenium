package com.ilana.arielle;

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