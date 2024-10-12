package com.example.test

fun wuthoutParameter() {
    println("== withoutParameter ==")
    println("hello, World!")
}

fun withParameter(name: String) {
    println()
    println("==withParameter == ")
    println("Hello, $name!")
}

//named argument
//named argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int) {
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! You are $age years old.")
}