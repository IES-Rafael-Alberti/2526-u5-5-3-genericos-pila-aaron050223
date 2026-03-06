package org.iesra.revilofe

import org.iesra.revilofe.Pila

fun main(){
    val pila: Pila<String> = Pila<String>()
    pila.push("1")
    pila.push("2")
    pila.push("3")
    pila.push("4")
    val numbersRev = reverse(pila.pila)
    if (listOf("4", "3", "2", "1") != numbersRev)
        println("Error")
    else
        println("Correcto")
}
