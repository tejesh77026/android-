import java.util.*

fun main(){
    println("i am kotlin")
    val reader = Scanner(System.`in`)
    print("Enter two numbers: ")

    // nextDouble() reads the next double from the keyboard
    val first = reader.nextDouble()
    val second = reader.nextDouble()

    print("Enter an operator (+, -, *, /): ")

    val operator = reader.next()[0]

    val result: Double

    when (operator) {
        '+' -> result = first + second
        '-' -> result = first - second
        '*' -> result = first * second
        '/' -> result = first / second
        // operator doesn't match any case constant (+, -, *, /)
        else -> {
            System.out.printf("Error! operator is not correct")
            return
        }
    }

    System.out.printf("Result is $result")

}