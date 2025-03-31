/*Crie um programa que possa imprimir a quantidade de caracteres do seu nome e
também qual será a sua idade no ano 2050.

Exemplo de mensagem:

Olá Tiago. Em 2050 você terá 60 anos. Seu nome possui 5 caracteres.

*/
fun main() {

    var name: String = "Matheus Bosso"
    var born: Int = 1998

    println("Olá! $name \nseu nome possui ${name.length} caracteres! \nVocê terá ${2050 - born} anos em 2050!")
}