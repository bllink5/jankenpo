fun main () {
    println("///// PLAYER VS PLAYER /////")
    println("      ////////////////      ")
    print("PLAYER 1 silahkan pilih batu,kertas,gunting : ")
    var pp1 = arrayOf("batu","kertas","gunting").toString()
    var p1 = readLine()?.trim()?.toLowerCase()
    print("PLAYER 2 silahkan pilih batu,kertas,gunting : ")
    val p2 = readLine()?.trim()?.toLowerCase()
    var invalid = false



    if (p1.equals(p2)){
        println("SERI")
    }else if (p1.equals("batu")&& p2.equals("gunting")){
        println("PLAYER 1 WIN !!")
    }else if (p1.equals("gunting")&& p2.equals("kertas")){
        println("PLAYER 1 WIN !!")
    }else if (p1.equals("kertas")&& p2.equals("batu")){
        println("PLAYER 1 WIN !!")
    }else if (p1.equals("batu")&& p2.equals("kertas")){
        println("PLAYER 2 WIN !!")
    }else if (p1.equals("kertas")&& p2.equals("gunting")){
        println("PLAYER 2 WIN !!")
    }else if (p1.equals("gunting")&& p2.equals("batu")){
        println("PLAYER 2 WIN !!")
    }
    while (!invalid ){
        println("Input salah")
        println("Coba lagi")
        println("PLAYER 1 silahkan pilih batu,kertas,gunting")
        p1 = readLine()?.trim()?.toLowerCase()
        if (p1 != null && p1 != pp1){
            invalid = true
            pp1 = p1
        }
        if (!invalid){
            println("Silahkan pilih batu,kertas,gunting")
        }
        return
    }
}


