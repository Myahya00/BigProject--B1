package BPB1.Load;

import org.openqa.selenium.support.ui.WebDriverWait;

import static BPB1.Basic.Basic.driver;

public class TestLoad {
    public static long PAGE_LOAD_TIMEOUT = 20;
    public static long IMPLICIT_WAIT = 10;
    WebDriverWait wait = new WebDriverWait(driver, 10);
}