//Inicia dardiamente atribuição de um valor a variável

class Robo{
    lateinit var nome: String
    fun ligar(){
        nome = "Iniciando o robo"
    }
    fun inicio_tardio(){
        if(!this::nome.isInitialized){
            nome = "Inicializando tardiamente..."
            println(nome)
        }
    }
}
fun main() {
 val bot:Robo = Robo()
    println(bot)
    bot.inicio_tardio()
    println(bot.nome)
}