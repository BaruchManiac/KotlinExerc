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
fun main(){
     //4
    println("Você é um motorista?")
    var isdriver = readln().take(1).lowercase()
    println("Qual a sua idade?")
    var value = readln()
    var age = value.toInt()

    if(isdriver == "s" && age >= 17){
        println("ele se qualifica para o recrutamento")
    }else{
        println("ele nao se qualifica para o recrutamento")
    }

    //5
    println("Você é um motorista?")
    var isdriverr = readln().take(1).lowercase()
    println("Qual a sua idade?")
    var valuee = readln()
    var agee = valuee.toInt()

    if(isdriverr == "s" || agee >= 17){
        println("ele se qualifica para o recrutamento")
    }else{
        println("ele nao se qualifica para o recrutamento")
    }
    //6
    println("Qual produto você deseja cadastrar?")
    var product = readln().lowercase()
    println("Qual o Valor do $product?")
    var productValue = readln()
    var value : Double = productValue.toDouble()

    if (product == "imac" && value >= 10_000.00){
        println("Desconto de 12% aplicado com sucesso! valor a pagar: ${value * 0.88}")
    }
}