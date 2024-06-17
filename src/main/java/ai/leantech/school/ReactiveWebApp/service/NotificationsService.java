package ai.leantech.school.ReactiveWebApp.service;

import ai.leantech.school.ReactiveWebApp.dto.NotificationDto;
import ai.leantech.school.ReactiveWebApp.entity.Notification;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface NotificationsService {

    Flux<Notification> findAll();

    Mono<Notification> findById(Integer id);

    Mono<Notification> create(NotificationDto dto);

    Mono<Notification> update(Integer id, NotificationDto dto);

    Mono<Void> delete(Integer id);

    Mono<Notification> updateNotificationStatus(Integer id, String status);
}
