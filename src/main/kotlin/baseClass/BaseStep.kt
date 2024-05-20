package baseClass

import `object`.Login
import `object`.MasterData

open class BaseStep {
    companion object {

        val login = Login()
        val masterData = MasterData()

    }
}
