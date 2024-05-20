package `object`

import baseClass.BaseSetUp
import org.openqa.selenium.By

class MasterData : BaseSetUp(){

    private val masterData = By.ByXPath("//*[@id=\"sidebarnav\"]/li[3]/a/span")
    fun masterData() {
        click(masterData)
    }

    private val addData = By.ByXPath("//*[@id=\"main-wrapper\"]/div/div[2]/div/div[2]/div/a")
    fun addData() {
        click(addData)
    }

    private val tid = By.id("tid")
    fun tid(x: String) {
        input(tid, x)
    }

    private val regional = By.id("regional")
    fun regional(x: String) {
        input(regional, x)
    }

    private val kcSupervisi = By.id("branch_name")
    fun kcSupervisi(x: String) {
        input(kcSupervisi, x)
    }

    private val branchCode = By.id("branch_code")
    fun branchCode(x: String) {
        input(branchCode, x)
    }

    private val lokasi = By.id("location")
    fun lokasi(x: String) {
        input(lokasi, x)
    }

    private val address = By.id("address")
    fun address(x: String) {
        input(address, x)
    }

    private val latitude = By.id("lat")
    fun latitude(x: String) {
        input(latitude, x)
    }

    private val longitude = By.id("long")
    fun longitude(x: String) {
        input(longitude, x)
    }

    private val save = By.ByXPath("//*[@id=\"main-wrapper\"]/div/div[3]/div/div/div/div/form/div[8]/button")
    fun save() {
        click(save)
    }

}