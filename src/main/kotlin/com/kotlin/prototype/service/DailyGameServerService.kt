package com.kotlin.prototype.service

import com.kotlin.prototype.model.DailyGameServer
import com.kotlin.prototype.repository.DailyGameServerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class DailyGameServerService {

    @Autowired
    lateinit var dailyGameServerRepository: DailyGameServerRepository

    fun saveDailyGameServerInfo (dailyGameServer: DailyGameServer) :DailyGameServer {
        return dailyGameServerRepository.save(dailyGameServer)
    }

}