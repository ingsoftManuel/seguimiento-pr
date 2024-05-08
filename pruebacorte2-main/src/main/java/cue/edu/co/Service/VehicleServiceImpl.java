package cue.edu.co.Service;

import cue.edu.co.config.DatabaseConnection;
import cue.edu.co.mapping.mappers.Mapper;
import cue.edu.co.repository.Repository;
import cue.edu.co.models.Vehicles;
import cue.edu.co.repository.impl.RepositoryJDBCImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class VehicleServiceImpl implements VehicleService {

    @Override
    public List listVehicles() throws SQLException {
        return List.of();
    }
}