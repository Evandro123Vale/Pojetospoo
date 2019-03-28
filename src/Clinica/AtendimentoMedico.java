package Clinica;

public class AtendimentoMedico {
    String data, endereço;
    double valorConsulta;
    Medico medico;
    Paciente paciente;

    AtendimentoMedico(String data, String endereço,double valorConsulta,Paciente paciente, Medico medico
                      ){
        this.data = data;
        this.endereço = endereço;
        this.valorConsulta = valorConsulta;
        this.medico = medico;
        this.paciente = paciente;

    }
}
