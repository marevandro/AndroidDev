fun main() {
    var cargo:String = "Presidenteds"

        when(cargo){
            "Presidente" -> println(60000f)
            "Gerente" -> print(4500f)
            "Coordenador" -> println(30000f)
            "Analista" -> println(24000f)
            "Estagiário" -> println(16000f)
            else -> println("Cargo não identificado!")
        }

    var imc:Float = 30f
        when(imc) {
            10f -> println("IMC esta 10 ou baixo")
            20f -> println("IMC esta 20 ou maior que 11")
            30f -> println("IMC esta 30 ou maior que 21")
            50f -> println("IMC esta 50 ou maior que 31")
            else -> println("IMC está acima do normal")

        }

}