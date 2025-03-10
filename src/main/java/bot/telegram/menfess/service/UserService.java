package bot.telegram.menfess.service;

import bot.telegram.menfess.entity.Users;
import bot.telegram.menfess.entity.UsersLevel;
import bot.telegram.menfess.repository.UsersRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {


    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    private final UsersRepository usersRepository;

    public Users findUsers (long id) {
        return usersRepository.findById(id).orElse(null);
    }

    public Users registerUser(Users users) {
        return usersRepository.save(users);
    }
    public void changeLevel(Long id, UsersLevel level) {
        usersRepository.findById(id).map(users -> {
            users.setLevel(level);
            return usersRepository.save(users);
        });
    }
    public void topUpBalance(Long id, int balance) {
        Users users = usersRepository.findById(id).orElse(null);
        if (users != null) {
            users.setBalance(users.getBalance() + balance);
            usersRepository.save(users);
        }
    }

    public void deductBalance(Long id, int balance) {
        Users users = usersRepository.findById(id).orElse(null);
        if (users != null) {
            users.setBalance(users.getBalance() - balance);
            usersRepository.save(users);
        }
    }
    public void changeLimitService(Long id, long limitService) {
        usersRepository.findById(id).map(users -> {
            users.setLimitService(limitService);
            return usersRepository.save(users);
        });
    }

}
