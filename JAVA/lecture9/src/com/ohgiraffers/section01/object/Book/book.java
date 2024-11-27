package com.ohgiraffers.section01.object.Book;

import java.util.Objects;

public class book {
    private int number;
    private String title;
    private String author;
    private int price;

    public book(){
    }

    public book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    @Override
    public String toString() {
        return "book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //주소값이 같으면 필드값 확인 필요없음 true임
        if (this == o) return true;
        //전달된 객체가 null;이거나 다른타입이면 false
        if (o == null || getClass() != o.getClass()) return false;
        //book 타입이면서 동일객체가 아니라서 동등객체인지 비교
        book book = (book) o;
        //모든 필드값이 동일할경우 true
        //String 은 비교연산자 안됨
        return number == book.number && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, title, author, price);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
