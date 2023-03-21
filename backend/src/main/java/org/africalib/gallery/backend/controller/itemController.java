package org.africalib.gallery.backend.controller;

import org.africalib.gallery.backend.entity.item;
import org.africalib.gallery.backend.repository.itemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class itemController {

    @Autowired
    itemRepository itemRepository;

    @GetMapping("/api/items")
    public List<item> getItems() {
        List<item> items = itemRepository.findAll();
        return items;
    }
}
