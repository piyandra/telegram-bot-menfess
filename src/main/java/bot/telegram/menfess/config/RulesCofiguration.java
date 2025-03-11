package bot.telegram.menfess.config;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class RulesCofiguration {

    public int limitFreeUsers = 5;

    public int payAmountAfterLimit = 100;

    public long channelId = -1002161694809L;

    public int payAmountToDelete = 500;

}
