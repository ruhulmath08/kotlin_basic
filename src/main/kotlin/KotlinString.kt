fun main(args: Array<String>) {
    /*
    Strings are used for storing text.
    A string contains a collection of characters surrounded by double quotes:
    */

    var name: String
    name = "John"
    println(name)

    //Access a String
    var txt = "Hello World"
    println(txt[0]) // first element (H)
    println(txt[2]) // third element (l)

    //String Length
    var stringLength = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of the txt string is: " + stringLength.length)

    //String Functions
    var StringFunctions = "Hello World"
    println(StringFunctions.uppercase())   // Outputs "HELLO WORLD"
    println(StringFunctions.lowercase())   // Outputs "hello world"

    //Comparing Strings: The compareTo(string) function compares two strings and returns 0 if both are equal:

    var txt1 = "Hello World"
    var txt2 = "Hello World"
    println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)
}