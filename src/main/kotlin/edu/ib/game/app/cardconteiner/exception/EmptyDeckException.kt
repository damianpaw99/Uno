package edu.ib.game.app.cardconteiner.exception

class EmptyDeckException(message: String?) : CardContainerException(message) {

    constructor(message: String?,throwable: Throwable) : this(message){
        this.initCause(throwable)
    }
}