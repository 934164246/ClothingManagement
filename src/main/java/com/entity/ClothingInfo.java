package com.entity;

/**
 * 服装类型映射
 * @author GokouRuri
 */
public class ClothingInfo {

    private String color;
    private String size;
    private int id;
    private long count;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "ClothingInfo{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", id=" + id +
                ", count=" + count +
                '}';
    }
}
