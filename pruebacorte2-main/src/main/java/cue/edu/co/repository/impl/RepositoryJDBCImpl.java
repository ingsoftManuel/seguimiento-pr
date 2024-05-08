package cue.edu.co.repository.impl;

import cue.edu.co.config.DatabaseConnection;
import cue.edu.co.mapping.dtos.VehiclesDto;
import cue.edu.co.mapping.mappers.Mapper;
import cue.edu.co.models.Vehicles;
import cue.edu.co.repository.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RepositoryJDBCImpl implements Repository<VehiclesDto> {

   private Connection conn;

    private Vehicles createStudent(ResultSet resultSet) throws SQLException {
        Vehicles vehicles = new Vehicles();
        vehicles.setId(resultSet.getLong("id"));
        vehicles.setName(resultSet.getString("nombre"));
        vehicles.setType(resultSet.getString("tipo"));
        vehicles.setAvailable(resultSet.getBoolean("disponible"));
        return vehicles;
    }

    @Override
    public List<VehiclesDto> list()  throws SQLException{
        List<VehiclesDto> vehicle = new ArrayList<>();
        try (Statement stmt= conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from vehicles") ){
            while (rs.next()){
                Vehicles vehicles = createvehicles(rs);
                VehiclesDto vehiclesDto = Mapper.mapFrommodel(vehicles);
                vehicle.add(vehiclesDto);
            }

        }  return vehicle;

    }

    private Vehicles createvehicles(ResultSet rs) {
        return null;
    }

    @Override
    public VehiclesDto byId(int id) {
        return null;
    }

    @Override
    public void save(VehiclesDto vehiclesDto) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(VehiclesDto vehiclesDto) {

    }
}
