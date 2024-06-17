package ai.leantech.school.ReactiveWebApp.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table("notification")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Notification {
    @Id
    private Integer id;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime modifiedAt;

    @Column
    private LocalDateTime expirationDate;

    @Column
    private String message;

    @Column
    private String error;

    @Column
    private String userUid;

    @Column
    private String notificationStatus;

    @Column
    private String messageType;

    @Column
    private String triggerCode;

    @Column
    private String objectType;

    @Column
    private String objectId;

    @Column
    private String subject;

    @Column
    private String createdBy;

    @Column
    private Boolean hasConfirmOtp;

    @Column
    private Boolean suggestToAddToTrusted;
}