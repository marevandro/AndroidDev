fun vetore_inteiros(){
    var numeros = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    for(i in 0 .. (numeros.size-1)){
        print("${numeros[i]} ")
    }
    println("Acessando a sexta posição: ${numeros[6]}")
    print("\n")
}

fun vetore_inteiros2(){
    var n = Array(15,{um->um})
    for(i in n){
        print("${n[i]} ")
    }
    print("\n")
}

fun vetores_boll(){
    var a = booleanArrayOf(true, false, true, false, false, true)
    for(i in a){
        print("${a}")
    }
}

fun main() {
    vetore_inteiros()
    vetore_inteiros2()
    vetores_boll()
}