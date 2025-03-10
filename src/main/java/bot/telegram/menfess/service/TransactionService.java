package bot.telegram.menfess.service;

import bot.telegram.menfess.entity.Transaction;
import bot.telegram.menfess.entity.TransactionStatus;
import bot.telegram.menfess.repository.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public Transaction findNotClaimedTransaction(String transactionId, TransactionStatus transactionStatus) {
        return transactionRepository.findTransactionByTransactionIdAndTransactionStatus(transactionId, transactionStatus);
    }

    public void saveTransaction(Transaction transaction) {
        transactionRepository.save(transaction);
    }
}
