package com.svetikov.kotlinmongo.controller

import com.svetikov.kotlinmongo.model.Employer
import com.svetikov.kotlinmongo.service.EmployerService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/empl")
class EmplController(private val service: EmployerService) {

    @PostMapping()
    fun saveEmpl(@RequestBody empl: Employer) =
        service.saveEmpl(empl)

    @GetMapping("/all")
    fun findAllEmpl() =
        service.findAllEmpl()

    @GetMapping("/{id}")
    fun findByIdEmpl(@PathVariable id:Int) =
        service.findByIdEmployer(id)

}