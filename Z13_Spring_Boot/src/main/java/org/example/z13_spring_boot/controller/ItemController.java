package org.example.z13_spring_boot.controller;

import org.example.z13_spring_boot.dto.CustomerDTO;
import org.example.z13_spring_boot.dto.ItemDTO;
import org.example.z13_spring_boot.service.CustomerService;
import org.example.z13_spring_boot.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping( value = "save",produces = MediaType.APPLICATION_JSON_VALUE)
    public Boolean saveItem(@RequestBody ItemDTO itemDTO) {
        return itemService.addItem(itemDTO);

    }

    @PutMapping(value = "update")
    public Boolean updateItem(@RequestBody ItemDTO itemDTO) {
        return itemService.updateItem(itemDTO);
    }
    @DeleteMapping(path = "delete/{id}")
    public Boolean deleteItem(@PathVariable("id") int id) {
        itemService.deleteItem(id);
        return true;
    }
    @GetMapping("getAll")
    public List<ItemDTO> getAllItems() {
        return itemService.getAllItems();
    }
}
