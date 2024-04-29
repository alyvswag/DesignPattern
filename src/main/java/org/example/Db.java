package org.example;

import java.util.Objects;

public final class Db {
    private String user;
    private String password;
    private String link;
    private static Db instance;

    private Db(String user, String password, String link) {
        this.user = user;
        this.password = password;
        this.link = link;
    }
    public static Db getInstance(String user, String password, String link){
        if(instance==null){
            instance = new Db(user,password,link);
        }

        return instance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Db db = (Db) o;
        return Objects.equals(user, db.user) && Objects.equals(password, db.password) && Objects.equals(link, db.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, password, link);
    }

    @Override
    public String toString() {
        return "Db{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
