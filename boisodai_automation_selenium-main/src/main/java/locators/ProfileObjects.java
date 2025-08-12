package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfileObjects {
    public static WebDriver driver;

    public By profileicon = By.xpath("(//a[@class='flex bponi-y border bponi-md bponi-rf bponi-fj bponi-a shadow bponi-k bponi-gsa'])[1]");
    public By myordericon = By.xpath("(//a[@class='active-link group flex bponi-y bponi-ii bponi-ma bponi-xh bponi-sga hover:text-dark focus:text-dark dark:hover:text-light dark:focus:text-light bponi-sk bponi-x bponi-li bponi-w bponi-ki'])[1]");

}
