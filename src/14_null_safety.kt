fun main() {
    var str: String? = null
    println(str?.length) // "?" Isso identifica e assume o tratamento do erro no Kotlin
    println(str!!.length)// "!!" Eu assumo o erro, ele vai rodar mas não vai poder ser executado
    print("Testando meu code")
}