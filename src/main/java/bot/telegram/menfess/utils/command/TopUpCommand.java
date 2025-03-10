package bot.telegram.menfess.utils.command;

import bot.telegram.menfess.utils.text.TextUtils;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class TopUpCommand {
    public SendMessage topUpMessage(long chatId, boolean isSuccess, String ignoredSaldo) {
        return SendMessage.builder()
                .chatId(chatId)
                .text(isSuccess ? TextUtils.topUpSuccess : TextUtils.topUpFailed)
                .parseMode("HTML")
                .build();
    }

    public SendMessage helpTopUp(long chatId) {
        return SendMessage.builder()
                .chatId(chatId)
                .text(TextUtils.helpTopUp)
                .parseMode("HTML")
                .build();
    }

}
