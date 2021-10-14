package com.svetikov.kotlinmongo.repository

import com.svetikov.kotlinmongo.model.Employer
import org.springframework.data.mongodb.repository.MongoRepository

interface EmployerRepository:MongoRepository<Employer,Int> {



}