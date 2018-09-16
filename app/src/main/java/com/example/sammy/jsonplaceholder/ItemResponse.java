package com.example.sammy.jsonplaceholder;

import java.util.List;

public class ItemResponse {

    private Item[] itemList;

    public ItemResponse(Item[] itemList) {
        this.itemList = itemList;
    }

    public Item[] getItemList() {
        return itemList;
    }

    public void setItemList(Item[] itemList) {
        this.itemList = itemList;
    }
}
