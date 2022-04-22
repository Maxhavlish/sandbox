package com.boogy.sandbox.service

import com.boogy.sandbox.domain.House
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicInteger


@Service
class HouseService {
  private val houseMap: MutableMap<Int, House> = mutableMapOf(
      1 to House(
          yearBuilt = 1969,
          address = "Pookie St"
      ),
      2 to House(
          yearBuilt = 1970,
          address = "Crystal Blvd"
      )
  )

  private val idGenerator: AtomicInteger = AtomicInteger(2)
  // CRUD - Create, Retrieve, Update, Delete

  // region create
  fun saveHouse(house: House): House {
    this.houseMap[this.idGenerator.incrementAndGet()] = house
    return house
  }
  // endregion create

  fun getAllHouses(): List<House> {
    return this.houseMap
        .values
        .toList()
  }
}