package edu.ib.game.app.cardconteiner

import edu.ib.game.app.Game
import edu.ib.game.app.card.CardActions.DrawCardsAction
import edu.ib.game.app.card.CardColor
import edu.ib.game.app.card.NormalCard
import edu.ib.game.app.card.SpecialCard
import kotlin.properties.Delegates

class Deck : CardContainer() {

    var hideCard = false;

    var x: Double by Delegates.observable(0.0) { _, _, new ->
        run {
            for (card in cards) {
                card.layoutX = new;
            }
        }
    }
    var y: Double by Delegates.observable(0.0) { _, _, new ->
        run {
            for (card in cards) {
                card.layoutY = new;
            }
        }
    }
    companion object {
        fun generateFullDeck(x: Double, y: Double):Deck {
            val deck = Deck();

            for (i in 1 until 9) {
                for (j in 0 until 3) {
                    deck.addCard(NormalCard(CardColor.getColor(j), i, null)) //karty zwykłe podwójne
                    deck.addCard(NormalCard(CardColor.getColor(j), i, null))
                }
            }
            for (i in 0 until 3) {
                deck.addCard(NormalCard(CardColor.getColor(i), 0, null)) //karty 0 pojedyncze
            }
            //karty specjalne

            for (i in 0 until 3) {
                deck.addCard(SpecialCard(CardColor.Black,null,DrawCardsAction()))
            }

            deck.x = x
            deck.y = y
            deck.shuffle()
            deck.getCard(0).disableProperty().set(false)
            deck.getCard(0).visibleProperty().set(true)
            return deck
        }
    }
}