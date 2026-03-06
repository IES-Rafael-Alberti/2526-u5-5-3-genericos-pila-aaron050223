package org.iesra.revilofe

fun <T> reverse(lista: List<T>): MutableList<T>{
    val listaReves: MutableList<T> = mutableListOf()
    for (i in lista.size - 1 downTo 0){
        listaReves.add(lista[i])
    }
    return listaReves
}