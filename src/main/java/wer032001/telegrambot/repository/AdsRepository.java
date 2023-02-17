package wer032001.telegrambot.repository;

import org.springframework.data.repository.CrudRepository;
import org.telegram.telegrambots.meta.api.objects.Message;
import wer032001.telegrambot.entity.Ads;

public interface AdsRepository extends CrudRepository<Ads, Long> {
}
