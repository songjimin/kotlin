package com.kotlin.prototype.model

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Student(@Id @GeneratedValue(strategy = GenerationType.AUTO)
                    var studId: Int? = null,
                    var studSex: String,
                    var studCount: Int,
                    var date: LocalDate)