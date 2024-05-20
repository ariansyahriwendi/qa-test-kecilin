package testStep

import baseClass.BaseStep
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class LoginStep : BaseStep() {
    @Given("Account is created")
    fun accountIsCreated() {
    }

    @When("I open website")
    fun iOpenWebsite() {
    }

    @And("I input email {string}")
    fun iInputEmail(x: String) {
        login.email(x)
    }

    @And("I input password {string}")
    fun iInputPassword(x: String) {
        login.password(x)
    }

    @And("I click login")
    fun iClickLogin() {
        login.login()
    }

    @Then("Success to login")
    fun successToLogin() {

    }

    @Given("Logged in")
    fun loggedIn() {
        login.email("akunusertest@yopmail.com")
        login.password("Password123@")
        login.login()
    }

}
