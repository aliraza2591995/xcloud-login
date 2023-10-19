package xcloud;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;

public class GetTextForAssertions extends PageComponent {
    public String tmeUserName () {
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        WebElementFacade userTitle = $("//div[@class='ah-header-account-info-username']");
//        userTitle.shouldBeVisible();
        userTitle.waitUntilVisible();
        return userTitle.getText();
    }
    public String ztaUserName () {
        WebElementFacade userTitle = $("//p[@title='Azfar Altaf']");
//        userTitle.shouldBeVisible();
        userTitle.waitUntilVisible();
        return userTitle.getText();
    }
}