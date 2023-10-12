package Scenario;

import BaseTest.Base;
import org.junit.Test;
import util.Steps;

public class ScenarioTest extends Base {
    Steps steps = new Steps();

    @Test
    public void TestSenaryosu() throws Exception {
        steps.ifElementExistClick("#close-button-1454703513202"); // close the add
        steps.ifElementExistClick("#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");// accept cookies if exist
        System.out.println("Clicked the 'Accept Cookies' button.");
        steps.getTextControlTest("button[class='Tab__StyledTab-sc-1gyyeis-1 eDgwud'] span[class='Tab__TabText-sc-1gyyeis-2 " +
                "czbyok']", "Otel"); //check "otel" text
        steps.waitSecond(3); // wait for 3 seconds
        steps.sendKeysToElementTest("input[placeholder='Otel Adı Veya Konum']", "Antalya"); //Write "Antalya" to where to go input
        steps.ifElementExistClick("div[class='ResponsiveListingSearchStyle__ResponsiveLocationItems-sc-1kumzgx-10 xpENY'] div:nth-child(2)");// Antalya click and check
        steps.clickElement("span[class='styled__StyledCustomIcon-sc-d0bnog-0 kXTrAK'] span[class='Icon__IconWrapper-sc-etcw2b-0 pKZaC']"); // click booking date
        steps.clickElement("button[class='styled__StyledButton-sc-1i7jkmi-0 jBiEGt DatePickerStyle__NavNextButton-sc-1yq2271-2 ihrCIi']"); //click next month arrow (5 times)
        steps.waitSecond(2);
        steps.clickElement("button[class='styled__StyledButton-sc-1i7jkmi-0 jBiEGt DatePickerStyle__NavNextButton-sc-1yq2271-2 ihrCIi']");
        steps.waitSecond(2);
        steps.clickElement("button[class='styled__StyledButton-sc-1i7jkmi-0 jBiEGt DatePickerStyle__NavNextButton-sc-1yq2271-2 ihrCIi']");
        steps.waitSecond(2);
        steps.clickElement("button[class='styled__StyledButton-sc-1i7jkmi-0 jBiEGt DatePickerStyle__NavNextButton-sc-1yq2271-2 ihrCIi']");
        steps.waitSecond(2);
        steps.clickElement("button[class='styled__StyledButton-sc-1i7jkmi-0 jBiEGt DatePickerStyle__NavNextButton-sc-1yq2271-2 ihrCIi']"); // 5 times
        steps.waitSecond(2);
        steps.clickElement("td[aria-label='Choose Pazartesi, 1 Nisan 2024 as your check-in date. It’s available.'] span[class='helpers__CalenderDay-sc-1l68pts-0 eUSbRE']"); // click first day of April 2024
        steps.waitSecond(2);

        System.out.println("do it again later");

        steps.clickElement("td[aria-label='Choose Pazar, 7 Nisan 2024 as your check-in date. It’s available.']"); //click 7th of April
        steps.clickElement("button[type='submit']"); // click Apply button
        steps.clickElement("div[class='ResponsiveListingSearchStyle__ResponsiveSearchDrawerItemContent-sc-1kumzgx-1 fXdsuw border-bottom-hidden'] " +
                "div[class='ResponsiveListingSearchStyle__ResponsiveSearchDrawerItemText-sc-1kumzgx-2 kWHsTA']"); // click number of people
        steps.clickElement("body > div:nth-child(45) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) " +
                "> div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)> div:nth-child(1) > div:nth-child(2)" +
                " > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > button:nth-child(3)"); // click add person plus button
        steps.clickElement("button[type='button']"); //click search button
        steps.waitSecond(5); // wait for 5 seconds
        steps.randomClick(".styled__DesktopItems-sc-xe39ep-2.coVbSa"); // chose a random place
        steps.performScrollAction(".styled__TextContainer-sc-g6lxf7-1.ihOdzT"); // scroll to text container
        steps.getTextControlTest(".styled__TextContainer-sc-g6lxf7-1.ihOdzT", "Antalya Otelleri ve En Uygun Antalya Otel Fiyatları"); // check the text
        steps.waitSecond(2);



    }
}
