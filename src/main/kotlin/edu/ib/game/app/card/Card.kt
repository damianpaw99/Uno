package edu.ib.game.app.card

import edu.ib.game.app.cardconteiner.CardContainer
import edu.ib.game.app.cardconteiner.Deck
import edu.ib.game.app.cardconteiner.Hand
import javafx.beans.value.ObservableValue
import javafx.scene.control.Button
import tornadofx.*
import java.util.*
import kotlin.properties.Delegates

abstract class Card(val cardColor: CardColor, text: String?): Button(text) {


    init {
        disableProperty().set(true)
        visibleProperty().set(false)
    }

    fun moveCard(current: CardContainer, destination:CardContainer){
        current.moveCardTo(this,destination)
    }

    fun playCard(hand: Hand, destination: Deck){
        moveCard(hand,destination)
    }
}