package com.example.demo.Item.Controller;

import com.example.demo.Item.Model.Item;
import com.example.demo.Item.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("fetch")
public class ItemController {

    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService){
             this.itemService=itemService;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Item> getBook() {
        return itemService.findItems();
    }

}
