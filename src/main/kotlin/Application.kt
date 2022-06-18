import javafx.stage.Stage
import tornadofx.App
import tornadofx.importStylesheet

class Application: App() {
    override val primaryView = Calculator::class

    override fun start(stage: Stage) {
        importStylesheet("/style.css")
        stage.isResizable = false
        super.start(stage)
    }
}
