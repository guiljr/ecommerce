package com.ecommerce.service;

import com.ecommerce.model.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ItemService {

    Item findById(Long id);

    Page<Item> findAllItemsPageable(Pageable pageable);

    List<String> findAllItems();

    Item createItem(Item item);
}
