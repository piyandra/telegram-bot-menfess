package bot.telegram.menfess.service;

import bot.telegram.menfess.config.RulesCofiguration;
import bot.telegram.menfess.entity.Users;
import bot.telegram.menfess.entity.UsersLevel;
import bot.telegram.menfess.repository.UsersRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResetLimit {

    private final UsersRepository usersRepository;

    private ResetLimit(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Scheduled(cron = "0 0 0 * * *")
    public void resetLimit() {
        Optional<List<Users>> users = Optional.of(usersRepository.findUsersByBalanceIsLessThanEqualAndLevel(0, UsersLevel.FREE).orElse(List.of()));
        users.ifPresent(usersList -> usersList.forEach(user -> {
            user.setLimitService(new RulesCofiguration().getLimitFreeUsers());
            usersRepository.save(user);
        }));

    }
}
