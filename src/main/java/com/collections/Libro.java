package com.collections;

import java.util.Objects;

public class Libro implements Comparable<Libro>{
    private static Integer siguienteISBN = 0;
    private String titulo;
    private String autor;
    private Integer isbn;
    /**
     * Crea un libro con un titulo y un autor
     * @param titulo el titulo del libro
     * @param autor el autor del libro
     */
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = getSiguienteISBN();
    }

    /**
     * Constructor sin parametros crea libros sin autor y sin nombre con el siguiente ISBN
     */
    public Libro() {
        this.titulo = "unnamed";
        this.autor = "unnamed";
        this.isbn = getSiguienteISBN();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public int compareTo(Libro o) {
        return this.isbn.compareTo(o.isbn);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn=" + isbn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn == libro.isbn &&
                Objects.equals(titulo, libro.titulo) &&
                Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {

        return Objects.hash(isbn);
    }
    private static Integer getSiguienteISBN(){
        siguienteISBN++;
        return siguienteISBN;
    }
}
