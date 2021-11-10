package edu.ib.game.app.cardconteiner

import edu.ib.game.app.card.Card
import edu.ib.game.app.cardconteiner.exception.CardContainerException
import edu.ib.game.app.cardconteiner.exception.EmptyDeckException
import javafx.scene.image.Image

open class CardContainer {

    //var avers=Image("/test/test.png")

    //var revers=Image("/test/test.png")

    val cards = ArrayList<Card>()

    fun sort(comparator: Comparator<Card>){
        cards.sortWith(comparator)
    }

    fun addCard(card:Card){
        cards.add(card);
    }
    fun addCard(index: Int, card:Card){
        cards.add(index,card)
    }
    fun getCard(index: Int): Card{

        return cards[index]
    }
    fun getTopCard(): Card{
        try {
            return cards[0]
        } catch(e:ArrayIndexOutOfBoundsException){
            throw EmptyDeckException("Card container is empty!",e)
        }
    }

    fun CardContainer.isEmpty(): Boolean{
        return cards.isEmpty()
    }

    fun moveCardTo(card: Card, cardContainer: CardContainer){
        cards.remove(card)
        cardContainer.addCard(card)
    }

    fun moveCardTo(index: Int, card: Card, cardContainer: CardContainer){
        cards.remove(card)
        cardContainer.addCard(index,card)
    }

    fun empty(){
        cards.removeAll(cards)
    }

    fun moveAllCardsTo(cardContainer: CardContainer){
        cardContainer.cards.addAll(cards)
        empty()
    }

    fun shuffle(){
        cards.shuffle();
    }

    infix fun CardContainer.contains(card: Card):Boolean{
        return cards.contains(card)
    }

}