fun main() {
    var i = 0
        do{
            print("${i} ")
            i++
        }while (i != 10)
        print("[[[[ -> ${i}, oque tem aqui.")
        while (i==10){
            print("Loop while")
            i++
        }
    print("\n")

    do{
        println("Qual é o seu nome: ")
        val value = readLine()
    }while (value == "")
}