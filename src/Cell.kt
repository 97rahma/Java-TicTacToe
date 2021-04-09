class Cell {
    //This is one cell of the game grid
    var contents: String = " "
    var empty: Boolean = true
    fun output(): String {
        return contents
    }

    fun placeMark() {
        contents = if (TicTacToe.count % 2 == 0) {
            "X"
        } else {
            "O"
        }
        empty = false
    }
}