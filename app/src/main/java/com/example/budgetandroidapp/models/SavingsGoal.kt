data class SavingsGoal(
    val id: Long,
    val goalName: String,
    val targetAmount: Double,
    val currentAmount: Double,
    val targetDate: String,
    val description: String
)