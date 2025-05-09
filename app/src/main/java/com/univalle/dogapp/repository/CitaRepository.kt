package com.univalle.dogapp.repository

import androidx.lifecycle.LiveData
import com.univalle.dogapp.Model.Cita
import com.univalle.dogapp.data.CitaDao

class CitaRepository(private val citaDao: CitaDao) {
    fun obtenerCitaPorId(id: Int): LiveData<Cita> = citaDao.obtenerCitaPorId(id)
    suspend fun insertar(cita: Cita) = citaDao.insertar(cita)
    suspend fun actualizar(cita: Cita) = citaDao.actualizar(cita)
    suspend fun eliminar(cita: Cita) = citaDao.eliminar(cita)
}
