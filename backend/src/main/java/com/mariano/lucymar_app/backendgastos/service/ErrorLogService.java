package com.mariano.lucymar_app.backendgastos.service;
import lombok.Data;
import com.mariano.lucymar_app.backendgastos.model.ErrorLog;
import com.mariano.lucymar_app.backendgastos.repository.ErrorLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ErrorLogService {

    @Autowired
    private ErrorLogRepository errorLogRepository;

    public void registrarError(String codigo, String mensaje, String detalle) {
        ErrorLog error = new ErrorLog();
        error.setCodigoError(codigo);
        error.setMensajeError(mensaje);
        error.setDetalleError(detalle);
        errorLogRepository.save(error);
    }
}
