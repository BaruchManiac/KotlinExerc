/*
1. Criar um programa que deverá comparar a igualdade de duas Strings. Ou seja, a string A é igual a string B?

2. Crie uma variável que armazene a sua idade e verifique se, com a idade informada, pode-se dirigir
(regra para CNH → +18 anos pode dirigir)

3. Inverta a lógica, ou seja, verifique se a idade informada NÃO pode dirigir

4. Para praticar condições compostas, verifique se é um motorista OU se ele tem 17 anos ou mais

5. Para praticar condições compostas, verifique se é um motorista E se ele tem mais de 30 anos

6. Crie um programa com 2 variáveis, uma que represente um nome de produto e outra que represente o preço.
Agora, somente imprima uma mensagem como "desconto aplicado" quando o produto for iMac E o preço for maior ou
igual a 10 mil. Imprima também o valor com desconto aplicado
de 12% para esse produto. Ou seja, a saída deve ser algo como: desconto aplicado de 12%. Total a pagar: R$ 19360
*/
fun main() {

    //1

    println("Primeira String")
    var firstSt = readln()
    println("Segunda String")
    var secondSt = readln()


    if(firstSt ==  secondSt){
        println("As duas Strings são iguais!")
    }else{
        println("As duas Strings são diferentes!")
    }

    //2

    println("Qual a sua idade?")
    var age1 = readln()
    var ageInt1 = age1.toInt()

    if(ageInt1 >= 18){
        println("Você tem idade para dirigir!")
    }else{
        println("Você não tem idade para dirigir!")
    }

    //3

    println("Qual a sua idade?")
    var age = readln()
    var ageInt = age.toInt()

    if(ageInt < 18){
        println("Você não tem idade para dirigir!")
    }else{
        println("Você tem idade para dirigir!")
    }


}