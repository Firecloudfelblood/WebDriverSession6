package Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import page.GooglePage;

public class GoogleActions extends  ParentActions{
    GooglePage locators = new GooglePage(driver);

    public void ImInTheHomePage() {
        Im_InTheHomePage();
    }

    public void SearchFor(String wwe) {
        Search_For(wwe);
    }

    public void ValidateResults() {
        Validate_Results();
    }

    private void Im_InTheHomePage() {
        driver.get("https://www.google.com/");
        System.out.println("\n\n\n\n\nGoing to google");
    }

    private void Search_For(String wwe) {
        locators.getSearchBar().sendKeys(wwe);
        wait.until(ExpectedConditions.elementToBeClickable(locators.getSearchButton())).click();
        System.out.println("Searching for WWE");
    }

    private void Validate_Results() {
        if(!locators.getExpectedResult().isEmpty()){
            System.out.println("it works");
        } else{
            System.out.println("Huston we have a problem");
        }
        driver.close();
    }
}
