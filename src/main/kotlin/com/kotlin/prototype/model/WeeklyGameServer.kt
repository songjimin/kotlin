package com.kotlin.prototype.model

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class WeeklyGameServer (@Id @GeneratedValue(strategy = GenerationType.AUTO)
                            var id: Int? = null,
                            var game: String,
                            var gameServer: String,
                            var userCount: Int,
                            var date: LocalDate
)