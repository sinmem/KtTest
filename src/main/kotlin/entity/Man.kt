package entity

class Man(name: String) : Human(name) {
    //    constructor(name: String) : super(name) {}
    constructor(name: String, height: Int) : this(name) {

    }

    constructor(name: String, height: Int, age: Int) : this(name, height) {

    }

}