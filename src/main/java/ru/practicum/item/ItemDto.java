package ru.practicum.item;

import lombok.Data;
import ru.practicum.request.ItemRequest;
import ru.practicum.user.User;

@Data
public class ItemDto {
    private Long id;
    private final String name;
    private final String description;
    private final Boolean available;
    private User owner;
    private final Long requestId;

}
