class Silvestre(var nome: String){
    var atck: Int = 0
    constructor(nome:String, atck:Int) : this(nome){
        this.atck = atck
    }

    fun AP(){
        println("Meu animal silvestre é $nome e seu ataque é $atck")
    }
}

fun main() {
    val s1 = Silvestre("Águia")
    val s2 = Silvestre("Serpente", 1000)
    s1.AP()
    s2.AP()
}