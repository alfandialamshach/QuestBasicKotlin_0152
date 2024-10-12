package com.example.project1

import com.google.android.material.shape.TriangleEdgeTreatment

fun ContohList() {
    println("===List===")
    //List Read Only
    val readOnlyAbjad = listOf("A","B","C")
    println(readOnlyAbjad)

    //ListMutable
    val shape: MutableList<String>  = mutableListOf("Circle","Squere","Triangle")
    println(shape)

    //Menambahakan data ke dalam list mutable
    shape.add("Circle")
    println(shape)

    //menghapus dari list mutable
    shape.remove ("Triangle")
    println(shape)

    //mengubah data didalam list mutable
    shape[0] = "Oval"
    println(shape)

    //list read only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}