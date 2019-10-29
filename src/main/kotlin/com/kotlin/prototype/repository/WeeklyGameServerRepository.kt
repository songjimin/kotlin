package com.kotlin.prototype.repository

import com.kotlin.prototype.model.WeeklyGameServer
import org.springframework.data.repository.CrudRepository
import java.time.LocalDate

interface WeeklyGameServerRepository : CrudRepository<WeeklyGameServer, Int> {

    fun findAllByGameAndGameServerAndDate(game: String, gameServer : String, date: LocalDate) : WeeklyGameServer?

}