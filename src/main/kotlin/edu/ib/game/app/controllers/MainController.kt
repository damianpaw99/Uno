package edu.ib.game.app.controllers

import edu.ib.game.app.Game
import edu.ib.game.app.Styles
import edu.ib.game.app.card.Card
import edu.ib.game.app.card.CardColor
import edu.ib.game.app.card.NormalCard
import javafx.scene.layout.AnchorPane
import tornadofx.*


class MainController: Controller() {
    var game = Game(this);

    var anchorPane: AnchorPane = AnchorPane();


    init {

    }
}