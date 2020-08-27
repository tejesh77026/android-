var sum=0 //global Variable
var check = 21 //magic
fun main() {
    println("BASIC CALCULATOR")
    choice()
}
fun choice(){
    println("Enter \n1.Addition\n2.substraction\n3.multiplication\n4.Division")
    var choose:Int=Integer.valueOf(readLine())
    when (choose){
        1->addition(0,1)
        2->subtraction(0,2)
        3->multiplication(0,3)
        4->Division(0,4)
    }
}
fun addition(number:Int,verifycal:Int ){
    var checkadd=verifycal
    sum+=number
    println("==${sum}")
    cal(checkadd)

}
fun subtraction(number:Int,verifycal: Int){
    var checksub=verifycal
    sum-=number
    println("==$sum")
    cal(checksub)

}
fun Division(number: Int,verifycal: Int){
    var checkdiv=verifycal
    var div:Int
    if (number!=0) {
        try {
            sum /=number
            println("==$sum")
        } catch (e: ArithmeticException) {
            println("Arithmetic expression")

        }
       // println("==$sum")
    }
    if(number==0 && sum==0){
        println("enter number for division")
        var div=Integer.valueOf(readLine())
        sum=div
        println("==$div")
        cal(checkdiv)
    }
    cal(checkdiv)

}

fun multiplication(number: Int,verifycal: Int){
    var checkmul=verifycal
    var mul:Int
    if (number!=0) {
        sum *= number
        println("==$sum")
    }
    println(sum)
    if(number==0 && sum==0){
        println("enter number for multiplication")
        var mul=Integer.valueOf(readLine())
        sum=mul
        println("==$mul")
        cal(checkmul)
    }
    cal(checkmul)
}
fun cal(verify:Int) {
    var checkcal=verify
    println("enter a number ")

    while (check!=0) {
        try {
            var number: Int = Integer.valueOf(readLine())
            check = number
        }
        catch (e:Exception){
            choice()
        }
        if (checkcal==1) addition(check,checkcal)
        if(checkcal==2) subtraction(check,checkcal)
        if(checkcal==3) multiplication(check,checkcal)
        if(checkcal==4) Division(check,checkcal)


    }
}