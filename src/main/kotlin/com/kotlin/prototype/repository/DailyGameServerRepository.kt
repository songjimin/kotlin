package com.kotlin.prototype.repository

import com.kotlin.prototype.model.DailyGameServer
import org.springframework.data.repository.CrudRepository

interface DailyGameServerRepository : CrudRepository<DailyGameServer, Int>{
}