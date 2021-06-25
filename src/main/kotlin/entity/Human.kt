package entity

/**
 * 创建一个叫人类的基类, 然后在拓展其属性等
 */
open class Human(var name:String) {
    var height:Int = 0
    constructor(name:String, height:Int): this(name) {
        this.height = height;
    }
}