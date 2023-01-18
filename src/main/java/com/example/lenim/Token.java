package com.example.lenim;

public class Token {
    private static int id;

    public Token() {
    }

    public Token(int id){
        this.id = id;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Token.id = id;
    }
}
