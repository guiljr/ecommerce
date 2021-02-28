package com.ecommerce.service.impl;

import com.ecommerce.exception.ResourceNotFoundException;
import com.ecommerce.model.Item;
import com.ecommerce.repository.ItemRepository;
import com.ecommerce.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item findById(Long id) throws ResourceNotFoundException {
        return this.itemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Item", "id", id));
    }

    @Override
    public List<String> findAllItems() {

        return this.itemRepository.findAll()
                .stream()
                .map(v -> v.getItemName())
                .collect(Collectors.toList());
    }


    @Override
    public Page<Item> findAllItemsPageable(Pageable pageable) {
        return this.itemRepository.findAll(pageable);
    }

    @Override
    public Item createItem(Item item) {
        return this.itemRepository.save(item);
    }
}
