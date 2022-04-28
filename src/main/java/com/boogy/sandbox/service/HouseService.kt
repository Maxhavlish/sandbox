package com.boogy.sandbox.service

import com.boogy.sandbox.domain.House
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicInteger


@Service
class HouseService {
  private val houseMap: MutableMap<Int, House> = mutableMapOf(
      1 to House(
          id = 1,
          yearBuilt = 1969,
          address = "Pookie St"
      ),
      2 to House(
          id = 2,
          yearBuilt = 1970,
          address = "Crystal Blvd"
      )
  )

  private val idGenerator: AtomicInteger = AtomicInteger(2)
  // CRUD - Create, Retrieve, Update, Delete

  // region create
  fun saveHouse(house: House): House {
    val id: Int = idGenerator.incrementAndGet()
    house.id = id
    this.houseMap[id] = house
    return house
  }
  // endregion create

  // region retrieve
  fun getAllHouses(): List<House> {
    return this.houseMap
        .values
        .toList()
  }

  fun getHouseById(id: Int): House? {
    return this.houseMap[id]
  }
  // endregion retrieve

  // region update
  fun updateHouse(updatedHouse: House): House {
    val id: Int = updatedHouse.id ?: throw Exception("missing id")

    val existingHouse: House = getHouseById(id) ?: throw Exception("missing house for id $id")

    existingHouse.address = updatedHouse.address
    existingHouse.yearBuilt = updatedHouse.yearBuilt

    this.houseMap[id] = existingHouse

    return existingHouse
  }
  // endregion update

  // region delete
  fun deleteById(id: Int): Boolean {
    val isDeleted: Boolean = this.houseMap.remove(id) != null
    return isDeleted && (this.houseMap[id] == null)
  }
  // endregion delete
}