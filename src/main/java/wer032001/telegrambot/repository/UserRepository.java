package wer032001.telegrambot.repository;

import org.springframework.data.repository.CrudRepository;
import wer032001.telegrambot.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
