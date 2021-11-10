package edu.ib.game.app.controllers

import edu.ib.game.app.Game
import edu.ib.game.app.Styles
import edu.ib.game.app.card.Card
import edu.ib.game.app.card.CardColor
import edu.ib.game.app.card.NormalCard
import edu.ib.game.app.cardconteiner.Deck
import javafx.event.EventHandler
import javafx.scene.input.MouseEvent
import javafx.scene.layout.AnchorPane
import tornadofx.*


class MainController: Controller() {
    var game = Game(this);

    var anchorPane: AnchorPane = AnchorPane();

    init {
        anchorPane.id="anchorPane"
        this.primaryStage.addChildIfPossible(anchorPane)
        val testCard=NormalCard(CardColor.Blue,2,"Blue 2",40.0,40.0)

        for(card in game.mainDeck.cards){
            card.prefHeight=200.0
            card.prefWidth=200.0
            anchorPane.addChildIfPossible(card)
            card.onMouseClicked=EventHandler{
                game.mainDeck.cards.remove(card)
                game.mainDeck.cards[0].visibleProperty().set(true)
                game.mainDeck.cards[0].disableProperty().set(false)
                anchorPane.children.remove(card)
            }
        }
    }
}