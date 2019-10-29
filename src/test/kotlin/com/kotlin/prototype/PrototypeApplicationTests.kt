package com.kotlin.prototype

import com.kotlin.prototype.model.Student
import com.kotlin.prototype.repository.StudentRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.time.LocalDate

@SpringBootTest
class PrototypeApplicationTests {


    @Autowired
    lateinit var studentRepository: StudentRepository


    @Test
    fun contextLoads() {
    }


    @Test
    fun insertStudentData() {

        val source = "mw"

        var now = LocalDate.now()
        var startDate = now.minusMonths(3)

        for (i in 1..100) {
//            var sex = java.util.Random().ints(1, 0, source.length)
//                    .asSequence()
//                    .map(source::get)
//                    .joinToString("")

            var manData = Student(studSex = "m", studCount = (300..1000).shuffled().first(), date = startDate.plusDays(i.toLong()))
            var womanData = Student(studSex = "w", studCount = (300..1000).shuffled().first(), date = startDate.plusDays(i.toLong()))
            studentRepository.save(manData)
            studentRepository.save(womanData)
        }
    }




}
