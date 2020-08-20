import java.util.concurrent.TimeUnit

//Higher Order function example

/* higher order function->simply one function passing to another function
        ->It is a function that take function as parameter ,or  returns a function */

fun main(){

    sub(::add)

}
// Regular function
fun add(a:Int ,b:Int ):Int{
    var sum=a+b
    return sum
}
//Higher order function definition
fun sub(add:(Int,Int) -> Int ){
    var result =add(3,6)
    print("the sum of two numbers are $result")

}