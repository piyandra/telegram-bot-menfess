package bot.telegram.menfess.repository;

import bot.telegram.menfess.entity.Users;
import bot.telegram.menfess.entity.UsersLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    Optional<List<Users>> findUsersByBalanceIsLessThanEqualAndLevel(long balanceIsLessThan, UsersLevel level);
}
