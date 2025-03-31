/*
Crie um programa que saiba se o valor passado pelo usuário é fim de semana
( "SAB" ou "DOM" ) ou se é um dia útil ( "SEG", "TER", "QUA", "QUI" e "SEX" ).

Caso o usuário não forneça nenhum destes dias corretamente, informar um erro.

*/
fun main() {

    println("Olá, informe o dia que deseja saber se é dia útil")
    var day = readln().take(3).uppercase()

    when(day){
        "SEG", "TER", "QUA", "QUI", "SEX" -> {
            println("É um dia util!!")
        }
        "SAB", "DOM" -> {
            println("Não é um dia util!")
        }
        else -> {
            println("Dia informado não existe!")
        }

    }
}