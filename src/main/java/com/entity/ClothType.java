package com.entity;

/**
 * 服装类型映射
 * @author GokouRuri
 */
public class ClothType {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClothType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
