package com.KotlinSpring.repository

import com.KotlinSpring.entity.Course
import org.springframework.data.repository.CrudRepository

interface CourseRepository: CrudRepository <Course,Int>{



}