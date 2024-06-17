package ai.leantech.school.ReactiveWebApp.controller;

import ai.leantech.school.ReactiveWebApp.dto.NotificationDto;
import ai.leantech.school.ReactiveWebApp.entity.Notification;
import ai.leantech.school.ReactiveWebApp.service.NotificationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("notifications")
public class NotificationsController {

    private final NotificationsService service;

    @GetMapping
    public Flux<Notification> findAllNotifications() {
        return service.findAll();
    }

    @GetMapping("{id:\\d+}")
    public Mono<Notification> findNotificationById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping
    public Mono<Notification> createNotification(@RequestBody NotificationDto dto) {
        return service.create(dto);
    }

    @PutMapping("{id:\\d+}")
    public Mono<Notification> updateNotification(@PathVariable int id, @RequestBody NotificationDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("{id:\\d+}")
    public Mono<Void> deleteNotification(@PathVariable int id) {
        return service.delete(id);
    }
}
