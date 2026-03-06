package org.iesra.revilofe

import kotlin.collections.Iterator

class PilaIterator<T>(val pila: MutableList<T>): Iterator<T> {
    override fun next(): T {
        val next = pila.last()
        pila.removeLast()
        return next
    }

    override fun hasNext(): Boolean {
        return if (pila.isNotEmpty()) {
            true
        } else {
            false
        }
    }
}