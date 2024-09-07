fun main() {
    //Em Kotlin todos os obj vem com 3 metodos disponíveis por padrão
    //Equals, toString, hashCode
    var ret: Retangulo = Retangulo(10,20)
    var ret2: Retangulo = Retangulo(10,20)
    println(ret.equals(ret2))
    //variaveis -> alocadas em endereços diferentes na memória, por isso o print vai dá false


    var ret3: RetanguloData = RetanguloData(10,20)
    var ret4: RetanguloData = RetanguloData(10,20)
    println(ret3.equals(ret4))

    var ret5: RetanguloData = RetanguloData(-3,17)
    ret5 = ret4.copy()
    println(ret5)
    println(ret5.toString())

}

class Retangulo(var a:Int, var b:Int){
    override fun equals(other: Any?): Boolean {
        return if(other is Retangulo){
            (other.a == this.a && other.b == this.b)
        }else{
            false
        }
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }

    //Data class substitui todos esses override
}

data class RetanguloData(var a:Int, var b:Int){}

//caso crie uma data class com varios parametros e precise usar aqueles parametros de forma mais amigavel
data class informacoes(val rua :String, val num:Int, val bairro:String, val CEP:Int, val cidade:String){}
//crie uma função e passe o data class como parametro
fun endereco(e:informacoes){

}