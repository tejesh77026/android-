var sum: Int =0 //global Variable
var check: Int = 21 //magic
fun main() {
    println("BASIC CALCULATOR")
    choice()
}
fun choice(){

    println("Enter \n1.Addition\n2.subtraction\n3.multiplication\n4.Division")
    when (Integer.valueOf(readLine())){

        1->addition(0,1)
        2->subtraction(0,2)
        3->multiplication(0,3)
        4->division(0,4)
    }
}
fun addition(number:Int,verify:Int ){
    sum+=number
    println("==${sum}")
    cal(verify)

}
fun subtraction(number:Int,verify: Int){
    sum-=number
    println("==$sum")
    cal(verify)

}
fun division(number: Int,verify: Int){
    //var div:Int
    if (number!=0) {
        try {
            sum /=number
            println("==$sum")
        } catch (e: ArithmeticException) {
            println("Arithmetic expression")

        }
         //println("==$sum")
    }
    if(number==0 && sum==0){
        println("enter number for division")
        val div=Integer.valueOf(readLine())
        sum=div
        println("==$div")
        cal(verify)
    }
    cal(verify)

}

fun multiplication(number: Int,verify: Int){
    //val mul:Int
    if (number!=0) {
        sum *= number
        println("==$sum")
    }
    println(sum)
    if(number==0 && sum==0){
        println("enter number for multiplication")
        val mul=Integer.valueOf(readLine())
        sum=mul
        println("==$mul")
        cal(verify)
    }
    cal(verify)
}
fun cal(verify:Int) {
    println("enter a number ")

    while (check!=0) {
        try {
            val number: Int = Integer.valueOf(readLine())
            check = number
        }
        catch (e:Exception){
            choice()
        }
        if (verify ==1) addition(check, verify)
        if(verify ==2) subtraction(check, verify)
        if(verify ==3) multiplication(check, verify)
        if(verify ==4) division(check, verify)

    }
}