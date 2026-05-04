package com.example.budgetandroidapp.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "transactions")
data class TransactionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val amount: Double,
    val category: String,
    val type: String, // INCOME or EXPENSE
    val date: String,
    val description: String,
    val isRecurring: Boolean = false,
    val recurringInterval: String? = null // DAILY, WEEKLY, MONTHLY, YEARLY
)

@Entity(tableName = "budgets")
data class BudgetEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val category: String,
    val budgetAmount: Double,
    val spentAmount: Double,
    val month: Int,
    val year: Int
)

@Entity(tableName = "savings_goals")
data class SavingsGoalEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val goalName: String,
    val targetAmount: Double,
    val currentAmount: Double,
    val targetDate: String,
    val description: String
)