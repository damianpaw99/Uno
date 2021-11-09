package edu.ib.game.app.card

enum class CardColor {

    Red, Blue, Yellow, Green, Black;

    companion object{
        fun getColor(index: Int):CardColor{
            return when(index){
                0 -> Red
                1 -> Blue
                2 -> Yellow
                3 -> Green
                4 -> Black
                else -> throw Exception("Wrong color number")
            }
        }
    }

}
