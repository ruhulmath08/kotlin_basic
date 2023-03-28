fun main(args: Array<String>) {
    /*
    The difference between var and val is that variables declared with the var
    keyword can be changed/modified, while val variables cannot.
    */

    //val myNum = 5             // Int
    //val myDoubleNum = 5.99    // Double
    //val myLetter = 'D'        // Char
    //val myBoolean = true      // Boolean
    //val myText = "Hello"      // String

    /*
    Data types are divided into different groups:

    Numbers
    Characters
    Booleans
    Strings
    Arrays
    */

    //byte : The Byte data type can store whole numbers from -128 to 127.
    val byteNum: Byte = 100
    println(byteNum)

    //The Short data type can store whole numbers from -32768 to 32767:
    val shortNum: Short = 5000
    println(shortNum)

    //The Int data type can store whole numbers from -32768 to 32767:
    val intNum: Int = 100000
    println(intNum)

    //The Long data type can store whole numbers from -9223372036854775807 to 9223372036854775807.
    val myLong: Long = 15000000000L
    println(myLong)


    //Floating Point Types
    val myNum1: Float = 35E3F
    val myNum2: Double = 12E4
    println(myNum1)
    println(myNum2)

    //The Boolean data type and can only take the values true or false:
    val isKotlinFun: Boolean = true
    val isFishTasty: Boolean = false
    println(isKotlinFun)   // Outputs true
    println(isFishTasty)   // Outputs false

    //
    val myGrade: Char = 'B'
    println(myGrade)
}