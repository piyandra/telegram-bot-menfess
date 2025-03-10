package bot.telegram.menfess.service;

import bot.telegram.menfess.entity.Messaging;
import bot.telegram.menfess.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Messaging saveMessage(Messaging messaging) {
        return messageRepository.save(messaging);
    }

    public Messaging findMessage(String message) {
        return messageRepository.findById(message).orElse(null);
    }
}
