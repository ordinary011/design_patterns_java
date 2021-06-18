package com.patterns.other.dao;

public class DAODemo {
    static DB storage = new DB();

    public static void main(String[] args) {
        System.out.println(storage.getData());
    }
}

interface Storage{
    String getData();
}

class DB implements Storage{
    String getFromTable(){
        return "data from table";
    }

    @Override
    public String getData() {
        return getFromTable();
    }
}

class FileSystem implements Storage {
    String getFromFs(){
        return "data from fs";
    }

    @Override
    public String getData() {
        return getFromFs();
    }
}