import kotlin.math.sign

fun vetore_inteiros(){
    var numeros = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    for(i in 0 .. (numeros.size-1)){//size é como se for um limite
        print("${numeros[i]} ")
    }
    print("\n")
    println("Acessando a sexta posição: ${numeros[6]}")

}

fun vetore_inteiros2(){
    var n = Array(15,{um->um}) //quer dizer que vai ter 15 posições seguindo de 0 a 14
    for(i in n){
        print("${n[i]} ")
    }
    print("\n")
}

fun vetores_boll(){
    var aBooleanEx = booleanArrayOf(true, false, true, false, false, true)
    for(i in 0..(aBooleanEx.size-1)){
        print("${aBooleanEx[i]} ")
    }
    print("\n")
}

fun vetores_string(){
    var bString = arrayOf("Caucaia", "Fortaleza", "Maranguape", "Maracanau")
    for(i in 0..(bString.size-1)){
        print("${bString[i]} ")
    }
    print("\n")
}

fun vetores_char(){
    var nomeCharArray = charArrayOf('M','á','r','c','i','o','E')
    for(i in 0..(nomeCharArray.size-1)){
        print("${nomeCharArray[i]} ")
    }
    print("\n")
    print("Ultima letra é: ${nomeCharArray[nomeCharArray.size-1]}")
    print("\n")
}

fun vetores_float(){
    var numeroFloat = floatArrayOf(19.0000f)
    for(i in 0..(numeroFloat.size-1)){
        print("${numeroFloat[i]}")
    }
    print("\n")
}

fun main() {
    vetore_inteiros()
    print("\n")
    vetore_inteiros2()
    print("\n")
    vetores_boll()
    print("\n")
    vetores_string()
    print("\n")
    vetores_char()
    print("\n")
    vetores_float()
    print("\n")


    var riversArray = arrayOf("Nile", "Amazon", "Yangtze")
    riversArray += "Mississippi"
    println(riversArray.joinToString())
}