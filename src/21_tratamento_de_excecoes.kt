import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun ler_arquivo(){
    var arquivo = File("C:Codigo_kotlin\\Conceitos_iniciais\\src\\21_Passo-a-passo.txt")
    try{
        Scanner(arquivo).use { leitura ->
            while (leitura.hasNext()){
                println(leitura.next())
            }
            leitura.close()
        }
    }catch (e: FileNotFoundException){
        println("Falha ao ler o arquivo")
        e.printStackTrace();
    }
}

fun main() {
    ler_arquivo()
}