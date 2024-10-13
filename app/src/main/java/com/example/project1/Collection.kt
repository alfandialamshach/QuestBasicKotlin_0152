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

// Set adalah kumpulan data yang tidak memiliki  posisi atau urutan tertentu dan hanya menyimpan data unik
// Set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Set Read-Only menggunakan setOf
// Set Mutable menggunakan mutablesetOf

fun ContohSet() {
    println()
    println("=== Set ===")

    //Set Read-Only
    val readOnlyAbjad = setOf ("A", "B", "C")
    println(readOnlyAbjad)

    //Set Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Squere", "Triangle")
    println(shape)

    //Menambahkan data ke dalam set mutable
    shape.add("Rectangle")
    println (shape)

    //Menghapus data dari set mutable
    shape.remove("Circle")
    println(shape)

    //Set Read-Only
    val shapesLocked: Set<String> = shape
    println (shapesLocked)
}