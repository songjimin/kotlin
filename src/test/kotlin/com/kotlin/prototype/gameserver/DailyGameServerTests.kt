package com.kotlin.prototype.gameserver

import com.kotlin.prototype.controller.DailyGameServerController
import com.kotlin.prototype.model.DailyGameServer
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.time.LocalDateTime


@SpringBootTest
class DailyGameServerTests {

    @Autowired
    lateinit var dailyGameServerController: DailyGameServerController

    @Test
    fun insertDailyGameServer() {

        var now = LocalDateTime.of(2019, 10, 1, 0, 0)
        var gameList = listOf<String>("l1m", "l2m")

        var days = 7
        var timeRange = 1440 * days //1440 = 60분 * 24시간 (즉 하루를 의미)

        //1일치 60분 단위 데이터 넣기
        for (time in 0..timeRange step 60) {
            for (game in 0 until gameList.size) {
                for (server in 1..5) {
                    var dailyGameServer = dailyGameServerController.insert(
                                            DailyGameServer(game = gameList[game],
                                                            gameServer = server.toString(),
                                                            userCount =  (600..1000).shuffled().first(),
                                                            date = now.plusMinutes(time.toLong())))

                }
            }
        }



    }
}

