package com.kotlin.prototype.controller

import com.kotlin.prototype.model.DailyGameServer
import com.kotlin.prototype.service.DailyGameServerService
import com.kotlin.prototype.service.WeeklyGameServerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DailyGameServerController {

    @Autowired
    lateinit var dailyGameServerService: DailyGameServerService

    @Autowired
    lateinit var weeklyGameServerService: WeeklyGameServerService

    @PostMapping("/GameServer")
    fun insert (dailyGameServer: DailyGameServer) : DailyGameServer {

        var dailyGameServerData = dailyGameServerService.saveDailyGameServerInfo(dailyGameServer)
        weeklyGameServerService.saveWeeklyGameServerInfo(dailyGameServerData)
        return dailyGameServer
    }
}