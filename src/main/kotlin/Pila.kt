package org.iesra.revilofe

class Pila<T>(): Iterable<T> {
    private val pila = mutableListOf<T>()

    fun push (cosa: T) {
        pila.add(cosa)
    }

    fun pop(): T {
        val ultimoElemento = pila.last()
        pila.removeLast()
        return ultimoElemento
    }

    fun peek() = pila.last()

    fun isEmpty() = pila.isEmpty()

    fun size() = pila.size

    override fun iterator() = pila.iterator()
}