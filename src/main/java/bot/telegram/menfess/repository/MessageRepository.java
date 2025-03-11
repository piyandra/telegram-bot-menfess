package bot.telegram.menfess.repository;

import bot.telegram.menfess.entity.Messaging;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MessageRepository extends JpaRepository<Messaging, String> {

    Messaging findTopMessagingByUserAndTimeStampGreaterThan(long user, long timeStamp);

}
