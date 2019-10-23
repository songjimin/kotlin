package com.kotlin.prototype.repository

import com.kotlin.prototype.model.Student
import org.springframework.data.repository.CrudRepository

interface StudentRepository : CrudRepository<Student, Int> {

}