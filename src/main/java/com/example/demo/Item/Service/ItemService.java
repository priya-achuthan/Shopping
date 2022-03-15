package com.example.demo.Item.Service;

import com.example.demo.Item.Model.Item;
import com.example.demo.Item.Repository.ItemRepository;

import java.util.List;

public class ItemService {
    private ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
     this.itemRepository=itemRepository;
    }

    public List<Item> findItems() {
        return itemRepository.findAll();
    }
}
