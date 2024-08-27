fun main() {
    var str:String? = null
    if(str == null){
        println("Variável nula")
    }else{
        println(str)
    }
    //Operador Elvis - Semelhante ao ternário
    println(str ?: "nula")
}