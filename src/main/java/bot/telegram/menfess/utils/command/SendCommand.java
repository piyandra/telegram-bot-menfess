package bot.telegram.menfess.utils.command;

import bot.telegram.menfess.utils.text.TextUtils;
import lombok.extern.slf4j.Slf4j;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.Optional;

@Slf4j
public class SendCommand {

    private SendMessage createMessage(String text, long chatId, Optional<String> parseMode) {
        return SendMessage.builder()
                .chatId(chatId)
                .text(text)
                .parseMode(parseMode.orElse("HTML"))
                .build();
    }


    public SendMessage helpSendMenfess(Update update) {
        return createMessage(TextUtils.helpSendMenfess, update.getMessage().getChatId(), Optional.empty());
    }
    public SendMessage message(String message, long channel) {
        return createMessage(message, channel, Optional.empty());
    }

    public SendMessage errorUsersFreeNotContainsUsername(String message, long chatId) {
        return createMessage(message, chatId, Optional.empty());
    }

    public SendMessage errorUsersNotHaveLimit(String message, long chatId) {
        return createMessage(message, chatId, Optional.empty());
    }
    public SendMessage successSendingMessage(String message, long chatId) {
        return createMessage(message, chatId, Optional.of("HTML"));
    }
    public SendMessage helpDeleteMessage(String message, long chatId) {
        return createMessage(message, chatId, Optional.empty());
    }
}