package com.svetikov.kotlinmongo.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collation = "employer")
data class Employer(
    @Id
    val id:Int=0,
    val name:String="",
    val age:Int=0)
