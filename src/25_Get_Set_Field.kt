//fun Set, atribui um valor ao campo correspondente
//fun Get, retorna o valo do campo correspondente
//fun Field, evita chamadas infinitas

class Planeta(var nome:String){
    private var id = 1
    var tamanho = 1000
    var fala = "Terra"

        get() {
            println("Acessando GET")
            return field
        }

        set(value) {
            println("Acessando SET")
            field = value
        }
}

class Planeta02(){
    var nome: String = ""
        get(){
            println("Meu valor é $field")
            return field
        }
        set(value) {
            if(value == ""){
                println("Todo planeta tem um nome")
            }else
                field = value
        }
}

fun main() {
    var p: Planeta = Planeta("Terra")
    println("Imprimir o tamanho ${p.tamanho}")
    var a: Planeta = Planeta("Marte")
    a.fala
    a.fala = "Novo planeta Marte"


    var p2: Planeta02 = Planeta02()
    p2.nome = ""
    println(p2.nome)
    p2.nome = "Júpiter"
    println(p2.nome)
}