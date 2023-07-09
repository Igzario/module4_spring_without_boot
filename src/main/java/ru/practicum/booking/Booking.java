package ru.practicum.booking;
import ru.practicum.item.Item;
import ru.practicum.user.User;
import java.time.LocalDateTime;

public class Booking {
    private Long id;
    private LocalDateTime start;
    private LocalDateTime end;
    private Item item;
    private User booker;
    private Status status;

}