package com.nelkinda.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MyTest {
    @Test
    public void notFail() {
        Expense expense = new Expense();
        expense.amount =  10;
        expense.type = ExpenseType.CAR_RENTAL;

        List<Expense> expenseList = List.of(expense);

        ExpenseReport report = new ExpenseReport();
        report.printReport(expenseList);

        Assertions.assertDoesNotThrow(() -> report.printReport(expenseList) );

    }
}