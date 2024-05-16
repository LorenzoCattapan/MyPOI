package com.myapps.mypoi.database.repository

import androidx.lifecycle.LiveData
import com.myapps.mypoi.database.dao.MyPoiDao
import com.myapps.mypoi.database.model.PoiCategory
import com.myapps.mypoi.database.model.PoiLocation

class MyPoiRepository (private val poiDao: MyPoiDao) {

    val allCategories: LiveData<List<PoiCategory>> = poiDao.getAllCategories()

    suspend fun insertCategory(category: PoiCategory) {
        poiDao.insertCategory(category)
    }

    suspend fun updateCategory(category: PoiCategory) {
        poiDao.updateCategory(category)
    }

    suspend fun deleteCategory(category: PoiCategory) {
        poiDao.deleteCategory(category)
    }

    fun getLocationsByCategoryId(categoryId: Int): LiveData<List<PoiLocation>> {
        return poiDao.getLocationsByCategoryId(categoryId)
    }

    suspend fun insertLocation(location: PoiLocation) {
        poiDao.insertLocation(location)
    }

    suspend fun updateLocation(location: PoiLocation) {
        poiDao.updateLocation(location)
    }

    suspend fun deleteLocation(location: PoiLocation) {
        poiDao.deleteLocation(location)
    }

}