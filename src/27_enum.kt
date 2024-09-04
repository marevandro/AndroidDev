enum class Prioridade {
    Baixa, Media, Alta
}
enum class Animais{
    gato, cachorro, tucanom, papagaio, jacare
}
enum class Prioridade_2(val v:Int){
    B(0), M(7), A(10)
}
enum class Prioridade_3(val value: Int){
    A(10){
        override fun toString(): String {
            return "Prioridade Alta com o valor $value"
        }
    },
    M(5){
        override fun toString(): String {
            return "Prioridade Média com o valor $value"
        }
    },
    B(0){
        override fun toString(): String {
            return "Prioridade Baixa com o valor $value"
        }
    }
}

fun x(p: Prioridade){}

fun main() {
    x(Prioridade.Alta)
    for(p in Prioridade.entries){
        println("$p ")
    }
    print("\n")
    for(p in Animais.entries){
        println("$p ")
    }
    print("\n")
    for(p in Prioridade_2.entries){
        print("${p.v} ")
    }
    print("\n")
    for(p in Prioridade_3.values()){
        println(p)
    }
}