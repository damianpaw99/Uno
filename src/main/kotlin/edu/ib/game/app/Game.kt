package edu.ib.game.app

import edu.ib.game.app.cardconteiner.Deck
import edu.ib.game.app.player.AI.RandomModel
import edu.ib.game.app.player.AIPlayer
import edu.ib.game.app.player.HumanPlayer
import edu.ib.game.app.player.Player
import tornadofx.*

class Game(controller: Controller) {

    var running = false;
    var players: ArrayList<Player> = ArrayList()
    var mainDeck = Deck.generateFullDeck(50.0,50.0)
    val removedCardDeck = Deck()
    var playerTurn: Int = (Math.random()*2).toInt();


    init {
        players.add(HumanPlayer())
        players.add(AIPlayer(RandomModel()));
    }

    fun startGame(){
         running = true;
    }

}