class Animal_(var especie:String){
    var fala: String = ""
    init {
        fala = if(especie.lowercase() == "cachorro"){
            "auuuuu!"
        }else if(especie.lowercase() == "gato"){
            "miauuu"
        }else{
            ""
        }
    }
    init {
        println(fala)
    }
    fun falar(){
        println(fala)
    }
}

fun main() {
    val animal = Animal_("Cachorro")
    Animal_("Gato").falar()
    Animal_("Cachorro").fala
}