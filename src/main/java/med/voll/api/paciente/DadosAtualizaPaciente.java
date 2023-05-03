package med.voll.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;
import med.voll.api.endereco.Endereco;

public record DadosAtualizaPaciente(
        @NotNull
        Long id,
        String nome,

        @Pattern(regexp = "\\d{9,13}")
        String telefone,

        @Valid
        DadosEndereco endereco) {
}
