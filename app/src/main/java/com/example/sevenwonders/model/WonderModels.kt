package com.example.sevenwonders.model

import androidx.compose.ui.graphics.Color

data class Wonder(
    val id: Int,
    val title: String,
    val subtitle: String,
    val location: String,
    val country: String,
    val builtDate: String,
    val destroyedDate: String,
    val status: String,
    val isSurviving: Boolean,
    val height: String,
    val creators: String,
    val materials: String,
    val shortDescription: String,
    val historyAndArchitecture: String,
    val legendOrFact: String,
    val accentColor: Color,
    val secondaryColor: Color,
    val badgeSymbol: String
)

data class QuizQuestion(
    val id: Int,
    val question: String,
    val options: List<String>,
    val correctOptionIndex: Int,
    val explanation: String
)
