package testStep

import baseClass.BaseSetUp
import baseClass.BaseStep
import io.cucumber.java.en.And
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class MasterDataStep : BaseStep() {
    @When("I click master data")
    fun iClickMasterData() {
        masterData.masterData()
    }

    @Then("Success to open page master data")
    fun successToOpenPageMasterData() {
    }

    @And("I click add data")
    fun iClickAddData() {
        masterData.addData()
    }

    @And("I input tid {string}")
    fun iInputTid(x: String) {
        masterData.tid(x)
    }

    @And("I input regional office kanwil {string}")
    fun iInputRegionalOfficeKanwil(x: String){
        masterData.regional(x)
    }

    @And("I input kc supervisi {string}")
    fun iInputKCSupervisi(x: String) {
        masterData.kcSupervisi(x)
    }

    @And("I input branch code {string}")
    fun iInputBranchCode(x: String) {
        masterData.branchCode(x)
    }

    @And("I input lokasi {string}")
    fun iInputLokasi(x: String) {
        masterData.lokasi(x)
    }

    @And("I input address {string}")
    fun iInputAddress(x: String) {
        masterData.address(x)
    }

    @And("I input latitude {string}")
    fun iInputLatitude(x: String) {
        masterData.latitude(x)
    }

    @And("I input longitude {string}")
    fun iInputLongitude(x: String) {
        masterData.longitude(x)
    }

    @And("I click save")
    fun iClickSave() {
        masterData.save()
    }

    @Then("Success to add master data")
    fun successToAddMasterData() {

    }

}