package edu.ib.game.app.player.AI

import edu.ib.game.app.card.Card
import edu.ib.game.app.cardconteiner.Hand

interface AIModel {

    fun decideCardToPlay(hand: Hand, topCard: Card): Card
}