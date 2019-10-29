package com.kotlin.prototype.service

import com.kotlin.prototype.model.DailyGameServer
import com.kotlin.prototype.model.WeeklyGameServer
import com.kotlin.prototype.repository.WeeklyGameServerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class WeeklyGameServerService {

    @Autowired
    lateinit var weeklyGameServerRepository: WeeklyGameServerRepository

    fun saveWeeklyGameServerInfo(dailyGameServer: DailyGameServer) : WeeklyGameServer {


        var weeklyGameServerData = weeklyGameServerRepository
                                    .findAllByGameAndGameServerAndDate(dailyGameServer.game, dailyGameServer.gameServer,
                                                                       dailyGameServer.date.toLocalDate())

        if (weeklyGameServerData != null) {
            weeklyGameServerData.userCount += dailyGameServer.userCount
        } else {
            weeklyGameServerData = WeeklyGameServer(game = dailyGameServer.game,
                                                    gameServer = dailyGameServer.gameServer,
                                                    userCount = dailyGameServer.userCount,
                                                    date = dailyGameServer.date.toLocalDate())
        }

        return weeklyGameServerRepository.save(weeklyGameServerData)

    }
}