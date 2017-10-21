package com.example.romain.myapplication

/**
 * Created by Romain on 20/10/2017.
 */
interface ComicBooksDAO {

    fun get(id: Int): ComicBook?

    fun create(comicBook: ComicBook): ComicBook

    fun delete(comicBook: ComicBook)

    fun update(comicBook: ComicBook): ComicBook

    fun getElementAt(position: Int) : ComicBook?

    fun count(): Int
}