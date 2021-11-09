package edu.ib.game.view

import edu.ib.game.app.Styles
import edu.ib.game.app.card.NormalCard
import edu.ib.game.app.cardconteiner.Deck
import edu.ib.game.app.controllers.MainController
import tornadofx.*

class MainView : View("UNO project") {

    private val controller: MainController by inject()

    override val root = controller.anchorPane

    init {
        primaryStage.isFullScreen=true
        primaryStage.fullScreenExitHint=""
    }

}