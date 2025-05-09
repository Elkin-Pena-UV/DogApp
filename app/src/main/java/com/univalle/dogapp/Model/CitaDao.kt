package com.univalle.dogapp.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.univalle.dogapp.Model.Cita

@Dao
interface CitaDao {
    @Query("SELECT * FROM citas WHERE id = :id")
    fun obtenerCitaPorId(id: Int): LiveData<Cita>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertar(cita: Cita)

    @Update
    suspend fun actualizar(cita: Cita)

    @Delete
    suspend fun eliminar(cita: Cita)
}
