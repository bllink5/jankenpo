fun main(){
    println("///// SELAMAT DATANG /////")
    println("/////       DI       /////")
    println("///// PERMAINAN SUIT /////")
    println("//////////////////////////")
    println("/////    MAIN MENU   /////")
    println("/// 1.PLAYER VS PLAYER ///")
    println("// 2.PLAYER VS COMPUTER //")
    println("/////     3.EXIT     /////")

    val input = readLine()?.toInt()
    when(input){
        //1 -> println("${player()}")
        2 -> println("")
        3 -> println("GAME OVER")
    }
}
