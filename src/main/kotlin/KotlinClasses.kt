fun main(args: Array<String>) {
    // Create a c1 object of the Car class
    val c1 = Car()

    // Access the properties and add some values to it
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    println(c1.brand)   // Outputs Ford
    println(c1.model)   // Outputs Mustang
    println(c1.year)    // Outputs 1969
}

class Car {
    var brand = ""
    var model = ""
    var year = 0
}