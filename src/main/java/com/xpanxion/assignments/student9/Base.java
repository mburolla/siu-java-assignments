package com.xpanxion.assignments.student9;

import java.util.Objects;

public abstract class Base {
    private int id;

    public Base(int id){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Base)) return false;
        var that = (Base) o;
        return this.id == that.id;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Base{").append("id=").append(id).append('}').toString();
    }
}
