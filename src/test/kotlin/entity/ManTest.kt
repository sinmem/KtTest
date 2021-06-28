package entity

import org.junit.Test

object ManTest{
    @JvmStatic
    fun main(args: Array<String>){
        testHeight()
    }

    fun Man.p(){
        print("${this}")
    }

    @Test fun testHeight(){
        var m = Man("张三", 180, 18)
        print(m)

        var men :List<Man> = mutableListOf(Man("张三", 180, 18))
        var women :List<Man> = mutableListOf(Man("李四", 180, 18))
        var hu :List<Human> = men;
//        var men :MutableList<Man> = mutableListOf(Man("张三", 180, 18))
//        var women :MutableList<Man> = mutableListOf(Man("李四", 180, 18))
//        var hu :MutableList<Human> = men;
    }
}




