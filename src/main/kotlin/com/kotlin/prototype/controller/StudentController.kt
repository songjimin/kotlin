package com.kotlin.prototype.controller

import com.kotlin.prototype.model.DailyGameServer
import com.kotlin.prototype.model.Param
import com.kotlin.prototype.model.Student
import com.kotlin.prototype.repository.DailyGameServerRepository
import com.kotlin.prototype.repository.StudentRepository
import com.kotlin.prototype.service.DailyGameServerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
class DataController {


    @Autowired
    lateinit var studentRepository: StudentRepository



    @GetMapping("/test")
    fun test(param: Param): String {

        param.age = 19

        var test = Student(studSex = "m", studCount = 4, date = LocalDate.now())
        studentRepository.save(test)
        return param.toString()
    }



}