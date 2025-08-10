package ReusableMethods;

import org.openqa.selenium.WebDriver;

public class TestData {
    private WebDriver driver;

    public TestData(WebDriver driver){
        this.driver = driver;
    }

    public static final String USERNAME = "01727003612";
    public static final String PASSWORD = "riya";
}
