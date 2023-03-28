fun main(args: Array<String>) {
    val c1 = Bus("Hino", "Mustang", 1969)
    val c2 = Bus("Honds", "X5", 1999)
    val c3 = Bus("Tata", "Model S", 2020)

    println(c1.brand)
    println(c2.brand)
    println(c3.brand)
}

class Bus(var brand: String, var model: String, var year: Int){

}