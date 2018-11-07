package co.edu.pdam.eci.persistenceapiintegration.data.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * @author Santiago Carrillo
 */

//TODO add database annotations and proper model structure
@Entity
public class Team{

    @PrimaryKey
    private Long id;
    @ColumnInfo(name= "name")
    private String name;
    @ColumnInfo(name= "short_name")
    private String shortName;
    public Team(){}


    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

}
