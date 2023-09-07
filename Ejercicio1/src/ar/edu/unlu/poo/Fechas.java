package ar.edu.unlu.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fechas {
    public LocalDate parseFecha(String fecha, String formato) {
        DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern(formato);
        return LocalDate.parse(fecha, fechaFormateada);
    }

    public boolean fechaEntre(LocalDate fecha, LocalDate fechaInicio, LocalDate fechaFin) {
        return (fecha.isAfter(fechaInicio)) && (fecha.isBefore(fechaFin));
    }

    public boolean fechaEsMayor(LocalDate fecha, LocalDate fechaReferencia) {
        return fecha.isAfter(fechaReferencia);
    }

    public static boolean fechaEsMenor(LocalDate fecha, LocalDate fechaReferencia) {
        return fecha.isBefore(fechaReferencia);
    }
}
