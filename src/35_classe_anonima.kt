interface Evento{
    fun ok(){

    }
}
class Programa{
    fun salvar(e:Evento){
        println("Abrindo aquivos")
        println("Salvando valores")
        println("Salvando arquivos")
        println("Conexões realizadas")
        e.ok()
    }
}
/*
class Event():Evento{
    override fun ok() {
        println("O programa esta ok")
    }
}*/

//classe anonima, para não ser preciso criar uma classe para instanciar so uma vez
fun main() {
    val p:Programa = Programa()
    //val e:Event = Event()
    p.salvar(object : Evento {
        override fun ok() {
            println("O programa está ok")
        }
    })
}