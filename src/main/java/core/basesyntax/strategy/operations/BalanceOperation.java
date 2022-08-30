package core.basesyntax.strategy.operations;

import core.basesyntax.db.Storage;
import core.basesyntax.model.Fruit;
import core.basesyntax.model.Transaction;
import core.basesyntax.strategy.OperationStrategy;

public class BalanceOperation implements OperationStrategy {
    @Override
    public void apply(Transaction transaction) {
        Fruit fruit = transaction.getFruit();
        Storage.storageDate.put(fruit, transaction.getQuantity());
    }
}