package co.edu.pdam.eci.persistenceapiintegration.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import co.edu.pdam.eci.persistenceapiintegration.data.entity.Team;

/**
 * @author Santiago Carrillo
 */
@Dao
public interface TeamDao extends BaseDao<Team, Long> {
    @Query("SELECT * FROM teams")
    List<Team> getAll();

    @Query("SELECT * FROM teams WHERE uid IN (:teamIds)")
    List<Team> loadAllByIds(int[] teamIds);

    @Query("SELECT * FROM teams WHERE id LIKE :id AND " +
            "team_name LIKE :name LIMIT 1")
    Team findByName(Long id, String name);

    @Insert
    void insertAll(Team... users);

    @Delete
    void delete(Team user);


}
