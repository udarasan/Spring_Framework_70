package org.example.z13_spring_boot.service;

import org.example.z13_spring_boot.dto.ItemDTO;
import org.example.z13_spring_boot.entity.Item;
import org.example.z13_spring_boot.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepo itemRepo;

    public Boolean addItem(ItemDTO itemDTO) {
        itemRepo.save(
                new Item(
                        itemDTO.getCode(),
                        itemDTO.getName(),
                        itemDTO.getQuantity(),
                        itemDTO.getPrice()));
        return true;
    }

    public void deleteItem(int id) {
        itemRepo.deleteById(id);
    }

    public Boolean updateItem(ItemDTO itemDTO) {
        if (itemRepo.existsById(itemDTO.getCode())){
            itemRepo.save(
                    new Item(
                            itemDTO.getCode(),
                            itemDTO.getName(),
                            itemDTO.getQuantity(),
                            itemDTO.getPrice()));
            return true;
        }
        return false;
    }

    public List<ItemDTO> getAllItems() {
        List<Item> items = itemRepo.findAll();
        List<ItemDTO> itemDTOs = new ArrayList<>();
        for (Item item : items) {
            itemDTOs.add(new ItemDTO(item.getCode(), item.getName(), item.getQuantity(), item.getPrice()));
        }
        return itemDTOs;
    }
}
