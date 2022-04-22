package com.boogy.sandbox.controller

import com.boogy.sandbox.domain.House
import com.boogy.sandbox.service.HouseService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/houses")
class HouseController(private val houseService: HouseService) {
  @PostMapping("/")
  fun saveHouse(@RequestBody house: House): House {
    return houseService.saveHouse(house)
  }

  @GetMapping("/")
  fun getAllHouses(): List<House> {
    return houseService.getAllHouses()
  }
}