package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import static support.TestContext.getDriver;

public class CommonStepDefs {

    @Given("I go to {string} site")
    public void iGoToPage(String page) {
        switch (page) {
            case "tesla" -> getDriver().get("https://www.tesla.com/");
        }
    }

    @And("I wait for {int} sec")
    public void iWaitForSec(int sec) throws InterruptedException {
        Thread.sleep(sec * 1000);

    }
}
