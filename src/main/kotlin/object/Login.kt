package `object`

import baseClass.BaseSetUp
import org.openqa.selenium.By

class Login : BaseSetUp() {
    private val email = By.id("email")
    fun email(x: String) {
        input(email, x)
    }

    private val password = By.id("password")
    fun password(x: String) {
        input(password, x)
    }

    private val login = By.ByXPath("/html/body/div/div/div/div/form/div[4]/button")
    fun login() {
        click(login)
    }

}
