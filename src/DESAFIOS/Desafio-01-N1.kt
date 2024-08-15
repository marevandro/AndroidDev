package DESAFIOS
fun main() {
    var fazerCalculoResposta: String?

    do {
        println("Vamos realizar o cálculo das emissões de CO2 ?")
        println("(S)Sim ou (N)Não: ".uppercase())
        fazerCalculoResposta = readLine()?.uppercase()
        print("\n")
    } while (fazerCalculoResposta != "S" && fazerCalculoResposta != "N")

    if (fazerCalculoResposta == "N") {
        println("OK! Obrigado pela sua participação!")
    } else if (fazerCalculoResposta == "S") {
        println("Iniciando o cálculo das emissões de CO2...")
        respostaCalculo()
    }else{
        println("Obrigado pela participação.")
    }
}

fun CalcEmissoesCO2(energia: Double, gas: Double){
    val eletricidade = energia * 0.475
    val gasNatural = gas * 2.0

    println("Eletricidade: ${eletricidade} kg CO²")
    println("Gás: ${gasNatural} kg CO²")
    print("Total: ${eletricidade + gasNatural} kg CO²")

}

fun respostaCalculo(){
    println("Digite o valor da Eletricidade: ")
    val valorEletricidade = readLine()
    val converterEletr = valorEletricidade?.toDoubleOrNull()

    println("Digite o valor do Gás: ")
    val valorGas = readLine()
    val converterGas = valorGas?.toDoubleOrNull()

    if (converterEletr != null && converterGas != null) {
        println("Aguarde um momento...")
        Thread.sleep(2000)
        CalcEmissoesCO2(converterEletr, converterGas)
    } else {
        println("Entrada inválida. Por favor, insira valores numéricos válidos.")
    }
}





