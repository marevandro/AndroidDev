fun main() {
    for (i in 1 .. 10){ //Estrutura de repetição FOR crescente de 1 em 1
        println("${i} ")
    }
    print("\n") //Quebra de linha

    for(i in 10 downTo 1){ //Estrutura de repetiçao FOR decrescente de 1 em 1
        println("${i} ")
    }

    print("\n")

    val str = "Criação de aplicativos Android"
    for(i in str){
        print("${i} ")
    }
    print("\n")
    print("\n")
    for (i in 1 .. 10 step 2){ //Estrutura de repetição FOR crescente de 1 em 1
        println("${i} ")
    }
}