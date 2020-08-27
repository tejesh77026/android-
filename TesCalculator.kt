import java.util.*

fun main(){
    val reader = Scanner(System.`in`)
    print("Enter any two numbers: ")

    // to read double values from the keyboard
    val first = reader.nextDouble()
    val second = reader.nextDouble()

    print("Enter any operator (+, -, *, /): ")

    val operator = reader.next()[0]

    val result: Double

    when (operator) {
        '+' -> result = first + second
        '-' -> result = first - second
        '*' -> result = first * second
        '/' -> result = first / second
        // when operator doesn't match with(+, -, *, /)
        else -> {
            System.out.printf("Enter correct operator")
            return
        }
    }

    System.out.printf("Result is $result")

}
