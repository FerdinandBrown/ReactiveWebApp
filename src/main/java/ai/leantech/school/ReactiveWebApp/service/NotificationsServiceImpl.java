package ai.leantech.school.ReactiveWebApp.service;

import ai.leantech.school.ReactiveWebApp.dto.NotificationDto;
import ai.leantech.school.ReactiveWebApp.entity.Notification;
import ai.leantech.school.ReactiveWebApp.repository.NotificationRepository;
import ai.leantech.school.ReactiveWebApp.utils.NotificationUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class NotificationsServiceImpl implements NotificationsService {

    private final NotificationRepository repository;

    @Override
    public Flux<Notification> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Notification> findById(Integer id) {
        return repository.findById(id.toString());
    }

    @Override
    public Mono<Notification> create(NotificationDto dto) {;
        return repository.save(NotificationUtils.toNotification(dto));
    }

    @Override
    public Mono<Notification> update(Integer id, NotificationDto dto) {
        return repository.findById(id.toString())
                .map(notification -> NotificationUtils.toNotification(dto));
    }

    @Override
    public Mono<Void> delete(Integer id) {
        return repository.deleteById(id.toString());
    }

    @Override
    public Mono<Notification> updateNotificationStatus(Integer id, String status) {
        return repository.findById(id.toString())
                .flatMap(notification -> {
                    notification.setNotificationStatus(status);
                    return repository.save(notification);
                });
    }
}
