package entity

class Woman: Human{
    //    constructor(name: String) : super(name) {}
    var age:Int?=0
    constructor(name: String, height: Int) : super(name) {

    }

    constructor(name: String, height: Int, age: Int) : super(name, height) {
        this.age=age
    }

    override fun toString(): String {
        return "${this.name}:${this.height}-${this.age}"
    }
}