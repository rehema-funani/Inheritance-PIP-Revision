fun main() {
    val car = Car("subaru","AJS","red",40)
    val bus = Bus("probox","A25","black",25)
    bus.maxTripFare(200.0)
    println(bus.make)
    println(car.capacity)
    car.carry(41)
    var a =bus.maxTripFare(33.0)
    println(a)
    car.identity()
    bus.identity()






}
open class Vehicle(var make: String,var model:String,var color:String,var capacity:Int){

    fun carry(people: Int) {
        var x = people- capacity

        if (people <= capacity) {
            println("Carrying $people passengers")
        }
        
        else {

            println("Over capacity by $x people")
        }
    }

   open fun identity() {
        println("I am a white subaru legacy")
    }

    fun calculateParkingFees(hours: Int): Int {
        var fees = hours * 20
        return fees
    }
}














class Car( make:String, model:String, color:String, capacity:Int):Vehicle(make,model,color,capacity) {

    override fun identity() {
        println("I am a probox legacy")
    }


}
class Bus( make:String, model:String, color:String,capacity:Int):Vehicle(make,model,color,capacity) {


    fun maxTripFare(fare:Double):Double{
        var trips = 7.0
        var farePerTrip = fare * trips
        return farePerTrip
}










}




