package edu.ib.game.app.card

import javafx.event.EventHandler
import javafx.scene.input.MouseEvent
import java.util.*


class NormalCard(cardColor: CardColor, number: Int, text: String?) : Card(cardColor, text) {

    constructor(cardColor: CardColor, number: Int, text:String?, x: Double, y:Double) : this(cardColor, number, text){
        this.layoutX=x;
        this.layoutY=y;
    }

    fun setOnClickFunction(eventListener: EventHandler<MouseEvent>){
        this.onMouseClicked=eventListener
    }


}