package com.example.a16prac;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemsPage {

    public ItemsPage(int total, int totalPages, List<Items> items) {
        this.total = total;
        this.totalPages = totalPages;
        this.items = items;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    @SerializedName("total")
    private int total;

    @SerializedName("totalPages")
    private int totalPages;
    @SerializedName("items")
    private List<Items> items;

}
