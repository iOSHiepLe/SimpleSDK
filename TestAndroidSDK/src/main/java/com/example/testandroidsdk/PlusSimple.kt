package com.example.testandroidsdk

class PlusSimple {
    companion object {
        private var ins: PlusSimple? = null
        val shared: PlusSimple
            get() {
                if (ins == null) {
                    ins = PlusSimple()
                }
                return ins!!
            }
    }

    fun plusInteger(a: Int, b: Int) {
        println("$a + $b = ${a + b}")
    }
}