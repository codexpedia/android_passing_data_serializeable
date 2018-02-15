package com.example.serializeable

import java.io.Serializable

class Student : Serializable {

    var age: Int? = null
    var name: String? = null

    companion object {

        private const val serialVersionUID = 1L
    }
}
