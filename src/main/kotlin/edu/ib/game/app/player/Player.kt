package edu.ib.game.app.player

import edu.ib.game.app.card.Card
import edu.ib.game.app.cardconteiner.Hand

abstract class Player(val hand:Hand = Hand()){

    abstract fun playCardFromHand(card: Card)

}
