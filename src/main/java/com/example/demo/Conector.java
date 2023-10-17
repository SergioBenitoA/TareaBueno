package com.example.demo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Conector {
    private Connection conexion;
    public Conector() {
        // Constructor para inicializar la conexión
        try {
            // Inicializa 'connection' aquí, por ejemplo:
            conexion = DriverManager.getConnection("jdbc:mysql://" + "localhost" + ":" + "3306" + "/" + "tareas" + "?serverTimezone=UTC",
                    "root", "toor");
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de errores
        }
    }

    public Connection getConnection() {
        return conexion; // Devuelve la conexión
    }

    public void añadirTarea(Tarea tarea) throws SQLException {
        String sql = "INSERT INTO tareas (titulo, descripcion, dia) VALUES (?, ?, ?)";

        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1, tarea.getTitulo());
        sentencia.setString(2, tarea.getDescripcion());
        sentencia.setString(3, tarea.getDia());
        sentencia.executeUpdate();
    }

    public void eliminarTarea(Tarea tarea) throws SQLException {
        String sql = "DELETE FROM tareas WHERE titulo = ?";

        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1, tarea.titulo);
        sentencia.executeUpdate();
    }

    public void modificarTarea(Tarea tareaAntiguo, Tarea tareaNuevo) throws SQLException {
        String sql = "UPDATE tareas SET titulo = ?, descripcion = ?, dia = ? WHERE id = ?";

        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1, tareaNuevo.getTitulo());
        sentencia.setString(2, tareaNuevo.getDescripcion());
        sentencia.setString(3, tareaNuevo.getDia());
        sentencia.setInt(4, tareaAntiguo.getId());
        sentencia.executeUpdate();
    }

    public List<Tarea> obtenerTareas() throws SQLException {
        List<Tarea> tareas = new ArrayList<>();
        String sql = "SELECT * FROM tareas";

        PreparedStatement sentencia = conexion.prepareStatement(sql);
        ResultSet resultado = sentencia.executeQuery();
        while (resultado.next()) {
            Tarea tarea = new Tarea();
            tarea.setId(resultado.getInt(1));
            tarea.setTitulo(resultado.getString(2));
            tarea.setDescripcion(resultado.getString(3));
            tarea.setDia(resultado.getString(4));

            tareas.add(tarea);
        }

        return tareas;
    }

    public boolean existeTarea(String titulo) throws SQLException {
        String sql = "SELECT * FROM tareas WHERE titulo = ?";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        ResultSet resultado = sentencia.executeQuery();

        return resultado.next();
    }

}
