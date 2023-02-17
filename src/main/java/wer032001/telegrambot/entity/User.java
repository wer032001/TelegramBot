package wer032001.telegrambot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    public Long chatId;

    private String firstname;

    private String lastName;

    private String userName;

    private Timestamp registeredAt;

    @Override
    public String toString() {
        return "User{" +
               "chatId=" + chatId +
               ", firstname='" + firstname + '\'' +
               ", lastName='" + lastName + '\'' +
               ", userName='" + userName + '\'' +
               ", registeredAt=" + registeredAt +
               '}';
    }
}
