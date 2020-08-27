class User (var firstName: String, var secondName: String){
//    var firstName: String = _firstName
//    var secondName: String = _secondName

//    init {
//        firstName = _firstName
//        secondName = _secondName
//    }

    constructor(): this("Peter", "Simpson"){
        println("Data is set")
    }

}

//    var firstName: String = "Alex"
//    var secondName: String = "Marley"
//
//    fun printUser(){
//         println("$firstName $secondName")
//    }
