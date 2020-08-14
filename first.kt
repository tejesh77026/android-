import java.lang.Integer.*

fun main() {
    println("\tbasic calculator\n")
    println("Enter any number to Start the calculator")
    val num: Int = Integer.valueOf(readLine())
    var sum: Int = 0
    do {
        println("Enter\n1.addition\n2.Subtraction\n3.multiplication\n4.Division")

        val num: Int = Integer.valueOf(readLine())
        when (num) {
            1 -> {
                println("\nenter any number 0 to exit \n")
                var a: Int = 21
                while (a != 0) {
                    var b: Int = Integer.valueOf(readLine())
                    a = b
                    sum += b
                    println("\t\t=" + sum)

                }
            }
            2 -> {
                println("\nenter any number 0 to exit \n")
                var a: Int = 21
                while (a != 0) {
                    var b: Int = Integer.valueOf(readLine())
                    a = b
                    if (sum == 0) {
                        sum = b
                    } else {
                        sum -= b
                        println("\t\t=" + sum)
                    }
                }
            }
            3 -> {
                println("\nenter any number 0 to exit \n")
                var a: Int = 21
                while (a != 0) {
                    var b: Int = Integer.valueOf(readLine())
                    a = b
                    if (sum == 0) {
                        sum = 1
                    }
                    if (b==0) {
                        println("\t\t="+sum)
                    }
                    else
                     {
                        sum *= b
                        println("\t\t=" + sum)
                    }
                }
            }

            4 -> {
                println("\nenter any number 0 to exit \n")
                var a: Int = 21
                while (a != 0) {
                    var b: Int = Integer.valueOf(readLine())
                    a = b
                    if (sum == 0) {
                        sum = b
                    }
                    if(b==0)
                    {
                        println("Arithmeticerror")
                    }
                        else{
                        sum /= b
                        println("\t\t=" + sum)
                    }
                }
            }
        }

    } while (true)

}