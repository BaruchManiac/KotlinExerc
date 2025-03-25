/*Crie um programa que possa imprimir o seu
Crie um programa que contenha um número inteiro e um texto que representa um número.
Seu objetivo é somar esses dois valores, mas você precisará converter os tipos corretamente antes
de realizar a operação.

A variável de resposta deve ter o valor: 45
 */
fun main() {

    var number: Int = 35
    var numb: String = "10"

    var respons = number + numb.toInt()
    println(respons)

    var istrue: Boolean = true
    var developer = istrue.toString()

    println(developer)
}