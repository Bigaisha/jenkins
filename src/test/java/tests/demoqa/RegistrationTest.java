package tests.demoqa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationTest extends TestBase {
    @Test
    void practice() {

        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        $("[alt=\"adplus-dvertising\"]").click();
        $("#firstName").setValue("Bigaisha");
        $("#lastName").setValue("Shalabayeva");
        $("#userEmail").setValue("bigaisha@gmail.com");
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue("7023998900");
        $("#currentAddress").setValue("Samal-1-19-3");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("November");
        $(".react-datepicker__year-select").selectOption("1991");
        $("[aria-label$='November 5th, 1991']").click();
        $("#subjectsInput").setValue("Eng");
        $("#subjectsWrapper").$(byText("English")).click();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#uploadPicture").uploadFromClasspath("img/1.png");
        $("#state").scrollTo().click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

        $(".table").shouldHave(
                text("Bigaisha Shalabayeva"), text("bigaisha@gmail.com"),
                text("Female"), text("7023998900"),
                text("05 November,1991"), text("English"),
                text("Reading"), text("1.png"),
                text("Samal-1-19-3"), text("NCR Delhi"),
                text("7023998900"), text("7023998900")
        );
    }
}



