package service;

import model.Transaction;
import repository.TransactionDao;

import java.util.ArrayList;
import java.util.List;

public class TransactionService {

    private TransactionDao transactionDao;
    private List<Transaction> transactionList;

    public TransactionService() {
        transactionDao = new TransactionDao();
        transactionList = transactionDao.loadTransactions();
    }

    // Lấy toàn bộ danh sách giao dịch
    public List<Transaction> getAllTransactions() {
        return new ArrayList<>(transactionList); // tránh sửa trực tiếp list gốc
    }

    // Thêm giao dịch mới
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
        transactionDao.saveTransactions(transactionList); // lưu lại vào file/db
    }

    // Tìm giao dịch theo ID
    public Transaction findTransactionById(String transactionId) {
        for (Transaction t : transactionList) {
            if (t.getId().equals(transactionId)) {
                return t;
            }
        }
        return null;
    }

    // Xóa giao dịch
    public boolean deleteTransaction(String transactionId) {
        boolean removed = transactionList.removeIf(t -> t.getId().equals(transactionId));
        if (removed) {
            transactionDao.saveTransactions(transactionList);
        }
        return removed;
    }

    // Cập nhật thông tin giao dịch
    public boolean updateTransaction(Transaction updatedTransaction) {
        for (int i = 0; i < transactionList.size(); i++) {
            if (transactionList.get(i).getId().equals(updatedTransaction.getId())) {
                transactionList.set(i, updatedTransaction);
                transactionDao.saveTransactions(transactionList);
                return true;
            }
        }
        return false;
    }
}
