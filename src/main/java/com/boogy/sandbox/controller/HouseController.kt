package com.boogy.sandbox.controller

import com.boogy.sandbox.domain.House
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/houses")
class HouseController {
    @GetMapping("/")
    fun getAllHouses(): List<House> {
        val house1 = House(
                yearBuilt = 1969,
                address = "Pookie St"
        )
        val house2 = House(
                yearBuilt = 1970,
                address = "Crystal Blvd")
        return listOf(house1, house2)
    }
}