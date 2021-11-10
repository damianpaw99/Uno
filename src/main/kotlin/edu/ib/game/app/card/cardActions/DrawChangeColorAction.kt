package edu.ib.game.app.card.cardActions

class DrawChangeColorAction:CardAction {
    override fun playCardAction() {
        val changeColorAction=ChangeColorAction()
        val drawCardsAction=DrawCardsAction()
        changeColorAction.playCardAction()
        drawCardsAction.playCardAction()
    }
}