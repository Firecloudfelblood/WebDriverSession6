package page;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Getter
public class GooglePage {
    @FindBy(name = "q")
    private WebElement searchBar;

    @FindBy(name = "btnK")
    private WebElement searchButton;

    @FindBy(name = "btnLucky")
    private WebElement feelingLuckyButton;

    @FindBy(css = "button")
    private List<WebElement> listaBotones;

    @FindBy(xpath = "//cite")
    private List<WebElement> expectedResult;

    public GooglePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
