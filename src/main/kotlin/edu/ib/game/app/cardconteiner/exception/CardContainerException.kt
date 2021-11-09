package edu.ib.game.app.cardconteiner.exception

abstract class CardContainerException(message: String?) : Exception(message) {

    constructor(message: String?,throwable: Throwable) : this(message) {
        this.initCause(throwable)
    }
}