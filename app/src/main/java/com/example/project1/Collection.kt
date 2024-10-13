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
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    //Set Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Squere", "Triangle")
    println(shape)

    //Menambahkan data ke dalam set mutable
    shape.add("Rectangle")
    println(shape)

    //Menghapus data dari set mutable
    shape.remove("Circle")
    println(shape)

    //Set Read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

    // Map adalah kumpulan data yang disusun dalam pasangan key-value
    // Map bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
    // Map bersifat mutable dan read only, artinys data yang dimasukkan dapat diubah dan tidak boleh diubah
    // Map Read-Only menggunkan mapOf
    // Map Mutable menggunakan mutableMapOf

    fun ContohMap() {

        println()
        println("=== Map ===")
        //Map Read-Only
        val readOnlyShape: Map<String, Int> = mapOf ("Ciscle" to 1, "Squere" to 2, "Triangle" to 3)
        println(readOnlyShape)

        //Map Mutable
        val shape: MutableMap<String, Int> = mutableMapOf ("Circle" to 1, "Squere" to 2, "Triangle" to 3)
        println (shape)

        //Menambahkan data ke dalam map Mutable
        shape["Rectangle"] = 4
          println  (shape)

        //Menghapus data dari map mutable
        shape.remove ("Circle")
        println(shape)

        //Mengubah data di dalam map mutable
        shape ["Squere"] = 5
        println(shape)

        //Map Read-Only
        val shapesLocked:Map<String, Int> = shape
        println (shapesLocked)
    }

    fun main() {
        ContohList()
        ContohSet()
        ContohMap()

    }
