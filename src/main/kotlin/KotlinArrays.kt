fun main(args: Array<String>) {
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0]); //Volvo
    cars[0] = "Change"
    println(cars[0]); //Change
    println(cars.size); //4

    //Check if an Element Exists
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    //Loop Through an Array
    for (x in cars) {
        println(x) // Volvo, BMW, Ford, Mazda
    }
}