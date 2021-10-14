package com.svetikov.kotlinmongo.service


import com.svetikov.kotlinmongo.model.Employer
import com.svetikov.kotlinmongo.repository.EmployerRepository
import org.springframework.stereotype.Service

@Service
class EmployerService(val repository: EmployerRepository) {

    fun saveEmpl(empl: Employer): Boolean {
        repository.save(empl)
        return true
    }

    fun findAllEmpl() =
        repository.findAll()

    fun findByIdEmployer(id:Int) =
        repository.findById(id)
}