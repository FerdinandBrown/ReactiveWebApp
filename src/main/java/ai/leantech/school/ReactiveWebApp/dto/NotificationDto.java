package ai.leantech.school.ReactiveWebApp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record NotificationDto(
        Integer id,
        LocalDateTime createdAt,
        LocalDateTime modifiedAt,
        LocalDateTime expirationDate,
        String message,
        String error,
        String userUid,
        String notificationStatus,
        String messageType,
        String triggerCode,
        String objectType,
        String objectId,
        String subject,
        String createdBy,
        Boolean hasConfirmOtp,
        Boolean suggestToAddToTrusted
){}
