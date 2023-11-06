package pages;

import org.openqa.selenium.support.PageFactory;

import static support.TestContext.getDriver;

public class Page {
    // constructor
    public Page() {
        PageFactory.initElements(getDriver(), this);
    }

    // fields
    protected String url;
    protected String title = getDriver().getTitle();

    // methods
    public void open() {
        getDriver().get(url);
    }

    public String getTitle() {
        return title;
    }
}

