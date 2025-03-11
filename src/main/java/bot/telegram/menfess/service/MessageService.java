package bot.telegram.menfess.service;

import bot.telegram.menfess.entity.Messaging;
import bot.telegram.menfess.repository.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Messaging saveMessage(Messaging messaging) {
        return messageRepository.save(messaging);
    }

    public Messaging findMessage(String message) {
        return messageRepository.findById(message).orElse(null);
    }

    public Messaging findMessageBefore(long message, long timeStamp) {
        return messageRepository.findTopMessagingByUserAndTimeStampGreaterThan(message, timeStamp);
    }
}
