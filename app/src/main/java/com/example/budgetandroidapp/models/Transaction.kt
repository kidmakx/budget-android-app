package com.example.budgetandroidapp.models

data class Transaction(
    val id: Int,
    val amount: Double,
    val category: String,
    val type: String,
    val date: String,
    val description: String,
    val isRecurring: Boolean,
    val recurringInterval: String?
)