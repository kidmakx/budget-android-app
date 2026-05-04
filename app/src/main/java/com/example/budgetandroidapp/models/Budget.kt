package com.example.budgetandroidapp.models

data class Budget(
    val id: Long,
    val category: String,
    val budgetAmount: Double,
    val spentAmount: Double,
    val month: Int,
    val year: Int
)