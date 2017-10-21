package com.example.romain.myapplication


class ComicBooksDAOImpl : ComicBooksDAO {

    var comics: MutableList<ComicBook> = mutableListOf()

    override fun get(id: Int): ComicBook? = comics.find {comicBook -> comicBook.id == id}

    override fun create(comicBook: ComicBook): ComicBook {
        comics.add(comicBook)
        return comicBook
    }

    override fun delete(comicBook: ComicBook) {
        comics.remove(comicBook)
    }

    override fun update(comicBook: ComicBook): ComicBook {
        val book = get(comicBook.id)
        val index = comics.indexOf(book)
        comics.add(index, comicBook)
        return comicBook
    }

    override fun getElementAt(position: Int): ComicBook? {
        return comics.get(position)
    }

    override fun count(): Int {
        return comics.size
    }
}