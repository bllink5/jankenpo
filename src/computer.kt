import kotlin.test.assertEquals

fun main(){
    println("///// PLAYER VS COMPUTER /////")
    println("      //////////////////      ")
    print("PLAYER \nsilahkan pilih batu,kertas,gunting : ")
    val py = readLine()?.trim()?.toLowerCase()
    val cp = arrayOf("batu","kertas","gunting")
    val cpt = cp.random()

    print("COMPUTER MEMILIH : $cpt")

    if (cpt.equals(py)){
        println("SERI")
    }
}