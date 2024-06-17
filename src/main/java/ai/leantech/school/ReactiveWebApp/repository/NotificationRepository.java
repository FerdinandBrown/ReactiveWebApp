package ai.leantech.school.ReactiveWebApp.repository;

import ai.leantech.school.ReactiveWebApp.entity.Notification;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends ReactiveCrudRepository<Notification, String> {
}
