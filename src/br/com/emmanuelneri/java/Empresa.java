package br.com.emmanuelneri.java;

import java.time.LocalDateTime;
import java.util.Objects;

public class Empresa {

    private String cnpj;
    private LocalDateTime data = LocalDateTime.now();

    public Empresa(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(cnpj, empresa.cnpj) &&
                Objects.equals(data, empresa.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj, data);
    }
}
