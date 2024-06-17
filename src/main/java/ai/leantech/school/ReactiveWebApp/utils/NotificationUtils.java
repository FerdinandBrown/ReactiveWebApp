package ai.leantech.school.ReactiveWebApp.utils;

import ai.leantech.school.ReactiveWebApp.dto.NotificationDto;
import ai.leantech.school.ReactiveWebApp.entity.Notification;

public class NotificationUtils {
    public static Notification toNotification(NotificationDto dto){
        return Notification.builder()
                .id(dto.id())
                .createdAt(dto.createdAt())
                .modifiedAt(dto.modifiedAt())
                .expirationDate(dto.expirationDate())
                .message(dto.message())
                .error(dto.error())
                .userUid(dto.userUid())
                .notificationStatus(dto.notificationStatus())
                .messageType(dto.messageType())
                .triggerCode(dto.triggerCode())
                .objectType(dto.objectType())
                .objectId(dto.objectId())
                .subject(dto.subject())
                .createdBy(dto.createdBy())
                .hasConfirmOtp(dto.hasConfirmOtp())
                .suggestToAddToTrusted(dto.suggestToAddToTrusted())
                .build();
    }
}
