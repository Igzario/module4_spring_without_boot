package ru.practicum.item;

import lombok.Data;
import ru.practicum.request.ItemRequest;
import ru.practicum.user.User;

@Data
public class Item {
    private Long id;
    private String name;
    private String description;
    private Boolean available;
    private User owner;
    private ItemRequest request;

    public boolean isAvailable(){
        return this.available;
    }
}