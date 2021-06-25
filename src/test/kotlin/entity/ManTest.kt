package entity

import org.junit.Assert.*
import org.junit.Test

class ManTest

@Test fun testHeight(){
    var m = Man("张三", 180, 18)
    print(m.height)
}