package util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Steps extends Methods {



    public void clickElement(String key) {
        WebElement element = findElement(key);
        clickToElement(element);
    }


    public void ifElementExistClick(String key) {
        waitSecond(2);
        List<WebElement> elements = driver.findElements(By.cssSelector(key));
        if (elements.size()>0){
            clickToElement(elements.get(0));
        }

    }
    public void randomClick(String key){
        List<WebElement> elements = findElements(key);
        clickToElement(elements.get(randomInt()));

    }

    public void sendKeysToElementTest(String key, String text) {
        WebElement element = findElement(key);
        sendKeysToElement(element, text);
    }

    public void waitSecond(int second) {
        waitByMilliSeconds(second * 1000);

    }

    public void getTextControlTest(String key, String text) {
        WebElement element = findElement(key);
        getTextControl(element, text);
    }

    public void performScrollAction(String key ) {
        WebElement elementToScrollTo = driver.findElement(By.id("elementId"));
        scrollToElement(elementToScrollTo);
    }




//    public void SelectElement(String key, String text) {
//        SelectMethod(key, text);
//    }
//
}
